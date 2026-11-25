package SUPERclases;

public abstract class TrabajadorCorporativo {
    private String nombre;
    private double sueldoBase;

    public TrabajadorCorporativo(String nombre, double sueldoBase){
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public abstract double calcularBonoAnual();
}
