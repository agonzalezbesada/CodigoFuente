package Ficheros.Serializable;
import java.io.*;

class EscrituraSerializar {

    void escribir() {

        FileOutputStream escrituraBytes; // Escribe en el fichero bytes
        ObjectOutputStream escrituraObjetos; // Transforma objetos a
        BufferedWriter buffer; // ELIMINAR?
        Vehiculo vehiculo = new Vehiculo(); // Instanciamos el objeto

        try {
            escrituraBytes = new FileOutputStream("src\\Ficheros\\Serializable\\Objeto.txt");
            escrituraObjetos = new ObjectOutputStream(escrituraBytes);

            escrituraObjetos.writeObject(vehiculo); // Escribimos el objeto
            escrituraObjetos.close(); // Cerramos
            escrituraBytes.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}