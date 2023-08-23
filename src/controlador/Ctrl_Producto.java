package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Producto;

/**
 *
 * @author GL753VD
 */
public class Ctrl_Producto {

    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into Producto values(?,?,?,?,?,?)");//? son los parametros que hay dentro de la tabla, apellido, nombre etc.
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());//nombre
            consulta.setString(3, objeto.getDescripcion());//descripcion
            consulta.setInt(4, objeto.getCantidad());//Cantidad
            consulta.setDouble(5, objeto.getPrecio());//Precio
            consulta.setInt(6, objeto.getIdProveedor());//idProveedor
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.print("Error al guardar Producto: " + e);
        }

        return respuesta;

    }
    //metodo para consultar si Producto ya esta registrado

    public boolean existeProducto(String nombre) {
        boolean respuesta = false;
        String sql = "select empresa from Producto where nombre = '" + nombre + "'";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar producto: " + e);
        }
        return respuesta;

    }

    //metodo actualizar
    public boolean actualizar(Producto objeto, int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update Producto set nombre=?, descripcion = ?, Cantidad = ?,Precio = ?, idProveedor = ? where idProducto ='" + idProducto + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setInt(5, objeto.getIdProveedor());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar productos: " + e);
        }
        return respuesta;
    }

    //METODO ELIMINAR PRODUCTO
    public boolean eliminar(int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from Producto where idProducto ='" + idProducto + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }
        return respuesta;
    }
    // metodo para Actualizar stock de producto

    public boolean actualizarStock(Producto object, int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update Producto set Cantidad=? where idProducto ='" + idProducto + "'");
            consulta.setInt(1, object.getCantidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar stock de producto: " + e);
        }
        return respuesta;
    }

}
