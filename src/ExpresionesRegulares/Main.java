package ExpresionesRegulares; // Sirven para encontrar valores concretos o comparar elementos
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

        Pattern patron1 = Pattern.compile("\\d+"); // Indicamos las reglas
        Matcher coincidencia = patron1.matcher("Hola Mundo 0"); // Otorgamos el texto

        if (coincidencia.find()) { // .find() = Hay alguna coincidencia con la regla?
            System.out.println("Hay un número");
        } else {
            System.out.println("No hay números");
        }

        Pattern patron2 = Pattern.compile("[a-zA-Z ]+"); // Indicamos las reglas
        Matcher coincidencia2 = patron2.matcher("Hola Mundo 2"); // Otorgamos el texto

        if (coincidencia.matches()) { // .match() = La cadena se corresponde con las reglas?
            System.out.println("Solo hay caracteres alfabéticos");
        } else {
            System.out.println("Hay más que letras");
        }
    }
}
