package Listas.IndexadasDinamicas; // Permiten personalizar los datos y sus posiciones - eficiencia
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listaEnteros = new ArrayList<>(); // Debe asignarse una entidad u objeto <X> (el segundo <"X"> no es necesario)

        listaEnteros.add(3); // Introducir elemento
        listaEnteros.add(2);
        listaEnteros.add(1);

        listaEnteros.remove(2); // Eliminar dado un índice, también dado un objeto, pero la referencia debe ser exacta

        System.out.println(listaEnteros.toString()); // Ver todos los elementos de la lista

        System.out.println(listaEnteros.get(0)); // Ver un valor dado un índice .get(i)

        System.out.println(listaEnteros.size()); // ==.length Permite ver el tamaño de la lista

        listaEnteros.sort(Comparator.naturalOrder()); // Ordena un array numérico ASC

        System.out.println(listaEnteros.toString());




    }
}
