import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorDeArchivosCSV {

    private List<String[]> listaImportada = new ArrayList<>();

    public List<String[]> getListaImportada() {
        return listaImportada;
    }

    public void leerCsvYAgregarALista(){

//        File file = new File("C:/Users/o21582/Documents/Trabajos IntelliJ/CSVFileReader/src/listadoDeAlumnos.csv");
        File file = new File("src/listadoDeAlumnos.csv");

        BufferedReader reader = null;
        try {
            FileReader fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);
            reader.readLine();
            String line = null;
            System.out.println("***Listado de Alumnos importados***");
            System.out.println("Codigo|" + "Nombre|" + "Apellido");
            while ((line = reader.readLine()) != null){
                String[] l = line.split(",");
                listaImportada.add(l);
                System.out.println(l[0] + " " + l[1] + " " + l[2]);
            }
        } catch (
                IOException e) {
            System.out.println("***no se encuentra el archivo csv***");
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
