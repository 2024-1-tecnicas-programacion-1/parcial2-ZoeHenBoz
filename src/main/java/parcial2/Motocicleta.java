package parcial2;
//O(1)
public class Motocicleta extends Vehiculo {
    private TipoMotocicleta tipoMotocicleta;//O(1)
//O(1)
    public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta= tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }
    //O(1)
    public String imprimirInformacion(){
    return getMarca() + " " + getModelo() + " " + getAño() + ",  tipo de motocicleta: " + TipoMotocicleta.getTipoMotocicleta().toString();
    }
}
