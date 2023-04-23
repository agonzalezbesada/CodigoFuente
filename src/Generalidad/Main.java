package Generalidad; // Permite adaptar las clases para múltiples usos | Sólo pueden generalizarse objetos

public class Main {
    public static void main(String[] args) {

        ClaseGenerica<Integer> enteroGenerico = new ClaseGenerica<Integer>(); // Declaramos el objeto <>Indica el tipo de objeto

        enteroGenerico.setElemento(2); // Asignamos valor

        ClaseGenerica<String> textoGenerico = new ClaseGenerica<>(); // El segundo <"X"> no es necesario

        textoGenerico.setElemento("Hola Mundo");

        System.out.println(enteroGenerico.getElemento()); // Recogemos valor

        System.out.println(textoGenerico.getElemento());

    }
}
