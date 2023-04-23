package Patrones.Singleton; // Permite crear una clase que sólo puede instanciarse una vez, y desde la misma clase

public class Singleton {

    private static Singleton instance = null; // Creamos un objeto instance igualado a null (El cual contendrá la instancia)

    private Singleton() { // No puede ser instanciado desde fuera ya que el constructor es private

    }

    public static Singleton getInstance() { // Creamos la clase estática que proveerá la instancia

        if (instance==null) { // Si instance es igual a null, creamos la instancia
            instance = new Singleton();
        }

        return instance; // Devolvemos la instancia
    }
}