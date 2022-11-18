package guis;
import datos.DatosTrabajador;
import modelo.Trabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaModificarDatos extends Ventana implements ActionListener {
    Trabajador trabajador;
    JTextField afpField;
    JTextField isapreField;
    JButton aceptar;
    JButton cancelar;

    public VentanaModificarDatos(Trabajador trabajador) {
        this.trabajador = trabajador;

        this.generarEtiqueta("Nombre: " + trabajador.getNombre(), 50,100,200,25);
        this.generarEtiqueta("Apellido: " + trabajador.getApellido(), 50,150,200,25);
        this.generarEtiqueta("Rut: " + trabajador.getRut(), 50,200,200,25);
        this.generarEtiqueta("AFP: ", 50,250,75,25);
        this.generarEtiqueta("Isapre: ", 50,300,75,25);

        afpField = this.generarCampoDeTexto(125,250,200,25);
        isapreField = this.generarCampoDeTexto(125,300,200,25);


        aceptar = this.generarBoton("Aceptar", 125,350,100,25);
        aceptar.addActionListener(this);
        cancelar = this.generarBoton("Cancelar", 225,350,100,25);
        cancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptar) {
            DatosTrabajador.actualizarDatosTrabajador(this.trabajador, afpField.getText(), isapreField.getText());
        }

        this.dispose();
        new VentanaTrabajador(trabajador);
    }
}
