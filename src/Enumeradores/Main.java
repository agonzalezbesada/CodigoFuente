package Enumeradores; // Constantes con nombre especial, y usarlos como "clases" con atrubutos constantes y métodos

public class Main {
    public static void main(String[] args) {

        Mes mes_actual = Mes.ENERO; // Sin instanciar el enumerador

        System.out.println("El mes tiene " + mes_actual.getDias() + "dias, " + mes_actual.calculoHoras() + " horas...");

        switch (mes_actual) {

            case ENERO:
                System.out.println("El mes actual es Enero");
                break;

            case FEBRERO:
                System.out.println("El mes actual es ");
                break;

            case MARZO:
                System.out.println("El mes actual es Marzo");
                break;

            case ABRIL:
                System.out.println("El mes actual es Abril");
                break;

            case MAYO:
                System.out.println("El mes actual es Mayo");
                break;

            case JUNIO:
                System.out.println("El mes actual es Junio");
                break;

            case JULIO:
                System.out.println("El mes actual es Julio");
                break;

            case AGOSTO:
                System.out.println("El mes actual es Agosto");
                break;

            case SEPTIEMBRE:
                System.out.println("El mes actual es Septiembre");
                break;

            case OCTUBRE:
                System.out.println("El mes actual es Octubre");
                break;

            case NOVIEMBRE:
                System.out.println("El mes actual es Nobiembre");
                break;

            case DICIEMBRE:
                System.out.println("El mes actual es Diciembre");
                break;
        }
    }
}
