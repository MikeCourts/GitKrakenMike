public class Gladiador {
    private String nombre;
    private Integer vida;
    private Integer ataque;
    private Integer defensa;

    public Gladiador(String nombre, Integer vida, Integer ataque, Integer defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getVida() {
        return vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public Integer getDefensa() {
        return defensa;
    }
}
