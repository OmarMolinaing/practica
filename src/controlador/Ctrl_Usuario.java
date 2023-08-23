package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Usuario;
import java.sql.ResultSet;
/**
 *
 * @author GL753VD
 */
public class Ctrl_Usuario {

    //metodo para iniciar sesion
    public boolean loginUser(Usuario objeto) {//llamado loginUser y el parametro de clase 1 tipo Usuario llamado objeto

        boolean respuesta = false;

        Connection cn = Conexion.conectar();
        String sql = "select usuario,contraseña from Usuario where usuario = '" + objeto.getUsuario() + "' and contraseña = '" + objeto.getContraseña() + "'";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }

        return respuesta;

    }

}
