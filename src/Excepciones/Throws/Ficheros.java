package Excepciones.Throws; // Permite agregar clausulas de excepciones al final de la cabecera del método para indicar los posibles errores
import java.io.*; // No pertenece a Throws

class Ficheros {

    private String fichero;

    Ficheros() {

    }

    Ficheros(String fichero) {
        this.fichero = "src\\Excepciones\\Throws\\Fichero.txt";
    }

    public void escribirFichero(String texto) throws IOException { // Añadimos el Throws l final de la cabecera

        FileWriter fis = new FileWriter(this.fichero);
        fis.write(texto);
    }
}
