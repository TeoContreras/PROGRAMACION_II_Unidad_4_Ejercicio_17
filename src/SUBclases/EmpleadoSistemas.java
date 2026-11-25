package SUBclases;

import SUPERclases.TrabajadorCorporativo;

public class EmpleadoSistemas extends TrabajadorCorporativo {
    private int proyectosEntregados;

    public EmpleadoSistemas(String nombre, double sueldoBase, int proyectosEntregados){
        super(nombre, sueldoBase);
        this.proyectosEntregados = proyectosEntregados;
    }

    @Override
    public double calcularBonoAnual() {
        // Premio fijo por cada proyecto entregado
        return proyectosEntregados * 15000;
    }
}
