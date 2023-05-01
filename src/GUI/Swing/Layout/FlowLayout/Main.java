package GUI.Swing.Layout.FlowLayout;
/*
Localiza los elementos en una línea, alineado en el centro hasta que no haya hueco en la fila,
entonces lo localiza en la siguiente fila hasta el final de la ventana

(Disposición por defecto de JFrame Swing)
 */
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 300, 400);
        ventana.setTitle("Probando Swing");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Creamos el layout
        FlowLayout flow = new FlowLayout(FlowLayout.RIGHT, 25,25); // (alineado, margen horizontal, margen vertical)

        // Lo añadimos a la ventana
        ventana.setLayout(flow);

        Button boton_1;
        for (int i = 0; i < 25; i++) {
        //Por mucho que se añadan 25 botones, solo muestra los que el Layout permite distribuir
            boton_1 = new Button("Boton" + i);
            ventana.add(boton_1);
        }

        ventana.setVisible(true);
    }
}