package modelo;

/**
 *
 * @author GL753VD
 */
//ATRIBUTOS
public class Proveedor {

    private int idProveedor;
    private String empresa;
    private String email;
    private String telefono;

    //CONSTRUCTOR
    public Proveedor() {
        this.idProveedor = 0;
        this.empresa = "";
        this.email = "";
        this.telefono = "";

    }
//CONSTRUCTOR SOBRECARGADO

    public Proveedor(int idProveedor, String empresa, String email, String telefono) {
        this.idProveedor = idProveedor;
        this.empresa = empresa;
        this.email = email;
        this.telefono = telefono;
    }
//metodo set an get
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
