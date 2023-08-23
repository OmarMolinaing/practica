package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Cliente;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author GL753VD
 */
//metodo para guardar un nuevo cliente
public class Ctrl_Cliente {
    public boolean guardar (Cliente objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try{
        
            PreparedStatement consulta = cn.prepareStatement("insert into Cliente values(?,?,?,?,?)");//? son los parametros que hay dentro de la tabla, apellido, nombre etc.
            consulta.setInt(1,0);//id
            consulta.setString(2, objeto.getNombre());//nombre
            consulta.setString(3, objeto.getApellido());//apellido
            consulta.setString(4, objeto.getRfc());///rfc
            consulta.setString(5, objeto.getTelefono());//telefono
            
            if(consulta.executeUpdate() > 0){
               respuesta = true;
            }
            
            cn.close();
            
        } catch (SQLException e) {
            System.out.print("Error al guardar Cliente: " + e);
        }
    
        return respuesta;
    }
    
    
    
       //metodo para consultar si Cliente ya esta registrado en bbdd

    
    public boolean existeCliente(String rfc){
          boolean respuesta = false;
          String sql = "select nombre from Cliente where rfc = '" + rfc + "'";
          Statement st;

   try {
      Connection cn = Conexion.conectar();
      st = cn.createStatement();
      ResultSet rs = st.executeQuery(sql);
      while   (rs.next()) {
          respuesta = true;
        }

    } catch  (SQLException e) {
         System.out.println("Error al consultar cliente: " + e);
    }
    return respuesta;

    } 
   //metodo actualizar
    public boolean actualizar(Cliente objeto, int idCliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update Cliente set nombre=?, apellido = ?, rfc = ?, telefono= ? where idCliente ='" + idCliente + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getRfc());
            consulta.setString(4, objeto.getTelefono());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente: " + e);
        }
        return respuesta;
    }

    //METODO ELIMINAR CLIENTE
    public boolean eliminar(int idCliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from Cliente where idCliente ='" + idCliente + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e);
        }
        return respuesta;
    }
    
}
  


 


