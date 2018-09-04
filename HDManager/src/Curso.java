import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private Integer codigoCurso;
    private Profesor profesorTitularr;
    private Profesor profesorAdjunto;
    private Integer cupoMaximoAlumnos;
    private List<Alumno> listaAlumnosInscriptos = new ArrayList<>();

    public Curso(String nombre, Integer codigoCurso, Integer cupoMaximoAlumnos) {
        this.nombre = nombre;
        this.codigoCurso = codigoCurso;
        this.cupoMaximoAlumnos = cupoMaximoAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public Profesor getProfesorTitularr() {
        return profesorTitularr;
    }

    public Profesor getProfesorAdjunto() {
        return profesorAdjunto;
    }

    public Integer getCupoMaximoAlumnos() {
        return cupoMaximoAlumnos;
    }

    public List<Alumno> getListaAlumnosInscriptos() {
        return listaAlumnosInscriptos;
    }

    public void setProfesorTitularr(Profesor profesorTitularr) {
        this.profesorTitularr = profesorTitularr;
    }

    public void setProfesorAdjunto(Profesor profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }

    public Boolean agregarUnAlumno(Alumno unAlumno){
        boolean hayCupo = listaAlumnosInscriptos.size() < cupoMaximoAlumnos;
        if(hayCupo){
            listaAlumnosInscriptos.add(unAlumno);
        }
        return hayCupo;
    }



    public void eliminarAlumno(Alumno unAlumno){
        listaAlumnosInscriptos.remove(unAlumno);
    }


    @Override
    public boolean equals(Object obj) {
        Curso otroCurso = (Curso) obj;
        return this.codigoCurso.equals(otroCurso.getCodigoCurso());
    }
}
