package modelo;

/**
 *
 * @author GL753VD
 */

public class Producto {
  //Atributos
    private int idProducto;
    private String nombre;
    private String descripcion;
    private int Cantidad;
    private Double Precio;
    private int idProveedor;
    
    //CONSTRUCTOR
      public Producto() {
        this.idProducto = 0;
        this.nombre = "";
        this.descripcion = "";
        this.Cantidad = 0;
        this.Precio = 0.0;
        this.idProveedor = 0;
        
      }
//constructor sobrecargado
    public Producto(int idProducto, String nombre, String descripcion, int Cantidad, Double Precio, int idProveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.idProveedor = idProveedor;
    }
    //set and get para obtener e insertar

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
 
    
    
    
}
