package Map.HashMap; // Estructura basada en clave-valor
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Map<String,String> persona = new HashMap<>(); // <clave,valor> El segundo <x,y>No es necesario. <x,y> No estan obligados a ser del mismo tipo, permite incluso objetos
        persona.put("1","Adrian"); // Asignamos valores
        persona.put("2","Alfred");
        persona.put("1","FakeTaxi"); // Usar la misma clave substituye el anterior
        System.out.println(persona.toString());

    }
}
