import ORGANIZADOR.LiquidadorSueldos;
import SUBclases.EmpleadoRRHH;
import SUBclases.EmpleadoSistemas;
import SUBclases.EmpleadoVentas;

public class MAIN {
    public static void main(String[] args) {
        LiquidadorSueldos liquidador = new LiquidadorSueldos();

        System.out.println("----------------------------");
        liquidador.liquidar(new EmpleadoVentas("Carla Rey", 400000, 5000000));
        System.out.println("----------------------------");
        liquidador.liquidar(new EmpleadoSistemas("Diego Paz", 600000, 4));
        System.out.println("----------------------------");
        liquidador.liquidar(new EmpleadoRRHH("Sofía Luna", 450000));
        System.out.println("----------------------------");
    }
}
