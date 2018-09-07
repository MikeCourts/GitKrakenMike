import java.util.Date;
import java.util.List;

public class DigitalHouseManager {
    private List<Alumno> listaAlumnos;
    private List<Profesor> listaProfesores;
    private List<Curso> listaCursos;
    private List<Inscripcion> listaInscripciones;

    public DigitalHouseManager(List<Alumno> listaAlumnos, List<Profesor> listaProfesores, List<Curso> listaCursos, List<Inscripcion> listaInscripciones) {
        this.listaAlumnos = listaAlumnos;
        this.listaProfesores = listaProfesores;
        this.listaCursos = listaCursos;
        this.listaInscripciones = listaInscripciones;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public List<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public List<Inscripcion> getListaInscripciones() {
        return listaInscripciones;
    }

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
        listaCursos.add(new Curso(nombre, codigoCurso, cupoMaximoDealumnos));
        System.out.println("Se dio de alta el siguiente curso: ");
        System.out.println("Nombre de curso: " + nombre);
        System.out.println("Codigo de curso: " + codigoCurso);
        System.out.println("Cupo Maximo de alumnos: " + cupoMaximoDealumnos);
        System.out.println("-------------------");
    }

    public void bajaCurso(Integer codigoCurso) {
        for (Curso curso : listaCursos) {
            if (codigoCurso.equals(curso.getCodigoCurso())) {
                listaCursos.remove(curso);
                break;
            }
        }
        System.out.println("Se dio de baja el curso con codigo: " + codigoCurso);
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        listaProfesores.add(new ProfesorAdjunto(nombre, apellido, 0, codigoProfesor, cantidadDeHoras));
        System.out.println("Se dio de alta al profesor adjunto: ");
        System.out.println("Nombre y apellido: " + nombre + " " + apellido);
        System.out.println("Codigo Profesor: " + codigoProfesor);
        System.out.println("Cantidad de Horas para consultas: " + cantidadDeHoras);
        System.out.println("-------------------");
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        listaProfesores.add(new ProfesorTitular(nombre, apellido, 0, codigoProfesor, especialidad));
        System.out.println("Se dio de alta al profesor titular: ");
        System.out.println("Nombre y apellido: " + nombre + " " + apellido);
        System.out.println("Codigo Profesor: " + codigoProfesor);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("-------------------");
    }

    public void bajaProfesor(Integer codigoProfesor) {
        for (Profesor profesor : listaProfesores) {
            if (codigoProfesor.equals(profesor.getCodigoProfesor())) {
                listaProfesores.remove(profesor);
                break;
            }
        }
        System.out.println("Se dio de baja el profesor con codigo: " + codigoProfesor);
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno alumnoNuevo = new Alumno(nombre, apellido, codigoAlumno);
        listaAlumnos.add(alumnoNuevo);
        System.out.println("Se dio de alta exitosamente al alumno " + alumnoNuevo.getNombre() + " " + alumnoNuevo.getApellido());
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
        Alumno unAlumno = null;
        Curso unCurso = null;
        for (Curso curso : listaCursos) {
            if (codigoCurso.equals(curso.getCodigoCurso())) {
                unCurso = curso;
                break;
            }
        }
        for (Alumno alumno : listaAlumnos) {
            if (codigoAlumno.equals(alumno.getCodigoAlumno())) {
                unAlumno = alumno;
                break;
            }
            //unCurso.agregarUnAlumno(alumno);
        }
        if (unCurso.agregarUnAlumno(unAlumno)) {
            Inscripcion inscripcion = new Inscripcion(unAlumno, unCurso, new Date());
            listaInscripciones.add(inscripcion);
            System.out.println("Se ha realizado la inscripcion # " + inscripcion + " para el alumno " + unAlumno.getNombre() + " " + unAlumno.getApellido());
        } else {
            System.out.println("No se pudo inscibir al alumno " + unAlumno.getNombre() + " " + unAlumno.getApellido() + " por falta de cupo");
        }

    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {
        System.out.println("***Asignar Profesores a curso***");

        Profesor profesorTitular = null;
        Profesor profesorAdjunto = null;
        for (Profesor profesorTit : listaProfesores) {
            if (profesorTit.getCodigoProfesor().equals(codigoProfesorTitular)) {
                profesorTitular = profesorTit;
                break;
            }
        }
        for (Profesor profesorAdj : listaProfesores) {
            if (profesorAdj.getCodigoProfesor().equals(codigoProfesorAdjunto)) {
                profesorAdjunto = profesorAdj;
                break;
            }
        }

        for (Curso curso : listaCursos) {
            if (curso.getCodigoCurso().equals(codigoCurso)) {
                if (profesorAdjunto != null) {
                    curso.setProfesorAdjunto(profesorAdjunto);
                    System.out.println("Se asigno el profesor adjunto " + profesorAdjunto.getNombre() + " " + profesorAdjunto.getApellido() + " al curso " + curso.getNombre());


                } else {
                    System.out.println("No se encontro al profesor adjunto");
                }
                if (profesorTitular != null) {
                    curso.setProfesorTitularr(profesorTitular);
                    System.out.println("Se asigno el profesor titular " + profesorTitular.getNombre() + " " + profesorTitular.getApellido() + " al curso " + curso.getNombre());
                    System.out.println("--------------------");
                } else {
                    System.out.println("No se encontro al profesor titular");
                }
            }
        }

    }


}
