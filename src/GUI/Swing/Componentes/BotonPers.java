package GUI.Swing.Componentes;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BotonPers extends Button implements ActionListener {

    private int funcion;
    public BotonPers(String nombre, int funcion){
        super(nombre);
        this.funcion = funcion;
        //Como la propia clase es también su manejador, podemos decir que "this" es el manejador
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(this.funcion){
            case 0:
                System.out.println("Hola mundo");
                break;
            case 1:
                System.out.println("Salir");
                System.exit(0);
                break;
        }
    }

}
