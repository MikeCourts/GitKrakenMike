public class ProfesorAdjunto extends Profesor {
    private Integer cantidadHorasConsultas;

    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoProfesor) {
        super(nombre, apellido, antiguedad, codigoProfesor);
    }

    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoProfesor, Integer cantidadHorasConsultas) {
        super(nombre, apellido, antiguedad, codigoProfesor);
        this.cantidadHorasConsultas = cantidadHorasConsultas;
    }

    public Integer getCantidadHorasConsultas() {
        return cantidadHorasConsultas;
    }
}
