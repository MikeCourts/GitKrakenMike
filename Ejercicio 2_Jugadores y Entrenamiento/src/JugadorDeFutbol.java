public class JugadorDeFutbol {

    //ATRIBUTOS
    private String nombre;
    private Integer energia;
    private Integer felicidad;
    private Integer goles;
    private Integer experiencia;

    //CONSTRUCTOR

    public JugadorDeFutbol(String nombre, Integer energia, Integer felicidad, Integer goles, Integer experiencia) {
        this.nombre = nombre;
        this.energia = energia;
        this.felicidad = felicidad;
        this.goles = goles;
        this.experiencia = experiencia;
    }


    //GETTERS


    public String getNombre() {
        return nombre;
    }

    public Integer getEnergia() {
        return energia;
    }

    public Integer getFelicidad() {
        return felicidad;
    }

    public Integer getGoles() {
        return goles;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    //SETTERS

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public void setFelicidad(Integer felicidad) {
        this.felicidad = felicidad;
    }

    public void setGoles(Integer goles) {
        this.goles = goles;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    //METODOS
    public void hacerGol() {
        energia = energia - 5;
        felicidad = felicidad + 10;
        goles = goles + 1;
        System.out.println("GOOOOOL!!!!" + " Energia: " + energia + " Felicidad: " + felicidad + " Goles: " +goles);

    }

    public void correr() {
        energia = energia - 10;
        System.out.println("No me dan mas las piernas" + " Energia: " + energia);
    }





}
