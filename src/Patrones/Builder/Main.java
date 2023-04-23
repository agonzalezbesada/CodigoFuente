package Patrones.Builder; // Permite crear objetos muy similares y muy personalizables ahorrando código
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);

        Pizzas pizza1 = new BuilderPizzas().build(); // Pizza predeterminada

        System.out.println(pizza1.toString());

        Pizzas pizza2 = new BuilderPizzas().setJamon(true).setMasa(1).build(); // Pizza personalizada usando .setX después de los () del builder y terminado en .build();

        System.out.println(pizza2.toString());

    }
}
