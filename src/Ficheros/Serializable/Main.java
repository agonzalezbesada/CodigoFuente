package Ficheros.Serializable; // Permite transformar objetos en un stream de bytes (texto)

public class Main {
    public static void main(String[] args) {

        EscrituraSerializar escrituraSerializador = new EscrituraSerializar();
        escrituraSerializador.escribir();

        LecturaSerializar lecturaSerializar = new LecturaSerializar();
        lecturaSerializar.leer();

    }
}
