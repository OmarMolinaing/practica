package vista;

import controlador.Ctrl_Proveedor;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Proveedor;

/**
 *
 * @author GL753VD
 */
public class InterProveedor extends javax.swing.JInternalFrame {

    public InterProveedor() {
        initComponents();
        this.setSize(new Dimension(400,300));
        this.setTitle("Nuevo Proveedor");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextEmpresa = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        TextTelefono = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Proveedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empresa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        TextEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(TextEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 170, 30));

        TextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailActionPerformed(evt);
            }
        });
        getContentPane().add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, 30));

        TextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(TextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, 30));

        Guardar.setBackground(new java.awt.Color(153, 255, 255));
        Guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PIXELS.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmpresaActionPerformed

    private void TextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailActionPerformed

    private void TextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTelefonoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        Proveedor proveedor = new Proveedor();
        Ctrl_Proveedor controlProveedor = new Ctrl_Proveedor();
        
  
        //validar campos vacios
        if(!TextEmpresa.getText().isEmpty() && !TextEmail.getText().isEmpty() && !TextTelefono.getText().isEmpty()){
            
            
            if(!controlProveedor.existeProveedor(TextEmpresa.getText().trim())){
                
             proveedor.setEmpresa(TextEmpresa.getText().trim());
             proveedor.setEmail(TextEmail.getText().trim());
             proveedor.setTelefono(TextTelefono.getText().trim());
               
               if(controlProveedor.guardar(proveedor)){
                   
                   JOptionPane.showMessageDialog(null, "Proveedor Guardado");
               
               }else{
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                }
             
             
            }else{
               JOptionPane.showMessageDialog(null, "El Proveedor ya Existe");
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Complete los campos");
            
        }
        this.Limpiar();
    }//GEN-LAST:event_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextEmpresa;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

 private void Limpiar(){
    TextEmpresa.setText("");
    TextEmail.setText("");
    TextTelefono.setText("");
   
    
    }


}


