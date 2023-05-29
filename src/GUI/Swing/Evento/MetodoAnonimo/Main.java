package GUI.Swing.Evento.MetodoAnonimo; // Método anónimo (Peligroso en bucles)
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 300, 400);
        ventana.setTitle("Probando Swing");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FlowLayout flow = new FlowLayout(FlowLayout.RIGHT, 25, 25);
        ventana.setLayout(flow);
        Button boton_1 = new Button("Boton_1");

        //Implementación anónima
        boton_1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola mundo");
            }
        });

        ventana.add(boton_1);

        ventana.setVisible(true);
    }
}
