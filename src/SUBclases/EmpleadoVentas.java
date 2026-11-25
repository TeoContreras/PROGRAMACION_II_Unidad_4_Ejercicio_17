package SUBclases;

import SUPERclases.TrabajadorCorporativo;

public class EmpleadoVentas extends TrabajadorCorporativo {
    private double ventasAnuales;

    public EmpleadoVentas(String nombre, double sueldoBase, double ventasAnuales){
        super(nombre, sueldoBase);
        this.ventasAnuales = ventasAnuales;
    }

    @Override
    public double calcularBonoAnual() {
        // Comisión del 3% sobre las ventas del año
        return ventasAnuales * 0.03;
    }
}
