package GUI.Swing.Evento.Implementacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ManejadorBoton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hola Mundo!");
    }
}
