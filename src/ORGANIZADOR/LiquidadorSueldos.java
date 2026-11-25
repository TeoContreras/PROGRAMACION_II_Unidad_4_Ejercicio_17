package ORGANIZADOR;

import SUPERclases.TrabajadorCorporativo;

public class LiquidadorSueldos {

    public double liquidar(TrabajadorCorporativo trabajador){
        double bono = trabajador.calcularBonoAnual();
        double total = trabajador.getSueldoBase() + bono;
        System.out.println("Empleado: " + trabajador.getNombre());
        System.out.println("Sueldo base: $" + String.format("%.2f", trabajador.getSueldoBase()));
        System.out.println("Bono anual: $" + String.format("%.2f", bono));
        System.out.println("Total a abonar: $" + String.format("%.2f", total));
        return total;
    }
}
