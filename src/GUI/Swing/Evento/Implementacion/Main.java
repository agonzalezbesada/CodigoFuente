package GUI.Swing.Evento.Implementacion; // Acción - reacción al interactuar el usuario
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 300, 400);
        ventana.setTitle("Probando Swing");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 25, 25);

        // Lo añadimos a la ventana
        ventana.setLayout(flow);

        Button boton_1 = new Button("Boton_1");
        Button boton_2 = new Button("Boton_2");

        // Instanciamos el Manejador de botón
        ManejadorBoton botonListener = new ManejadorBoton();

        // Se añade el manejador sólo al primer botón
        boton_1.addActionListener(botonListener);

        // Instanciamos el Manejador de ratón
        ManejadorRaton mouseListener = new ManejadorRaton();

        // Se añade el manejador sólo al segundo botón
        boton_2.addMouseListener(mouseListener);

        // Añadimos los elementos
        ventana.add(boton_1);
        ventana.add(boton_2);

        ventana.setVisible(true);
    }
}
