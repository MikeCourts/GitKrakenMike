import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager(new ArrayList<>(),
                new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        digitalHouseManager.altaProfesorTitular("Peter", "Waquim", 11, "Star Wars");
        digitalHouseManager.altaProfesorTitular("Patricio", "Ugarte", 12, "Mate");

        digitalHouseManager.altaProfesorAdjunto("Marcos", "Perez", 21, 10);
        digitalHouseManager.altaProfesorAdjunto("Juan", "Soledad", 22, 12);

        digitalHouseManager.altaCurso("Full Stack", 20001, 3);
        digitalHouseManager.altaCurso("Android", 20002, 2);

        digitalHouseManager.asignarProfesores(20001, 11, 21);
        digitalHouseManager.asignarProfesores(20002, 12, 22);

        digitalHouseManager.altaAlumno("qwe", "ewq", 31);
        digitalHouseManager.altaAlumno("asd", "dsa", 32);
        digitalHouseManager.altaAlumno("zxc", "czx", 33);

        digitalHouseManager.inscribirAlumno(31, 20001);
        digitalHouseManager.inscribirAlumno(32, 20001);
        digitalHouseManager.inscribirAlumno(31, 20002);
        digitalHouseManager.inscribirAlumno(32, 20002);
        digitalHouseManager.inscribirAlumno(33, 20002);

        digitalHouseManager.bajaProfesor(21);
        digitalHouseManager.bajaCurso(20002);

        LectorDeArchivosCSV lectorDeArchivosCSV = new LectorDeArchivosCSV();
        lectorDeArchivosCSV.leerCsvYAgregarALista();
        digitalHouseManager.altaCurso("Mobile Android", 20003, 25);

        for (Integer i = 0; i < lectorDeArchivosCSV.getListaImportada().size();i++){
            String[] lista;
            lista = lectorDeArchivosCSV.getListaImportada().get(i);
            Integer codigo = Integer.valueOf(lista[0]);
            String nombre = lista[1];
            String apellido = lista[2];
            digitalHouseManager.altaAlumno(nombre,apellido,codigo);
            digitalHouseManager.inscribirAlumno(codigo, 20003);

        }


    }
}
