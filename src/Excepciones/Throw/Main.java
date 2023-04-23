package Excepciones.Throw; // Permite "devolver" un error (Permite crear excepciones)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer valor");
        int valor1 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Introduce el segundo valor");
        int valor2 = entrada.nextInt();
        entrada.nextLine();

        int suma = 0;

        try {
            suma = calc.sumaNatural(valor1, valor2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        System.out.println("La suma es " + suma);

    }
}
