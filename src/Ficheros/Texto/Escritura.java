package Ficheros.Texto;
import java.io.FileWriter; // Necesaria importación
import java.io.IOException;

 class Escritura {


     void escribir() {

        FileWriter escribe; // Inicializar previamente

        try { // Siempre operar dentro de try/catch
            escribe = new FileWriter("G:\\Mi unidad\\DAW\\PROG\\EJERCICIOS\\Codigos\\src\\Ficheros\\Texto\\EscritoTexto.txt"); // (ruta) Puede no existir aún
            escribe.write("Hola Mundo!"); // (texto) Debe ser String o Char
            escribe.close(); // Siempre cerrar + guarda los cambios

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
