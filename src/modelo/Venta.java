
package modelo;

/**
 *
 * @author GL753VD
 */
public class Venta {
    //atributos
    
    private int idVenta;
    private int idCliente;
    private double Pagar;
    private String Fecha; 
   
        //constructor
    public  Venta(){
    this.idVenta = 0;
    this.idCliente = 0;
    this.Pagar = 0.0;
    this. Fecha = "";
    }
    
    // constructor sobrecargado

    public Venta(int idVenta, int idCliente, double Pagar, String Fecha) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.Pagar = Pagar;
        this.Fecha = Fecha;
    }
    
    //set and get

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getPagar() {
        return Pagar;
    }

    public void setPagar(double Pagar) {
        this.Pagar = Pagar;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    //toString

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", idCliente=" + idCliente + ", Pagar=" + Pagar + ", Fecha=" + Fecha + '}';
    }
    
}

  