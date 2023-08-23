package vista;

import com.mysql.jdbc.Statement;
import conexion.Conexion;
import controlador.Ctrl_Cliente;
import java.sql.Connection;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JTable;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import modelo.Cliente;





/**
 *
 * @author GL753VD
 */
public class InterGestionClientes extends javax.swing.JInternalFrame {

        private int idCliente;
    
    public InterGestionClientes() {
        initComponents();
        this.setSize(new Dimension (700, 400));
        this.setTitle("Administrar Clientes");
        //Insertar tabla
        this.CargarTablaClientes();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Administrar_Clientes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AClientes = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Actualizar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        RFC = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Text_Nombre = new javax.swing.JTextField();
        Text_Apellido = new javax.swing.JTextField();
        Text_RFC = new javax.swing.JTextField();
        Text_Telefono = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Administrar_Clientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Administrar_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Administrar_Clientes.setText("Administrar Clientes");
        getContentPane().add(Administrar_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        AClientes.setViewportView(TablaClientes);

        jPanel1.add(AClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 510, 190));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Actualizar.setBackground(new java.awt.Color(102, 255, 102));
        Actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        Eliminar.setBackground(new java.awt.Color(255, 51, 51));
        Eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel2.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 120, 80));

        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombre");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        Apellido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setText("Apellido");
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        RFC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RFC.setForeground(new java.awt.Color(255, 255, 255));
        RFC.setText("RFC");
        getContentPane().add(RFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        Telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Telefono.setForeground(new java.awt.Color(255, 255, 255));
        Telefono.setText("Telefono");
        getContentPane().add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        Text_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(Text_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 140, -1));

        Text_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_ApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(Text_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 140, 30));

        Text_RFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_RFCActionPerformed(evt);
            }
        });
        getContentPane().add(Text_RFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 130, -1));
        getContentPane().add(Text_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 130, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PIXELS.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // TODO add your handling code here:
        
        if (Text_Nombre.getText().isEmpty() && Text_Apellido.getText().isEmpty()
                && Text_RFC.getText().isEmpty() && Text_Telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa los campos");
        } else {

            Cliente cliente = new Cliente();
            Ctrl_Cliente controlCliente = new Ctrl_Cliente();

            cliente.setNombre(Text_Nombre.getText().trim());
            cliente.setApellido(Text_Apellido.getText().trim());
            cliente.setRfc(Text_RFC.getText().trim());
            cliente.setTelefono(Text_Telefono.getText().trim());
            

            if (controlCliente.actualizar(cliente, idCliente)) {
                JOptionPane.showMessageDialog(null, "Datos del cliente actualizado");
                this.CargarTablaClientes();
                this.Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }

        }
        
        
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
         Ctrl_Cliente controlCliente = new Ctrl_Cliente();
        if (idCliente == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente");
        } else {
            if (!controlCliente.eliminar(idCliente)) {
                JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                this.CargarTablaClientes();
                this.Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar cliente");
                this.Limpiar();
            }
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void Text_RFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_RFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_RFCActionPerformed

    private void Text_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_NombreActionPerformed

    private void Text_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_ApellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JScrollPane AClientes;
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel Administrar_Clientes;
    private javax.swing.JLabel Apellido;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel RFC;
    public static javax.swing.JTable TablaClientes;
    private javax.swing.JLabel Telefono;
    private javax.swing.JTextField Text_Apellido;
    private javax.swing.JTextField Text_Nombre;
    private javax.swing.JTextField Text_RFC;
    private javax.swing.JTextField Text_Telefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
  //Metodo para limpiar
    private void Limpiar() {
        Text_Nombre.setText("");
        Text_Apellido.setText("");
        Text_RFC.setText("");
        Text_Telefono.setText("");
        
    }



//Para mostrar todos los Clientes Agregados
 
   private void CargarTablaClientes(){
       Connection con = Conexion.conectar();
       DefaultTableModel model = new DefaultTableModel();
       String sql = "select * from Cliente";
       Statement st;
       
       try {
           st = (Statement) con.createStatement();
           ResultSet rs = st.executeQuery(sql);
           InterGestionClientes.TablaClientes = new JTable(model);
           InterGestionClientes.AClientes.setViewportView(InterGestionClientes.TablaClientes);
           
           model.addColumn("idCliente");
           model.addColumn("nombre");
           model.addColumn("apellido");
           model.addColumn("rfc");
           model.addColumn("telefono");
           
           while(rs.next()){
                Object fila[] = new Object [5];
                
                for(int i =0; i <5; i++){
                   fila[i] = rs.getObject(i + 1); 
                }
                model.addRow(fila);
           
           }
           con.close();
           
       } catch (SQLException e) {
           System.out.println("Error al llenar la tabla Cliente" + e);
           
       }
      //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        TablaClientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = TablaClientes.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idCliente = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosClienteSeleccionado(idCliente);//metodo
                }
            }
        });
    
    
    }
   
   
    /*
     * **************************************************
     * Metodo que envia datos seleccionados
     * **************************************************
     */
    private void EnviarDatosClienteSeleccionado(int idCliente) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from Cliente where idCliente = '" + idCliente + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Text_Nombre.setText(rs.getString("nombre"));
                Text_Apellido.setText(rs.getString("apellido"));
                Text_RFC.setText(rs.getString("rfc"));
                Text_Telefono.setText(rs.getString("telefono"));
                
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar cliente: " + e);
        }
    }
       
}
