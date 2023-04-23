package Generalidad;

/* Estandar
Debe ser una sola letra mayuscula

E: Para elemetos
N: Numeros
K: Clabe
V: Valor
T: Tipo de dato de Java
 */
public class ClaseGenerica<T> {

    private T elemento;


    public T getElemento() {
        return this.elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
}
