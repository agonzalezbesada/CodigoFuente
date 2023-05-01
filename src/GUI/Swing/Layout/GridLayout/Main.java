package GUI.Swing.Layout.GridLayout;  // Localiza los elementos en regilla o matriz
import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 300, 400);
        ventana.setTitle("Probando Swing");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Creamos el layout
        GridLayout grid = new GridLayout(2,2); // (filas, columnas)
        grid.setHgap(10); // Separación horizoontal
        grid.setVgap(10); // Separación vertical

        // Lo añadimos a la ventana
        ventana.setLayout(grid);

        Button boton_1;
        for (int i = 0; i < 3; i++) {
            boton_1 = new Button("Boton" + i);
            ventana.add(boton_1);
        }

        ventana.setVisible(true);
    }
}
