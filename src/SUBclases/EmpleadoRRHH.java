package SUBclases;

import SUPERclases.TrabajadorCorporativo;

public class EmpleadoRRHH extends TrabajadorCorporativo {

    public EmpleadoRRHH(String nombre, double sueldoBase){
        super(nombre, sueldoBase);
    }

    @Override
    public double calcularBonoAnual() {
        // Premio del 10% del sueldo base
        return getSueldoBase() * 0.10;
    }
}
