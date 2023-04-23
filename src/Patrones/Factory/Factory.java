package Patrones.Factory; // Sirve para instanciar objetos de manera automática

public class Factory implements IComun { // Factory que implementa la interfaz


    public static final int CAMION = 1;

    public static final int BICICLETA = 2;


    public static IComun getTransporte(int tipo) { // Método estático que devuelve los objetos

        switch (tipo) {

            case 1:

                return new Camion(); // Devuelve un objeto de tipo Camion

            case 2:

                return new Bicicleta(); // Devuelve un objeto de tipo Bicicleta
        }

        return null; // Retorna null en caso de que no coincida

    }




}
