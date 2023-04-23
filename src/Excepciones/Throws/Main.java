package Excepciones.Throws; // Permite agregar clausulas de excepciones al final de la cabecera del método para indicar los posibles errores

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Ficheros primero = new Ficheros("Prueba.txt");

        try {
            primero.escribirFichero("Hola Mundo!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}