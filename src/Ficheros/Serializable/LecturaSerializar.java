package Ficheros.Serializable;
import java.io.*;

class LecturaSerializar {

    void leer() {

        FileInputStream lecturaBytes;
        ObjectInputStream lecturaObjetos;
        Vehiculo vehiculo;

        try {
            lecturaBytes = new FileInputStream("src\\Ficheros\\Serializable\\Objeto.txt"); // (ruta) Debe existir siempre
            lecturaObjetos = new ObjectInputStream(lecturaBytes);

            vehiculo = (Vehiculo) lecturaObjetos.readObject(); // Leemos el objeto y lo instanciamos casteando a su tipo
            System.out.println(vehiculo.toString()); // Mostramos el objeto
            lecturaObjetos.close(); // Cerramos
            lecturaBytes.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
