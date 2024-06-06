package parcial2;

public class Automovil extends Vehiculo {
    private int numeroPuertas;//O(1)
    private TipoCombustible tipoCombustible;//O(1)
//O(1)
    public Automovil(String marca, String modelo, int año) {
        super(marca, modelo, año);
        this.numeroPuertas= numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
    
    //O(1)
    public String imprimirInformacion(){
    return getMarca() + " " + getModelo() + " " + getAño() + ", " + numeroPuertas + " puertas, combustión a " + TipoCombustible.getTipoCombustible();
    }
    
     
}
