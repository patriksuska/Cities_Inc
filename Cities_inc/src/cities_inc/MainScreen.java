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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Patrik
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     *
     * @throws java.sql.SQLException
     */
    public MainScreen() throws SQLException {
        initComponents();
        rellenausuario();
        rellenapais();
        rellenatablapropiedad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCiudades = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePropiedad = new javax.swing.JTable();
        BtnComprar = new javax.swing.JButton();
        BtnVender = new javax.swing.JButton();
        BtnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextSaldoActual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnRanking = new javax.swing.JButton();
        ComboPaises = new javax.swing.JComboBox<>();
        BtnSeleccionar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));

        jTableCiudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCiudades);

        jTablePropiedad.setAutoCreateRowSorter(true);
        jTablePropiedad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTablePropiedad);

        BtnComprar.setText("Comprar");
        BtnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarActionPerformed(evt);
            }
        });

        BtnVender.setText("Vender");
        BtnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVenderActionPerformed(evt);
            }
        });

        BtnLogout.setText("Cerrar Sesion");
        BtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setText("¡  Hola: ");

        jLabel2.setText("Nombre de Usuario");

        jLabel3.setText("!");

        TextSaldoActual.setEditable(false);

        jLabel4.setText("€");

        jLabel5.setText("Saldo actual:");

        jLabel6.setText("Tus ciudades:");

        jLabel7.setText("Ciudades disponibles:");

        BtnRanking.setText("Ranking");
        BtnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRankingActionPerformed(evt);
            }
        });

        ComboPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Pais" }));

        BtnSeleccionar.setText("Seleccionar");
        BtnSeleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSeleccionarMouseClicked(evt);
            }
        });

        jButton1.setText("Cobrar");

        jLabel8.setText("€");

        jLabel9.setText("Dinero acumulado/mes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(116, 116, 116)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextSaldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ComboPaises, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnSeleccionar)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnComprar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnVender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnRanking)
                        .addGap(239, 239, 239)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnLogout))
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnLogout)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(TextSaldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSeleccionar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnComprar)
                    .addComponent(BtnVender)
                    .addComponent(BtnRanking)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRankingActionPerformed
        RankingScreen RK = new RankingScreen();
        RankingScreen.main();
        RK.setVisible(true);
    }//GEN-LAST:event_BtnRankingActionPerformed
    static int precioCiudad;
    private void BtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarActionPerformed
        // TODO add your handling code here:
        //codigo query para comprar una ciudad
        try {
            String usr=jLabel2.getText();
            JDBCclass JDBC = new JDBCclass();
            int filasseleccionadas=jTableCiudades.getSelectedRowCount();
            if(filasseleccionadas!=0){
            String ciudadcomprada = String.valueOf(jTableCiudades.getValueAt(jTableCiudades.getSelectedRow(), 0));      
            precioCiudad = (int) (jTableCiudades.getValueAt(jTableCiudades.getSelectedRow(), 1));
            int bonificacion = (int) (jTableCiudades.getValueAt(jTableCiudades.getSelectedRow(), 2));
            if(precioCiudad==0){
                JOptionPane.showMessageDialog(null, "¡No puedes comprar esta ciudad!");
            }else{
                if(saldo<precioCiudad){
                    JOptionPane.showMessageDialog(null, "¡No dispones de saldo suficiente para comprar esta ciudad!");
                }else{
            String sql;
            sql = "UPDATE ciudad SET precioCiudad=" + precioCiudad + ", nombreUsuario='" + usr + "', bonificacion=" + bonificacion + " WHERE nombreCiudad='" + ciudadcomprada + "';";
            System.out.println(sql);
            JDBC.consulta3(sql);
            saldo = saldo - precioCiudad;           
            String sql2 = "UPDATE usuario SET saldo=" + saldo + " where nombreUsuario='" + usr + "';";
            JDBC.consulta3(sql2);
            rellenausuario();
            insertarciudades();
            rellenatablapropiedad();
            
            JOptionPane.showMessageDialog(null, "Compra realizada correctamente");
            JDBC.state.close();
                }
            }
            }else{
                JOptionPane.showMessageDialog(null, "¡Selecciona una ciudad a comprar!");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede comprar la ciudad");
        }
    }//GEN-LAST:event_BtnComprarActionPerformed

    private void BtnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVenderActionPerformed
        // TODO add your handling code here:
        //codigo query para vender una ciudad
        try {
            String usr=jLabel2.getText();
            JDBCclass JDBC = new JDBCclass();
            int filasseleccionadas=jTablePropiedad.getSelectedRowCount();
            if(filasseleccionadas!=0){
            String ciudadvendida = String.valueOf(jTablePropiedad.getValueAt(jTablePropiedad.getSelectedRow(), 0));
            String sql3="SELECT precioCiudad FROM ciudad WHERE nombreCiudad='"+ciudadvendida+"';";
            ResultSet tmp=JDBC.consulta1(sql3);
            int preuCiudad=0;
            if(tmp.next()){
                preuCiudad=tmp.getInt("precioCiudad");
            }
            String sql;
            sql = "UPDATE ciudad SET precioCiudad=null, nombreUsuario=null, bonificacion=null WHERE nombreCiudad='" + ciudadvendida + "';";           
            JDBC.consulta3(sql);
            saldo = saldo+(75*preuCiudad/100);
            String sql2 = "UPDATE usuario SET saldo=" + saldo + " where nombreUsuario='" + usr + "';";          
            JDBC.consulta3(sql2);
            rellenausuario();
            rellenatablapropiedad();
            insertarciudades();
            JOptionPane.showMessageDialog(null, "Venta realizada correctamente");
            JDBC.state.close();
            }else{
                JOptionPane.showMessageDialog(null, "¡Selecciona una ciudad a vender!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede vender la ciudad");
        }
    }//GEN-LAST:event_BtnVenderActionPerformed

    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
        // TODO add your handling code here:
        dispose();     
        LoginScreen lg=new LoginScreen();
        lg.setVisible(true);
    }//GEN-LAST:event_BtnLogoutActionPerformed
    public void insertarciudades() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio (€)");
        modelo.addColumn("Bonificacion (%)");
        modelo.addColumn("Paradas");
        jTableCiudades.setModel(modelo);
        try {
            // codigo para insertar ciudades de un pais seleccionado en la tabla
            String pais = String.valueOf(ComboPaises.getSelectedItem());
            if(pais.equals("Selecciona Pais")){
                JOptionPane.showMessageDialog(null, "¡Selecciona un pais existente!");
            }else{
            String sql;
            sql = "SELECT * ";
            sql += "FROM ciudad ";
            sql += "WHERE pais='" + pais + "' and nombreUsuario is null;";
            JDBCclass JDBC = new JDBCclass();
            ResultSet temporal = JDBC.consulta1(sql);
            Object[] ciudades = new Object[4];
            while (temporal.next()) {
                String URL = temporal.getString("URL");
                String nombreCiudad = temporal.getString("nombreCiudad");
                int paradas = RestAPIClass.obtenerParadas(URL);
                precioCiudad = CiudadClass.precioCiudad(paradas);
                int bonificacion = CiudadClass.bonificacion(paradas);
                ciudades[0] = nombreCiudad;
                ciudades[1] = precioCiudad;
                ciudades[2] = bonificacion;
                ciudades[3] = paradas;
                modelo.addRow(ciudades);
            }
            JDBC.state.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al mostrar el listado de ciudades");
        }
    }
    private void BtnSeleccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSeleccionarMouseClicked
        // TODO add your handling code here:
        insertarciudades();
    }//GEN-LAST:event_BtnSeleccionarMouseClicked

    /**
     * @param args the command line arguments
     */
    static int saldo;

    //codigo para rellenar los campos sobre el usuario(nombre y su saldo)
    public static void rellenausuario() throws SQLException {
        String usr=LoginScreen.nombreUsuario;
        JDBCclass JDBC = new JDBCclass();
        String sql;
        sql = "SELECT saldo FROM usuario WHERE nombreUsuario='" + usr + "';";
        ResultSet temp = JDBC.consulta1(sql);
        while (temp.next()) {
            saldo = temp.getInt("saldo");
            TextSaldoActual.setText(String.valueOf(saldo));
        }
        jLabel2.setText(usr);
        JDBC.state.close();
    }

    //codigo para rellenar la tabla de tus ciudades
    public static void rellenatablapropiedad() throws SQLException {
        //aqui todo el query para obtener las ciudades compradas
        String usr=LoginScreen.nombreUsuario;
        String sql;
        sql = "SELECT * ";
        sql += "FROM ciudad ";
        sql += "WHERE nombreUsuario='" + usr + "';";
        JDBCclass JDBC = new JDBCclass();
        ResultSet temporal = JDBC.consulta1(sql);
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Bonificacion");
        modelo1.addColumn("Paradas");
        modelo1.addColumn("Recaudacion/mes (€)");
        jTablePropiedad.setModel(modelo1);
        Object[] propiedad = new Object[4];
        while (temporal.next()) {
            String URL = temporal.getString("URL");
            String nombreCiudad = temporal.getString("nombreCiudad");
            int paradas = RestAPIClass.obtenerParadas(URL);
            int bon = temporal.getInt("bonificacion");
            int preciociudad=temporal.getInt("precioCiudad");
            int boneuros = CiudadClass.boneuro(bon, preciociudad);
            propiedad[0] = nombreCiudad;
            propiedad[1] = bon;
            propiedad[2] = paradas;
            propiedad[3] = boneuros;
            modelo1.addRow(propiedad);
            
        }
        JDBC.state.close();
        
    }
    //codigo para sumar todos los benificios de las ciudades en uno
//    public static void sumarbenificios(){
//        int benificios=0;
//        benificios=(int)jTablePropiedad.getValueAt(jTablePropiedad.getSelectedColumn(),4);
//        int beni=0;
//             beni+=benificios;
//        System.out.println(beni);
//    }
    //codigo para rellenar el combobox de paises desde la BD
    public static void rellenapais(/*String args[]*/) throws SQLException {
        JDBCclass JDBC = new JDBCclass();
        String sql;
        sql = "SELECT pais FROM ciudad GROUP BY pais;";
        ResultSet temporal = JDBC.consulta1(sql);
        while (temporal.next()) {
            String pais = temporal.getString("pais");
            ComboPaises.addItem(pais);
        }
        JDBC.state.close();
        // Create and display the form 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnComprar;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JButton BtnRanking;
    private javax.swing.JButton BtnSeleccionar;
    private javax.swing.JButton BtnVender;
    public static javax.swing.JComboBox<String> ComboPaises;
    public static javax.swing.JTextField TextSaldoActual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTableCiudades;
    public static javax.swing.JTable jTablePropiedad;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
