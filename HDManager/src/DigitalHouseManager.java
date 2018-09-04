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

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos){
        listaCursos.add(new Curso(nombre, codigoCurso, cupoMaximoDealumnos));
    }

    public void bajaCurso(Integer codigoCurso){
        for (Curso curso: listaCursos) {
            if(codigoCurso.equals(curso.getCodigoCurso())){
                listaCursos.remove(curso);
                break;
            }
        }
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras){
        listaProfesores.add(new ProfesorAdjunto(nombre, apellido, 0, codigoProfesor, cantidadDeHoras));
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){
        listaProfesores.add(new ProfesorTitular(nombre, apellido, 0, codigoProfesor, especialidad));
    }

    public void bajaProfesor(Integer codigoProfesor){
        for (Profesor profesor: listaProfesores) {
            if (codigoProfesor.equals(profesor.getCodigoProfesor())){
                listaProfesores.remove(profesor);
                break;
            }
        }
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){
        Alumno alumnoNuevo = new Alumno(nombre, apellido, codigoAlumno);
        listaAlumnos.add(alumnoNuevo);
        System.out.println("Se dio de alta exitosamente al alumno " + alumnoNuevo.getNombre() + " " + alumnoNuevo.getApellido());
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso){
        Alumno unAlumno = null;
        Curso unCurso = null;
        for (Curso curso: listaCursos) {
            if (codigoCurso.equals(curso.getCodigoCurso())){
                unCurso = curso;
                break;
            }
        }
        for (Alumno alumno: listaAlumnos) {
            if (codigoAlumno.equals(alumno.getCodigoAlumno())){
                unAlumno = alumno;
                break;
            }
            //unCurso.agregarUnAlumno(alumno);
        }
        if (unCurso.agregarUnAlumno(unAlumno)){
            Inscripcion inscripcion = new Inscripcion(unAlumno, unCurso, new Date());
            listaInscripciones.add(inscripcion);
            System.out.println("Se ha realizado la inscripcion # " + inscripcion + " para el alumno " + unAlumno.getNombre() + " " + unAlumno.getApellido());
        } else {
            System.out.println("No se pudo inscibir al alumno " + unAlumno.getNombre() + " " + unAlumno.getApellido() + " por falta de cupo");
        }

    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){
        Profesor profesorTitular = null;
        Profesor profesorAdjunto = null;
        for (Profesor profesorTit: listaProfesores) {
            if (profesorTit.getCodigoProfesor().equals(profesorTitular)){
                profesorTitular = profesorTit;
                break;
            }
        }
        for (Profesor profesorAdj: listaProfesores) {
            if (profesorAdjunto.getCodigoProfesor().equals(profesorAdj)){
                profesorAdjunto = profesorAdj;
                break;
            }
        }

        for (Curso curso: listaCursos) {
            if(curso.getCodigoCurso().equals(codigoCurso)){
                curso.setProfesorAdjunto(profesorAdjunto);
                curso.setProfesorTitularr(profesorTitular);
            }
        }
    }




}
