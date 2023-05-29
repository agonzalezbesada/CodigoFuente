package Ficheros.Binario;
import java.io.*;


class Lectura {


    void leer() {

        FileInputStream lecturaBytes; // Lee el fichero de bytes
        InputStreamReader bytesATexto; // Transforma bytes a caracteres
        BufferedReader buffer; // Almacena y transforma en texto + eficiencia

        try {
            lecturaBytes = new FileInputStream("src\\Ficheros\\Binario\\EscritoBytes.txt"); // (ruta) Debe existir siempre
            bytesATexto = new InputStreamReader(lecturaBytes);
            buffer = new BufferedReader(bytesATexto);
            int caracter = buffer.read(); // Muestra el primer elemento de la cola en forma de código de caracter

            while (caracter != -1) {
                char texto = (char) caracter; // Convertimos el código de caracter a un char
                System.out.println(texto);  // Se imprimen de una en uno en uno los char
                caracter = buffer.read(); // Lo igualamos al siguiente de la cola (el final del fichero es -1)
            }

            buffer.close(); // Cerramos
            bytesATexto.close();
            lecturaBytes.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
