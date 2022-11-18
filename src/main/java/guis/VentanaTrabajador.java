package guis;

import modelo.Trabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaTrabajador extends Ventana implements ActionListener {
    JButton mostrarDatos;
    JButton modificarDatos;
    Trabajador trabajador;

    public VentanaTrabajador(Trabajador trabajador) {
        this.generarEtiqueta("Trabajador",220,100,125,50);

        this.trabajador = trabajador;

        mostrarDatos = this.generarBoton("Mostrar datos", 125,200,130,50);
        modificarDatos = this.generarBoton("Modificar datos", 250,200,130,50);

        mostrarDatos.addActionListener(this);
        modificarDatos.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();

        if(e.getSource() == mostrarDatos) {
            new VentanaMostrarDatos(this.trabajador);
        }else {
            new VentanaModificarDatos(this.trabajador);
        }
    }
}