public class Gladiador {
    private String nombre;
    private Double vida;
    private Double ataque;
    private Double defensa;

    public Gladiador() {
    }

    public Gladiador(String nombre, Double vida, Double ataque, Double defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getVida() {
        return vida;
    }

    public Double getAtaque() {
        return ataque;
    }

    public Double getDefensa() {
        return defensa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(Double defensa) {
        this.defensa = defensa;
    }

    public void verInfoGladiador(){
        System.out.println("-------------");
        System.out.println("Atributos de " + getNombre() + ": ");
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("-------------");
    }
}
