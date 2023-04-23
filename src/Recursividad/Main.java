package Recursividad; //

public class Main {
    public static void main(String[] args) {

        int valorFactorial;

        valorFactorial = funcionFactorial(4);
        System.out.println("El valor es " + valorFactorial);

    }

    public static int funcionFactorial(int valor_final) {

        if (valor_final==0) {
            return 1;
        }

        return valor_final * funcionFactorial(valor_final-1);

    }

}
