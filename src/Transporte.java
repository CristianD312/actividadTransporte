
import java.util.ArrayList;
import java.util.List;

public class Transporte {

    public static void main(String[] args) {

        double sueldoBase = 500.0;
        List<camiones> empresa = new ArrayList<>();
        empresa.add(new camiones("Scania", 32, 0.5));
        empresa.add(new camiones("mercedes", 24, 0.3));
        empresa.add(new camiones("ford", 50, 0.7));
        empresa.add(new camiones("iveco", 40, 0.6));

        List<cereales> silo = new ArrayList<>();
        silo.add(new cereales("soja", 240));
        silo.add(new cereales("maiz", 300));
        silo.add(new cereales("cebada", 380));
        silo.add(new cereales("avena", 160));

        List<destino> ciudad = new ArrayList<>();
        ciudad.add(new destino("rio negro", 1900));
        ciudad.add(new destino("jujuy", 890));
        ciudad.add(new destino("cordoba", 760));
        ciudad.add(new destino("la pampa", 920));

        List<conductores> personal = new ArrayList<>();
        personal.add(new conductores("pepe", sueldoBase, 12));
        personal.add(new conductores("juan", sueldoBase, 15));
        personal.add(new conductores("jose", sueldoBase, 9));
        personal.add(new conductores("luis", sueldoBase, 5));
        
         List<empresa> viajes = new ArrayList<>();
        for (int i = 0; i < empresa.size(); i++) {
            empresa transporteTac = new empresa(empresa.get(i), silo.get(i), personal.get(i), ciudad.get(i), 100);
            viajes.add(transporteTac);
        }
        for (empresa viaje : viajes) {
            System.out.println("El resultado del camion: " + viaje.getCamion().getMarca() + " :" + viaje.calcularViaje());
            System.out.println("sueldo del conductor "+viaje.getConductor().getNombre()+": $" + viaje.calcularSueldo());
            System.out.println("combustible: $"+viaje.calcularCombustible());
            System.out.println("valor mercaderia: $"+viaje.calcularIngreso());
        }

    }

}
