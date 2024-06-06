
import parcial2.Automovil;
import parcial2.Motocicleta;
import parcial2.Vehiculo;
import parcial2.TipoCombustible;
import parcial2.TipoMotocicleta;

public class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Chevrolet ", "Spark", 2004);
        vehiculo.imprimirInformacion();
        
        Motocicleta motocicleta = new Motocicleta(" AKT ", "Marca: Mitsubishi ",2012, TipoMotocicleta.TOURING);
        motocicleta.imprimirInformacion();
        
        Automovil automovil = new Automovil ("Toyota ", "Corolla ",2020);
        automovil.imprimirInformacion();
    }
}
