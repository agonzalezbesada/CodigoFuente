package Ficheros.JSON; // Permite almacenar y transportar datos entre aplicaciones

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Gson gson = new Gson(); // Objeto para trabajar con el parseo


        Persona persona1 = new Persona(); // Objeto a parsear
        System.out.println(persona1.toString());

        String json_original = gson.toJson(persona1, Persona.class); // Transformacion a JSON
        System.out.println(json_original);

        // Lo guardamos en un fichero
        FileWriter file = null;
        try {
            file = new FileWriter("src\\Ficheros\\JSON\\output.json");
            file.write(json_original);
            file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Leemos de un fichero y lo pasamos a un String
        String json_recuperado = "";
        FileReader fileReader;

        try {
            fileReader = new FileReader("src\\Ficheros\\JSON\\output.json");
            int valor = fileReader.read();

            while(valor!=-1){
                json_recuperado += (char) valor;
                valor = fileReader.read();
            }

            // Cerramos
            fileReader.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }


        // Pasamos el String json a un nuevo objeto Persona
        Persona persona_recuperada = gson.fromJson(json_recuperado, Persona.class);
        System.out.println(persona_recuperada.toString());
        System.out.println(json_recuperado);

    }

}
