/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Patrik
 */
public class LoginScreen extends javax.swing.JFrame {

    static String nombreUsuario;

    /**
     * Creates new form MainScreen
     */
    LoginScreen() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        setUndecorated(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnRegister = new javax.swing.JButton();
        BtnGuest = new javax.swing.JButton();
        TextoPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setLocation(new java.awt.Point(500, 250));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 120, -1));

        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 87, -1));

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 90, -1));

        BtnRegister.setText("Registrarse");
        BtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 101, -1));

        BtnGuest.setText("Invitado");
        BtnGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuestActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 101, -1));
        jPanel1.add(TextoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 120, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cities.Inc");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 20));

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Patrik\\Documents\\NetBeansProjects\\Cities_Inc\\Cities_inc\\lib\\city-wallpaper-1.jpg")); // NOI18N
        logo.setText("jLabel4");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 410, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        // codigo para iniciar sesion en el programa escribiendo las credenciales del usuario
        nombreUsuario = TextUsuario.getText();
        String password = String.valueOf(TextoPassword.getPassword());
        String sql;
        sql = "SELECT COUNT(nombreUsuario) ";
        sql += "FROM usuario ";
        sql += "WHERE nombreUsuario='" + nombreUsuario + "' and password=MD5('" + password + "')";
        if (nombreUsuario.equals("administrador") && password.equals("admin12345")) {
            try {
                AdminScreen AD = new AdminScreen();
                AD.setLocationRelativeTo(null);
                AD.setVisible(true);
                AdminScreen.main();
                this.dispose();
            } catch (SQLException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                System.out.println(sql);
                JDBCclass JDBC = new JDBCclass();
                ResultSet temp = JDBC.consulta1(sql);
                int a = 0;
                if (temp.next()) {
                    System.out.println(temp.getInt(1));
                    a = temp.getInt(1);
                }
                if (a == 1) {
                    try {
                        MainScreen MS = new MainScreen();
                        //MS.setExtendedState(MS.MAXIMIZED_BOTH);
                        MS.setLocationRelativeTo(null);
                        MS.setVisible(true);
                        MainScreen.main();
                        this.dispose();
                    } catch (SQLException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                        Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null, "¡El usuario no existe!");
                    this.setVisible(true);
                    TextUsuario.setText(null);
                    TextoPassword.setText(null);
                    nombreUsuario = null;
                    password = null;
                }
                JDBC.state.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error en el SQL");
            }
        }

    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisterActionPerformed
        // codigo para abrir la ventana de registro
        try {
            RegisterScreen regscreen = new RegisterScreen();
            regscreen.setLocationRelativeTo(null);
            regscreen.setVisible(true);
            this.dispose();
        } catch (SQLException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnRegisterActionPerformed

    private void BtnGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuestActionPerformed
        // codigo para abrir la ventana de invitado(ventana de ranking)
        try {
            RankingScreen RK = new RankingScreen();
            RK.setLocationRelativeTo(null);
            RankingScreen.main();
            RK.setVisible(true);
        } catch (UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnGuestActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // Salir de la aplicacion por completo
        System.exit(0);
    }//GEN-LAST:event_BtnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the dialog */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuest;
    private javax.swing.JButton BtnRegister;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JPasswordField TextoPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
