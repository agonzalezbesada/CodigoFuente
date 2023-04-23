package Patrones.Builder;

public class Pizzas {

    // Atributos
    private int masa;
    private int tamano;
    private boolean salsa;
    private boolean jamon;
    private boolean sinGluten;
    private int recogida;

    // Tipos de masa
    public static final int NORMAL = 0;
    public static final int FINA = 1;

    // Tamaños de la pizza
    public static final int PEQUENA = 0;
    public static final int MEDIANA = 1;
    public static final int GRANDE = 2;

    // Tipos de recogida
    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1;

    public Pizzas() { // Constructor vacío con alores predeterminados de la pizza
        this.masa = NORMAL;
        this.tamano = MEDIANA;
        this.salsa = true;
        this.jamon = true;
        this.sinGluten = false;
        this.recogida = TIENDA;
    }

    public Pizzas(int masa, int tamano, boolean salsa, boolean jamon, boolean sinGluten, int recogida) { // Constructor parametrizado con valores personalizados
        this.masa = masa;
        this.tamano = tamano;
        this.salsa = salsa;
        this.jamon = jamon;
        this.sinGluten = sinGluten;
        this.recogida = recogida;
    }

    // GETTERS Y SETTERS

    public int getMasa() {
        return this.masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public boolean getSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public boolean getJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean getSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public int getRecogida() {
        return recogida;
    }

    public void setRecogida(int recogida) {
        this.recogida = recogida;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "masa=" + masa +
                ", tamano=" + tamano +
                ", salsa=" + salsa +
                ", jamon=" + jamon +
                ", sinGluten=" + sinGluten +
                ", recogida=" + recogida +
                '}';
    }
}
