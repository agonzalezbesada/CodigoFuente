package GUI.Swing; // Librería gráfica nativa en Java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int eleccion = 0;

        do {

            System.out.println("\nQué desea crear?\n1 Ventana\n2 Etiqueta\n3 Botón\n4 Cuadro de Texto\n5 Checkbox\n6 RadioButton");
            eleccion = entrada.nextInt();
            entrada.nextLine();

            switch (eleccion) {

                case 1:
                    // Ventana

                    JFrame ventana = new JFrame(); // Instanciamos la ventana

                    ventana.setBounds(750,350,300,400); // x,y = Posicion en la pantalla width,height = Proporciones
                    ventana.setTitle("Probando Swing");

                    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Accion predeterminada del boton cerrar

                    ventana.setVisible(true); // Hacer la ventana visible
                    break;

                case 2:
                    // Etiqueta (Label) Texto informativo

                    JFrame ventana2 = new JFrame(); // Instanciamos la ventana

                    ventana2.setBounds(750,350,300,400); // x,y = Posicion en la pantalla width,height = Proporciones
                    ventana2.setTitle("Probando Swing");

                    ventana2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Accion predeterminada del boton cerrar

                    JLabel etiqueta = new JLabel(); // Instanciamos la etiqueta

                    etiqueta.setText("Hola mundo!"); // Escribimos texto
                    etiqueta.setBounds(0,0,100,100);

                    ventana2.setLayout(null); // Eliminamos el layout por defecto

                    ventana2.add(etiqueta); // Añadimos la etiqueta

                    ventana2.setVisible(true); // Hacer la ventana visible

                    break;

                case 3:
                    // Botón (Button) Pulsadores

                    JFrame ventana3 = new JFrame(); // Instanciamos la ventana

                    ventana3.setBounds(750,350,300,400); // x,y = Posicion en la pantalla width,height = Proporciones
                    ventana3.setTitle("Probando Swing");

                    ventana3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Accion predeterminada del boton cerrar

                    Button boton = new Button(); // Instanciamos el botón

                    boton.setLabel("Pulsador");
                    boton.setBounds(0,0,100,100);
                    boton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            System.out.println("El botón funciona");
                        }
                    });

                    ventana3.setLayout(null); // Eliminamos el layout por defecto

                    ventana3.add(boton); // Añadimos el botón

                    ventana3.setVisible(true);

                    break;

                case 4:
                    // Cuadro de texto (TextArea) o TextField para una sóla linea de texto. Permite al usuario escribir

                    JFrame ventana4 = new JFrame(); // Instanciamos la ventana

                    ventana4.setBounds(750,350,300,400); // x,y = Posicion en la pantalla width,height = Proporciones
                    ventana4.setTitle("Probando Swing");

                    ventana4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Accion predeterminada del boton cerrar

                    JTextArea areaTexto = new JTextArea(); // Instanciamos el cuadro de texto
                    areaTexto.setBounds(10,10,200,100);

                    JTextField campoTexto = new JTextField(); // Instanciamos la linea de texto
                    campoTexto.setBounds(10,300,100,50);

                    ventana4.setLayout(null);

                    // Añadimos los elementos
                    ventana4.add(areaTexto);
                    ventana4.add(campoTexto);

                    ventana4.setVisible(true);

                    break;

                case 5:
                    // Checkbox. Lista una serie de elementos y escoger múltiples

                    JFrame ventana5 = new JFrame(); // Instanciamos la ventana

                    ventana5.setBounds(750,350,300,400); // x,y = Posicion en la pantalla width,height = Proporciones
                    ventana5.setTitle("Probando Swing");

                    ventana5.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Accion predeterminada del boton cerrar

                    JCheckBox checkbox = new JCheckBox("Probando"); // Instanciamos el botón con un nombre

                    checkbox.setBounds(100,100,100,100);

                    // Eliminamos el layout por defecto
                    ventana5.setLayout(null);

                    // Agregamos los elementos
                    ventana5.add(checkbox);

                    ventana5.setVisible(true);

                    break;

                case 6:
                    // RadioButton. Permite seleccionar un elemento entre un conjunto

                    JFrame ventana6 = new JFrame(); // Instanciamos la ventana

                    ventana6.setBounds(750,350,300,400); // x,y = Posicion en la pantalla width,height = Proporciones
                    ventana6.setTitle("Probando Swing");

                    ventana6.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Accion predeterminada del boton cerrar

                    ButtonGroup grupoBotones = new ButtonGroup(); // Instanciamos el RadioButton

                    // Instanciamos los botones
                    JRadioButton boton_1 = new JRadioButton("Opción 1");
                    boton_1.setBounds(10,10,100,50);

                    JRadioButton boton_2 = new JRadioButton("Opción 2");
                    boton_2.setBounds(10,60,100,50);

                    // Los añadimos al RadioButton
                    grupoBotones.add(boton_1);
                    grupoBotones.add(boton_2);

                    // Eliminamos el layout por defecto
                    ventana6.setLayout(null);

                    // Agregamos los elementos a la ventana
                    ventana6.add(boton_1);
                    ventana6.add(boton_2);

                    ventana6.setVisible(true);

                    break;

                default:

            }

        } while (eleccion!=0);

    }
}
