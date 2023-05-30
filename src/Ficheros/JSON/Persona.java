package Ficheros.JSON;

import java.util.ArrayList;

class Persona {

    private String nombre;

    private Integer edad;

    private ArrayList<String> hobbies = new ArrayList<>();

    private boolean vivo;

    Persona() {
        this.nombre = "Antonio";
        this.edad = 33;
        this.hobbies.add("origami");
        this.hobbies.add("surf");
        this.hobbies.add("haikus");

    }

    Persona(String nombre, int edad, ArrayList<String> hobbies, boolean vivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.hobbies = hobbies;
        this.vivo = vivo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public ArrayList<String> getHobbies() {
        return this.hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies.add(hobbies);
    }

    public boolean getVivo() {
        return this.vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        StringBuilder info;
        info = new StringBuilder(nombre + " de " + edad + " años, tiene por hobbies:");
        for (String hobby: hobbies)
            info.append(" ").append(hobby);
        return info.toString();
    }


}