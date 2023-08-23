
package modelo;

/**
 *
 * @author GL753VD
 */
public class Cliente {
    
    //Atributos
    private int idCliente;
    private String nombre;
    private String apellido;
    private String rfc;
    private String telefono;
    
    //Constructor
    public Cliente(){
    this.idCliente = 0;
    this.nombre = "";
    this.apellido = "";
    this.rfc = "";
    this.telefono = "";
    
    }
//Constructor Sobrecargado
    public Cliente(int idCliente, String nombre, String apellido, String rfc, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rfc = rfc;
        this.telefono = telefono;
    }
    
    //Set and Get

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
