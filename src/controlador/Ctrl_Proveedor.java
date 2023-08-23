package controlador;

import modelo.Proveedor;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Cliente;

/**
 *
 * @author GL753VD
 */
public class Ctrl_Proveedor {
    
    public boolean guardar(Proveedor objeto){
         boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try{
        
            PreparedStatement consulta = cn.prepareStatement("insert into Proveedor values(?,?,?,?)");//? son los parametros que hay dentro de la tabla, apellido, nombre etc.
            consulta.setInt(1,0);//id
            consulta.setString(2, objeto.getEmpresa());//empresa
            consulta.setString(3, objeto.getEmail());//email
            consulta.setString(4, objeto.getTelefono());//telefono
            
            if(consulta.executeUpdate() > 0){
               respuesta = true;
            }
            
            cn.close();
            
        } catch (SQLException e) {
            System.out.print("Error al guardar Proveedor: " + e);
        }
    
        return respuesta;
    
    }
    //metodo para consultar si Proveedor ya esta registrado

    
    public boolean existeProveedor(String empresa){
          boolean respuesta = false;
          String sql = "select empresa from Proveedor where empresa = '"+ empresa +"'";
          Statement st;

   try {
      Connection cn = Conexion.conectar();
      st = cn.createStatement();
      ResultSet rs = st.executeQuery(sql);
      while   (rs.next()) {
          respuesta = true;
        }

    } catch  (SQLException e) {
         System.out.println("Error al consultar proveedor: " + e);
    }
    return respuesta;

    } 
    
    
   //metodo actualizar
    public boolean actualizar(Proveedor objeto, int idProveedor) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update Proveedor set empresa=?, email = ?, telefono= ? where idProveedor ='" + idProveedor + "'");
            consulta.setString(1, objeto.getEmpresa());
            consulta.setString(2, objeto.getEmail());
            consulta.setString(3, objeto.getTelefono());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar Proveedor: " + e);
        }
        return respuesta;
    }

    //METODO ELIMINAR CLIENTE
    public boolean eliminar(int idProveedor) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from Proveedor where idProveedor ='" + idProveedor + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar Proveedor: " + e);
        }
        return respuesta;
    }
    
}
