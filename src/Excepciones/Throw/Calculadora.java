package Excepciones.Throw; // Permite "devolver" un error (Permite crear excepciones)

class Calculadora {

    public int sumaNatural(int valor1, int valor2) {

        int suma = valor1 + valor2;

        if (suma<0) {
            throw new NumberFormatException(); // Creamos la excepción
        }

        return suma;
    }
}
