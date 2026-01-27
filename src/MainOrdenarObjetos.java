import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MainOrdenarObjetos {
    public static void main(String[] args) {
        List<Estudiante> lista = new ArrayList<>(Arrays.asList(
            new Estudiante("Unai", 22, 8),
            new Estudiante("Hugo", 19, 7),
            new Estudiante("Glad", 25, 5),
            new Estudiante("Ramirez", 18, 6)
        ));

        lista.sort(Comparator.comparing(e -> e.getNombre()));
        System.out.println("Ordenar por nombre: " + lista);

        lista.sort(Comparator.comparing(e -> e.getEdad()));
        System.out.println("Ordenar por edad: " + lista);

        lista.sort(Comparator.comparing(e -> e.getNota()));
        System.out.println("Ordenar por nota: " + lista);
    }
}