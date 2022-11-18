package datos;

import modelo.Trabajador;

public class DatosTrabajador {


    public static void actualizarDatosTrabajador(Trabajador trabajador, String afp, String isapre) {
        trabajador.setAfp(afp);
        trabajador.setIsapre(isapre);
    }
}