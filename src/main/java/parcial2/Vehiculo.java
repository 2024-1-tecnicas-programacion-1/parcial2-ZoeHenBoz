package parcial2;

public class Vehiculo {
    private String marca; //O(1)
    private String modelo;//O(1)
    private int año; //O(1)
    
    //Metodo constructor
    public Vehiculo (String marca, String modelo, int año) {
        this.marca= marca;
        this.modelo =modelo;
        this.año=año;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }
    
   //O(1)
    public String imprimirInformacion(){
        return marca + " " + modelo + " " + año;
    }
}
