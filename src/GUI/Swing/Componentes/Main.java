package GUI.Swing.Componentes;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 300, 400);
        ventana.setTitle("Probando Swing");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FlowLayout flow = new FlowLayout(FlowLayout.RIGHT, 25, 25);
        ventana.setLayout(flow);

        BotonPers boton_1 = new BotonPers("Hola mundo",0);
        BotonPers boton_2 = new BotonPers("Salir",1);

        ventana.add(boton_1);
        ventana.add(boton_2);

        ventana.setVisible(true);

    }
}
