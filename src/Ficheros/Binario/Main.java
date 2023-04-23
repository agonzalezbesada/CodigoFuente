package Ficheros.Binario; // *Permite guardar objetos

public class Main {
    public static void main(String[] args) {

        Escritura escritura = new Escritura();
        escritura.escribir();

        Lectura lectura = new Lectura();
        lectura.leer();

    }
}
