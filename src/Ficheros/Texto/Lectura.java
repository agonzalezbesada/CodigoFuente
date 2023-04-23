package Ficheros.Texto;
import java.io.FileReader; // Necesaria importación
import java.io.IOException;

 class Lectura {

     void leer() {

        FileReader lee; // Inicializar previamente

        try { // Siempre operar dentro de try/catch
            lee = new FileReader("G:\\Mi unidad\\DAW\\PROG\\EJERCICIOS\\Codigos\\src\\Ficheros\\Texto\\EscritoTexto.txt"); // (ruta) Debe existir siempre
            int caracter = lee.read(); // Muestra el primer elemento de la cola en forma de código de caracter

            while (caracter != -1) {
                char imprimir = (char) caracter; // Convertimos el código de caracter a un char
                System.out.println(imprimir); // Se imprimen de una en uno en uno los char
                caracter = lee.read(); // Lo igualamos al siguiente de la cola (el final del fichero es -1)
            }

            lee.close(); // Cerramos

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
