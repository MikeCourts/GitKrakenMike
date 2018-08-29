public class Main {

    public static void main(String[] args) {
	// write your code here
        Foto fotoUno = new Foto();
        Contrato contratoUno = new Contrato();
        Word wordUno = new Word();
        Contrato contratoDos = new Contrato();
        Word wordDos = new Word();
        Foto fotoDos = new Foto();
        Impresora impresora = new Impresora();
        impresora.agregarImprimible(fotoDos);
        impresora.agregarImprimible(fotoUno);
        impresora.agregarImprimible(wordDos);
        impresora.agregarImprimible(wordUno);
        impresora.agregarImprimible(contratoDos);
        impresora.agregarImprimible(contratoUno);

        impresora.imprimirTodo();

        impresora.agregarImprimible(wordDos);
        impresora.imprimirTodo();



    }
}
