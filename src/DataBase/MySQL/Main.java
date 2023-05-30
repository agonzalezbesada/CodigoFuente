package DataBase.MySQL; // Conexión a la base de datos MySQL

// Libreria necesaria: mysql-connector-j-8.0.33

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        // CONEXIÓN

        Connection conexion = null; // Objeto que permite hacer la conexión
        String url = "jdbc:mysql://localhost:3306/bd_prueba"; // URL
        String user = "root"; // Usuario
        String password = "root"; // Contraseña

        try {
            conexion = DriverManager.getConnection(url,user,password);
            System.out.println("Conexión correcta");

        } catch (SQLException e) {
            System.out.println("Error en la conexión con MySQL");
            System.out.println(e.getLocalizedMessage());

        }

        // MODIFICACIÓN

        Statement consulta = null; // Objeto que permite hacer las consultas
        String texto_consulta = "CREATE TABLE prueba(id integer, nombre varchar(30))";

        try {

            consulta = conexion.createStatement();
            consulta.executeUpdate(texto_consulta); // Método para realizar la consulta
            System.out.println("Consulta exitosa");

        } catch (SQLException e) {

            System.out.println("Error en la consulta");
            System.out.println(e.getLocalizedMessage());

        }


        // CONSULTA

        Statement seleccion = null;
        String texto_seleccion = "SELECT * FROM prueba";
        ResultSet resultado = null; // Almacena la consulta

        try {

            seleccion = conexion.createStatement();
            resultado = seleccion.executeQuery(texto_seleccion);

            // .next() indica si hay agún elemento más en el resultado
            while (resultado.next()) {

                System.out.println("id = "+resultado.getInt("id")+", nombre = "+resultado.getString("nombre")); // .getTipo Especifica el tipo de dato
                resultado.close();

            }

        } catch (SQLException e) {

            System.out.println("Error en la consulta");
            System.out.println(e.getLocalizedMessage());

        }

        try {

            conexion.close(); // Cierra la conexion

        } catch (SQLException e) {

            throw new RuntimeException(e);

        }


    }
}
