package Patrones.Factory; // Sirve para instanciar objetos de manera automática
import java.util.Scanner;

public class Main {

    static IComun iComun; // Creamos un objeto estático del tipo de la interfaz

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Elija un tipo\n1. Camión \n2. Bicicleta");
        int tipo = entrada.nextInt();

        iComun = Factory.getTransporte(tipo); // igualamos el objeto de tipo interfaz al retorno de la factoría

    }
}
