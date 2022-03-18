/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_cesarnunez_juanmolina;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class FramePrincipal extends javax.swing.JFrame {

    private ArrayList<usuario> usuarios = new ArrayList();
    private admin a = new admin("admin","admin1234");
    private usuario usuarioActual;
    
    public FramePrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public ArrayList<usuario> getUsuarios() {
        return usuarios;
    }

    public usuario getUsuarioActual() {
        return usuarioActual;
    }      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_registro = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jtf_nombreRegistro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_usuarioRegistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtf_contraRegistro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtf_confirmarContra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jb_registrarse = new javax.swing.JButton();
        jrb_alumno = new javax.swing.JRadioButton();
        jrb_maestro = new javax.swing.JRadioButton();
        bg_tipoUsuario = new javax.swing.ButtonGroup();        	  	   jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_contraLogin = new javax.swing.JTextField();
        jtf_usuarioLogin = new javax.swing.JTextField();
        jb_ingresarLogin = new javax.swing.JButton();
        jb_registro = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Nombre completo: ");

        jtf_nombreRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Usuario / ID:");

        jtf_usuarioRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Contraseña:");

        jtf_contraRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Confirmar contraseña:");

        jtf_confirmarContra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Sign In");

        jb_registrarse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_registrarse.setText("Registrarse");
        jb_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registrarseMouseClicked(evt);
            }
        });

        bg_tipoUsuario.add(jrb_alumno);
        jrb_alumno.setText("Alumno");

        bg_tipoUsuario.add(jrb_maestro);
        jrb_maestro.setText("Maestro");

        javax.swing.GroupLayout jf_registroLayout = new javax.swing.GroupLayout(jf_registro.getContentPane());
        jf_registro.getContentPane().setLayout(jf_registroLayout);
        jf_registroLayout.setHorizontalGroup(
            jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jf_registroLayout.createSequentialGroup()
                        .addGap(0, 135, Short.MAX_VALUE)
                        .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_confirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_contraRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_usuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_nombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                                .addComponent(jrb_alumno)
                                .addGap(54, 54, 54)
                                .addComponent(jrb_maestro)
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(181, 181, 181))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_registroLayout.createSequentialGroup()
                                .addComponent(jb_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)))))
                .addGap(134, 134, 134))
        );
        jf_registroLayout.setVerticalGroup(
            jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_registroLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_nombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_usuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_contraRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_confirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_alumno)
                    .addComponent(jrb_maestro))
                .addGap(30, 30, 30)
                .addComponent(jb_registrarse)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Usuario: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Log In");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Contraseña:");

        jtf_contraLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jtf_usuarioLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jb_ingresarLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_ingresarLogin.setText("Ingresar");
        jb_ingresarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ingresarLoginMouseClicked(evt);
            }
        });

        jb_registro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_registro.setText("Registrarse");
        jb_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_usuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_contraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_ingresarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_usuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_contraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(54, 54, 54)
                .addComponent(jb_ingresarLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jb_registro)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registroMouseClicked
        jf_registro.setVisible(true);
        jf_registro.pack();
        jf_registro.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jb_registroMouseClicked

    private void jb_registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registrarseMouseClicked
        String nombre = jtf_nombreRegistro.getText();
        String usuario = jtf_usuarioRegistro.getText();
        String contrasenia = jtf_contraRegistro.getText();
        String contrasenia2 = jtf_confirmarContra.getText();
        try{
            if(registroValido(nombre, usuario, contrasenia, contrasenia2)){
                if(jrb_alumno.isSelected()){
                    alumno a = new alumno();
                    a.setNombre(nombre);
                    a.setUsuario(usuario);
                    a.setContrasena(contrasenia);
                    usuarios.add(a);
                }else if(jrb_maestro.isSelected()){
                    maestro a = new maestro();
                    a.setNombre(nombre);
                    a.setUsuario(usuario);
                    a.setContrasena(contrasenia);
                    usuarios.add(a);
                }
                this.setVisible(true);
                this.setLocationRelativeTo(null);
                jf_registro.setVisible(false);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error inesperado.");
        }        
    }//GEN-LAST:event_jb_registrarseMouseClicked

    private void jb_ingresarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ingresarLoginMouseClicked
        boolean band = false;
        for (usuario u : usuarios) {
            if(u.getUsuario().equals(jtf_usuarioLogin.getText()) && u.getContrasena().equals(jtf_contraLogin.getText())){
                band = true;
                break;
            }
        }
        
        if(band == true){
            JOptionPane.showMessageDialog(null, "El usuario se logueó con éxito.");
        }else{
            JOptionPane.showMessageDialog(null, "El usuario o la contraseña no son válidos.");
        }
    }//GEN-LAST:event_jb_ingresarLoginMouseClicked

    public boolean registroValido(String n, String u, String c, String c1){      
        if(n.equals("") != true && u.equals("") != true && c.equals("") != true && c1.equals("") != true && (jrb_alumno.isSelected() || jrb_maestro.isSelected())){
            if(c.equals(c1)){
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese la misma contraseña en el espacio de confirmar contraseña.");
                return false;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Complete todos los campos.");
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_tipoUsuario;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jb_ingresarLogin;
    private javax.swing.JButton jb_registrarse;
    private javax.swing.JButton jb_registro;
    private javax.swing.JFrame jf_registro;
    private javax.swing.JRadioButton jrb_alumno;
    private javax.swing.JRadioButton jrb_maestro;
    private javax.swing.JTextField jtf_confirmarContra;
    private javax.swing.JTextField jtf_contraLogin;
    private javax.swing.JTextField jtf_contraRegistro;
    private javax.swing.JTextField jtf_nombreRegistro;
    private javax.swing.JTextField jtf_usuarioLogin;
    private javax.swing.JTextField jtf_usuarioRegistro;
    // End of variables declaration//GEN-END:variables
}
