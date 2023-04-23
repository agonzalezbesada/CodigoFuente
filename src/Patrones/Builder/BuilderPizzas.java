package Patrones.Builder; // Permite crear objetos muy similares y muy personalizables ahorrando código

public class BuilderPizzas {

    protected Pizzas _pizza; // Instancia de la pizza vacía

    public BuilderPizzas() {
        _pizza = new Pizzas(); // El constructor crea la instancia
    }

    public Pizzas build() { // Devuelve la instancia de la pizza

        return this._pizza;
    }

    // MÉTODOS DE PERSONALIZACIÓN

    public BuilderPizzas setMasa(int masa) {
        _pizza.setMasa(masa);
        return this;
    }

    public BuilderPizzas setTamano(int tamano) {
        _pizza.setTamano(tamano);
        return this;
    }

    public BuilderPizzas setSalsa(boolean salsa) {
        _pizza.setSalsa(salsa);
        return this;
    }

    public BuilderPizzas setJamon(boolean jamon) {
        _pizza.setJamon(jamon);
        return  this;
    }

    public BuilderPizzas setSinGluten(boolean sinGluten) {
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public BuilderPizzas setRecogida(int recogida) {
        _pizza.setRecogida(recogida);
        return this;
    }

}
