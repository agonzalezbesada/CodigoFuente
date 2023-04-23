package Enumeradores; // Constantes con nombre especial, y usarlos como "clases" con atrubutos constantes y métodos

enum Mes { // Tipo de clase especial "enum", estática

    ENERO(31),FEBRERO(28),MARZO(31),ABRIL(30),MAYO(31),JUNIO(30),JULIO(31),AGOSTO(31),SEPTIEMBRE(30),OCTUBRE(31),NOVIEMBRE(30),DICIEMBRE(31);

    private final int dias;

    Mes(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public double calculoHoras() {
        return (double) (dias * 24.0d);
    }

    public double calculoMinutos() {
        return (double) (dias * 24.0d * 60.0d);
    }

    public double calculoSegundos() {
        return (double) (dias * 24.0d * 60.0d *60.0d);
    }

}
