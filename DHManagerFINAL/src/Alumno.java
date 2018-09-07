import com.digitalhouse.Estudioso;

import java.util.Objects;

public class Alumno implements Estudioso {
    private String nombre;
    private String apellido;
    private Integer codigoAlumno;

    public Alumno(String nombre, String apellido, Integer codigoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAlumno = codigoAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCodigoAlumno() {
        return codigoAlumno;
    }

    @Override
    public boolean equals(Object obj){
        Alumno otroAlumno = (Alumno) obj;
        return this.codigoAlumno.equals(otroAlumno.getCodigoAlumno());
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigoAlumno);
    }


    @Override
    public Boolean esEstudioso() {
        Boolean esPar = codigoAlumno % 2 == 0;
        return esPar;
    }
}
