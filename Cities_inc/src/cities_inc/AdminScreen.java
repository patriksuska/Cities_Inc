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
import javax.swing.table.DefaultTableModel;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Clase llamada AdminScreen que es la pantalla de administrador
 * @author Patrik
 */
public class AdminScreen extends javax.swing.JFrame {//aqui apareceran los datos de todos los usuarios

    /**
     * Constructor de la clase AdminScreen
     * @throws SQLException Excepcion SQL en caso de un sql mal escrito
     * @throws UnsupportedLookAndFeelException  En caso de que no este soportado el LookAndFeel
     * @throws InstantiationException  En caso de que la instanciacion falle
     * @throws IllegalAccessException En caso de que hay un inicio no esperado
     * @throws ClassNotFoundException Por si la clase no se encuentra
     */
    public AdminScreen() throws SQLException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        setUndecorated(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnCrearUsuario = new javax.swing.JButton();
        BtnBorrarUsuario = new javax.swing.JButton();
        BtnCambiarPassword = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCSP = new javax.swing.JTextField();
        jPasswordFieldContrasena = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 13, 395, 274));

        BtnCrearUsuario.setText("Crear Usuario");
        BtnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 119, 147, -1));

        BtnBorrarUsuario.setText("Borrar usuario");
        BtnBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBorrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 160, 147, -1));

        BtnCambiarPassword.setText("Restablecer contraseña");
        BtnCambiarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambiarPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCambiarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 201, -1, -1));

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 264, -1, -1));

        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, -1, -1));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 13, 116, -1));

        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 39, -1, -1));

        jLabel3.setText("CSP:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, -1, -1));
        jPanel1.add(jTextFieldCSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 65, 30, -1));
        jPanel1.add(jPasswordFieldContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 39, 116, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Patrik\\Documents\\NetBeansProjects\\Cities_Inc\\Cities_inc\\lib\\city-wallpaper-1.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -2, 630, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo autogenerado por Netbeans que crea un usuario nuevo con los datos que se le pide al usuario en la base de datos cuando se da click al boton crear usuario en la pantalla de administrador
     * @param evt 
     */
    private void BtnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearUsuarioActionPerformed
//codigo para crear un usuario desde la pantalla de administrador
        try {
            if (jTextFieldNombre.getText().isEmpty() || jPasswordFieldContrasena.getPassword().length == 0 || jTextFieldCSP.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Introduzca todos los datos!");
            } else {
                String nombreUsuario = jTextFieldNombre.getText();
                String password = String.valueOf(jPasswordFieldContrasena.getPassword());
                int CSP = Integer.valueOf(jTextFieldCSP.getText());
                int saldo = 333000;
                String sql1;
                JDBCclass JDBC = new JDBCclass();
                sql1 = "SELECT COUNT(nombreUsuario) ";
                sql1 += "FROM usuario ";
                sql1 += "WHERE nombreUsuario='" + nombreUsuario + "' or password=MD5('" + password + "') or CSP='" + CSP + "';";
                ResultSet temp = JDBC.consulta1(sql1);
                int a = 0;
                if (temp.next()) {
                    System.out.println(temp.getInt(1));
                    a = temp.getInt(1);
                }
                if (a >= 1) {
                    JOptionPane.showMessageDialog(null, "¡El usuario ya existe!");
                    jTextFieldNombre.setEnabled(true);
                    jTextFieldCSP.setEnabled(true);
                    jTextFieldNombre.setText(null);
                    jTextFieldCSP.setText(null);
                    jPasswordFieldContrasena.setText(null);
                } else {
                    String sql;
                    sql = "INSERT INTO usuario (nombreUsuario,password,saldo,CSP) ";
                    sql += "values ('" + nombreUsuario + "',MD5('" + password + "'),'" + saldo + "','" + CSP + "');";
                    JDBCclass.consulta3(sql);
                    JOptionPane.showMessageDialog(null, "¡Usuario creado correctamente!");
                    main();
                    jTextFieldNombre.setEnabled(true);
                    jTextFieldCSP.setEnabled(true);
                    jTextFieldNombre.setText(null);
                    jTextFieldCSP.setText(null);
                    jPasswordFieldContrasena.setText(null);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un problema");
            jTextFieldNombre.setEnabled(true);
            jTextFieldCSP.setEnabled(true);
            jTextFieldNombre.setText(null);
            jTextFieldCSP.setText(null);
            jPasswordFieldContrasena.setText(null);
        }
    }//GEN-LAST:event_BtnCrearUsuarioActionPerformed
    /**
     * Metodo autogenerado por Netbeans que borra un usuario previamente seleccionado en la tabla de usuarios en la pantalla de administrador
     * @param evt
     */
    private void BtnBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarUsuarioActionPerformed
        //codigo para eliminar un usuario seleccionado de la tabla de usuarios de la derecha
        if (jTable1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "¡Selecciona un usuario a borrar!");
        } else {
            try {
                JDBCclass JDBC = new JDBCclass();
                String nombreUsuario = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                if (nombreUsuario.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar el usuario");
                } else {
                    String sql3 = "SELECT COUNT(nombreCiudad) FROM ciudad WHERE nombreUsuario='" + nombreUsuario + "';";
                    ResultSet rs = JDBC.consulta1(sql3);
                    int temporary = 0;
                    if (rs.next()) {
                        temporary = rs.getInt(1);
                        System.out.println(temporary);
                    }
                    if (temporary != 0) {
                        String sql2;
                        sql2 = "UPDATE ciudad SET precioCiudad=null, nombreUsuario=null, bonificacion=null WHERE nombreUsuario='" + nombreUsuario + "';";
                        JDBC.consulta3(sql2);
                        String sql;
                        sql = "DELETE FROM usuario WHERE nombreUsuario='" + nombreUsuario + "';";
                        JDBC.consulta3(sql);
                        JOptionPane.showMessageDialog(null, "¡Usuario eliminado correctamente!");
                        main();
                    } else {
                        String sql;
                        sql = "DELETE FROM usuario WHERE nombreUsuario='" + nombreUsuario + "';";
                        JDBC.consulta3(sql);
                        JOptionPane.showMessageDialog(null, "¡Usuario eliminado correctamente!");
                        main();
                        jTextFieldNombre.setEnabled(true);
                        jTextFieldCSP.setEnabled(true);
                        jTextFieldNombre.setText(null);
                        jTextFieldCSP.setText(null);
                        jPasswordFieldContrasena.setText(null);
                    }
                }
                JDBC.state.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar el usuario");
            }
        }
    }//GEN-LAST:event_BtnBorrarUsuarioActionPerformed
    /**
     * Metodo autogenerado por Netbeans que cambia la contraseña de un usuario previamente seleccionado de la tabla de usuarios en la pantalla de administrador
     * @param evt
     */
    private void BtnCambiarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambiarPasswordActionPerformed
        //codigo para actualizar la contraseña del usuario seleccionado de la tabla derecha
        if (jTable1.getSelectedRow() >= 0) {
            String nombreUsuario = jTextFieldNombre.getText();
            String password = String.valueOf(jPasswordFieldContrasena.getPassword());
            String sql;
            sql = "UPDATE usuario SET password=MD5('" + password + "') WHERE nombreUsuario='" + nombreUsuario + "'; ";
            System.out.println(sql);
            try {
                JDBCclass.consulta3(sql);
                rellenausuarioscontrasena();
                JOptionPane.showMessageDialog(null, "¡Modificacion realizada correctamente!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede modificar el usuario");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Selecciona a un usuario!");
        }
    }//GEN-LAST:event_BtnCambiarPasswordActionPerformed
    /**
     * Metodo autogenerado por Netbeans que cierra la sesion y a su vez la ventana de administrador al pulsar el boton de salir
     * @param evt
     */
    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // codigo para salir de la pantalla de administrador
        try {
            this.dispose();
            LoginScreen logscreen = new LoginScreen();
            logscreen.setLocationRelativeTo(null);
            logscreen.setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AdminScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnSalirActionPerformed
    /**
     * Metodo de creacion propia que inserta los datos de los usuarios (nombre, el MD5 de la contraseña y el codigo CSP) en los textfield de la pantalla de administrador
     */
    public void insertadatos() {
        // codigo para insertar los datos obtenidos de la seleccion de una fila de la tabla a los campos jTextField de la parte superior izquierda
        if (jTable1.getSelectedRow() >= 0) {
            String usr = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            String pwd = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1));
            int Csp = (int) (jTable1.getValueAt(jTable1.getSelectedRow(), 2));
            jTextFieldNombre.setText(usr);
            jTextFieldNombre.setEnabled(false);
            jPasswordFieldContrasena.setText(pwd);
            jTextFieldCSP.setText(String.valueOf(Csp));
            jTextFieldCSP.setEnabled(false);
        } else {
            jTextFieldNombre.setEnabled(true);
            jTextFieldCSP.setEnabled(true);
        }
    }
    /**
     * Metodo autogenerado por Netbeans que llama a la funcion de insertadatos cuando una fila sea seleccionada de la tabla usuarios en la pantalla de administrador
     * @param evt
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // selecciona la fila deseada y la remarca con fondo azulado
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setCellSelectionEnabled(true);
        System.out.println(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        System.out.println(jTable1.getValueAt(jTable1.getSelectedRow(), 1));
        System.out.println(jTable1.getValueAt(jTable1.getSelectedRow(), 2));
        insertadatos();
        //aqui un codigo para que se deseleccione una vez acabado de insertar los datos a los jTextField
        jTable1.setColumnSelectionAllowed(false);
        jTable1.setCellSelectionEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked
    /**
     * Metodo autogenerado por Netbeans que al pulsar en todo lo que no son componentes, borra los valores de los textfield y deselecciona las filas en la tabla usuarios en la pantalla de administrador
     * @param evt
     */
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // al seleccionar este label, se vacian los campos de texto de la parte superior izquierda
        jTextFieldNombre.setEnabled(true);
        jTextFieldCSP.setEnabled(true);
        jTextFieldNombre.setText(null);
        jTextFieldCSP.setText(null);
        jPasswordFieldContrasena.setText(null);
        jTable1.setColumnSelectionAllowed(false);
        jTable1.setCellSelectionEnabled(false);
    }//GEN-LAST:event_jLabel4MouseClicked
    /**
     * Metodo de creacion propia que rellena la tabla de usuarios de la pantalla de administrador con los datos obtenidos de la consulta de Base de Datos (nombre y MD5 de la contraseña)
     */
    public static void rellenausuarioscontrasena() {
        //codigo para rellenar los usuarios en la tabla de la derecha en la pantalla de administrador
        try {
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
                java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            // codigo para añadir a la tabla los usuarios y sus contraseñas
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("Contraseña MD5");
            modelo.addColumn("CSP");

            Object[] usuarios = new Object[3];
            String sql;
            sql = "SELECT * FROM usuario; ";
            JDBCclass JDBC = new JDBCclass();
            ResultSet temporal = JDBC.consulta1(sql);
            while (temporal.next()) {
                String nombreUsuario = temporal.getString("nombreUsuario");
                String contraseña = temporal.getString("password");
                int CSp = temporal.getInt("CSP");
                usuarios[0] = nombreUsuario;
                usuarios[1] = contraseña;
                usuarios[2] = CSp;
                modelo.addRow(usuarios);
            }

            jTable1.setModel(modelo);
            JDBC.state.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un problema con la visualizacion de las tablas");
        }
    }
    /**
     * Metodo de creacion propia que nada mas ser lanzada la ventana de administrador, llama a la funcion de rellenausuarioscontrasena
     * @see rellenausuarioscontrasena()
     */
    public static void main() {
        rellenausuarioscontrasena();
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBorrarUsuario;
    private javax.swing.JButton BtnCambiarPassword;
    private javax.swing.JButton BtnCrearUsuario;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldContrasena;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCSP;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
