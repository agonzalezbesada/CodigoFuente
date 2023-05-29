package Ficheros.Binario;
import java.io.*;

class Escritura {

    void escribir() {

        FileOutputStream escrituraBytes; // Escribe en el fichero bytes
        OutputStreamWriter textoABytes; // Transforma caracteres a bytes
        BufferedWriter buffer; // Almacena la información de texto + eficiencia

        try {
            escrituraBytes = new FileOutputStream("src\\Ficheros\\Binario\\EscritoBytes.txt"); // (ruta) Puede no existir aún
            textoABytes = new OutputStreamWriter(escrituraBytes);
            buffer = new BufferedWriter(textoABytes);

            buffer.write("Hola Mundo!");

            buffer.close(); // Cerramos
            textoABytes.close();
            escrituraBytes.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
