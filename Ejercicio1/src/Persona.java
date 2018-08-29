public class Persona {
    private String nombre;
    private Integer dni;



    public Persona(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }

    public boolean equals(Object obj){
        Persona otraPersona = (Persona) obj;
        return this.dni.equals(otraPersona.getDni());
    }


}
