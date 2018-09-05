public class ProfesorTitular extends Profesor {
    private String especialidad;

    public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigoProfesor) {
        super(nombre, apellido, antiguedad, codigoProfesor);
    }

    public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigoProfesor, String especialidad) {
        super(nombre, apellido, antiguedad, codigoProfesor);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
