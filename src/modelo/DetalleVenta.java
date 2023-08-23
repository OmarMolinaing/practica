
package modelo;

/**
 *
 * @author GL753VD
 */
public class DetalleVenta {
    
    //atributos
    private int idDetalleVenta;
    private int idDeVenta;
    private int idProducto;
    private int Cantidad;
    private double PrecioUnitario;
    private double SubTotal;
    private double TotalaPagar;
    //agregando de mas
    private String nombre;
    
    
    //constructor
    
    public DetalleVenta(){
       this.idDetalleVenta = 0;
       this.idDeVenta = 0;
       this.idProducto = 0;
       this.Cantidad = 0;
       this.PrecioUnitario = 0.0;
       this.SubTotal = 0.0;
       this.TotalaPagar = 0.0;
       
       //agregando nombre
       this.nombre = "";
    }
    
    //constructor sobrecargado


    public DetalleVenta(int idDetalleVenta, int idDeVenta, int idProducto, int Cantidad, double PrecioUnitario, double SubTotal, double TotalaPagar, String nombre) {
        this.idDetalleVenta = idDetalleVenta;
        this.idDeVenta = idDeVenta;
        this.idProducto = idProducto;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
        this.SubTotal = SubTotal;
        this.TotalaPagar = TotalaPagar;
        this.nombre = nombre;
    }

    //metodo set and get
    
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdDeVenta() {
        return idDeVenta;
    }

    public void setIdDeVenta(int idDeVenta) {
        this.idDeVenta = idDeVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double SubTotal) {
        this.SubTotal = SubTotal;
    }

    public double getTotalaPagar() {
        return TotalaPagar;
    }

    public void setTotalaPagar(double TotalaPagar) {
        this.TotalaPagar = TotalaPagar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //to string

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVenta=" + idDetalleVenta + ", idDeVenta=" + idDeVenta + ", idProducto=" + idProducto + ", Cantidad=" + Cantidad + ", PrecioUnitario=" + PrecioUnitario + ", SubTotal=" + SubTotal + ", TotalaPagar=" + TotalaPagar + ", nombre=" + nombre + '}';
    }

}
   
    
    

