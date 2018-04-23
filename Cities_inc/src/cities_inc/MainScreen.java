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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Patrik
 */
public class MainScreen extends javax.swing.JFrame {
//  public static String []paises=new String[60];
//  public static String []ciudades=new String[paises.length];

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
        ComboPaises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboPaisesMouseClicked(evt);
            }
        });
        ComboPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPaisesActionPerformed(evt);
            }
        });

        BtnSeleccionar.setText("Seleccionar");
        BtnSeleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSeleccionarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnComprar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnVender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnRanking)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnLogout)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSeleccionar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnComprar)
                    .addComponent(BtnVender)
                    .addComponent(BtnRanking))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPaisesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ComboPaisesActionPerformed

    private void BtnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRankingActionPerformed
        RankingScreen RK = new RankingScreen();
        RankingScreen.main();
        RK.setVisible(true);
    }//GEN-LAST:event_BtnRankingActionPerformed

    private void BtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarActionPerformed
        // TODO add your handling code here:
        try {
        //String ciudadcomprada=jTableCiudades.get();
        String sql;
            sql = "INSERT INTO ciudad () values(); ";
            JDBCclass JDBC = new JDBCclass();
            JDBC.consulta3(sql);
            System.out.println("Operacion de compra realizada correctamente");
        }catch (SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnComprarActionPerformed

    private void ComboPaisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboPaisesMouseClicked
       /* try {
            // TODO add your handling code here
            String pais = String.valueOf(ComboPaises.getSelectedItem());
            String sql;
            sql = "SELECT * ";
            sql += "FROM ciudad ";
            sql += "WHERE pais='" + pais + "';";
            JDBCclass JDBC = new JDBCclass();
            ResultSet temporal = JDBC.consulta1(sql);
            //jTableCiudades = new javax.swing.JTable();
            DefaultTableModel modelo = new DefaultTableModel();
            jTableCiudades.setModel(modelo);
            Object[] ciudades= new Object[4];
            //falta saber como meter en jtable la informacion que obtiene
            while (temporal.next()) {
                String URL = temporal.getString("URL");
                String nombreCiudad = temporal.getString("nombreCiudad");
                int paradas = RestAPIClass.obtenerParadas(URL);
                int precioCiudad = CiudadClass.precioCiudad(paradas);
                int bonificacion = CiudadClass.bonificacion();
                ciudades[0]=nombreCiudad;
                ciudades[1]=precioCiudad;
                ciudades[2]=bonificacion;
                ciudades[3]=paradas;
                modelo.addRow(ciudades);
            }
            JDBC.state.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_ComboPaisesMouseClicked

    private void BtnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVenderActionPerformed
        // TODO add your handling code here:
        try {
        //String ciudadvendida=jTableCiudades.get();
        String sql;
            sql = "DELETE FROM ciudad () values(); ";
            JDBCclass JDBC = new JDBCclass();
            JDBC.consulta3(sql);
            System.out.println("Operacion de venta realizada correctamente");
        }catch (SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnVenderActionPerformed

    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtnLogoutActionPerformed

    private void BtnSeleccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSeleccionarMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here
            String pais = String.valueOf(ComboPaises.getSelectedItem());
            String sql;
            sql = "SELECT * ";
            sql += "FROM ciudad ";
            sql += "WHERE pais='" + pais + "';";
            JDBCclass JDBC = new JDBCclass();
            ResultSet temporal = JDBC.consulta1(sql);
            //jTableCiudades = new javax.swing.JTable();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio (€)");
            modelo.addColumn("Bonificacion (%)");
            modelo.addColumn("Paradas");
            jTableCiudades.setModel(modelo);
            Object[] ciudades= new Object[4];
            //falta saber como meter en jtable la informacion que obtiene
            while (temporal.next()) {
                String URL = temporal.getString("URL");
                String nombreCiudad = temporal.getString("nombreCiudad");
                int paradas = RestAPIClass.obtenerParadas(URL);
                int precioCiudad = CiudadClass.precioCiudad(paradas);
                int bonificacion = CiudadClass.bonificacion();
                ciudades[0]=nombreCiudad;
                ciudades[1]=precioCiudad;
                ciudades[2]=bonificacion;
                ciudades[3]=paradas;
                modelo.addRow(ciudades);
            }
            JDBC.state.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnSeleccionarMouseClicked

    /**
     * @param args the command line arguments
     */static String user = LoginScreen.nombreUsuario;
    public static void rellenausuario() throws SQLException {
        
        JDBCclass JDBC = new JDBCclass();
        String sql;
        sql = "SELECT saldo FROM usuario WHERE nombreUsuario='" + user + "';";
        ResultSet temp = JDBC.consulta1(sql);
        while (temp.next()) {
            int saldo = temp.getInt("saldo");
            TextSaldoActual.setText(String.valueOf(saldo));
        }
        jLabel2.setText(user);
        JDBC.state.close();
    }
    public static void rellenatablapropiedad() throws SQLException{
        //aqui todo el query para obtener las ciudades compradas
        String sql;
            sql = "SELECT * ";
            sql += "FROM ciudad ";
            sql += "WHERE nombreUsuario='" + user + "';";
            JDBCclass JDBC = new JDBCclass();
            ResultSet temporal = JDBC.consulta1(sql);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("Paradas");
            jTablePropiedad.setModel(modelo);
            Object[] propiedad= new Object[2];
            while (temporal.next()) {
                String URL = temporal.getString("URL");
                String nombreCiudad = temporal.getString("nombreCiudad");
                int paradas = RestAPIClass.obtenerParadas(URL);
//                int precioCiudad = CiudadClass.precioCiudad(paradas);
//                int bonificacion = CiudadClass.bonificacion();
                propiedad[0]=nombreCiudad;
                propiedad[1]=paradas;               
                modelo.addRow(propiedad);
            }
            JDBC.state.close();           
    }
    public static void rellenapais(/*String args[]*/) throws SQLException {
        JDBCclass JDBC = new JDBCclass();
        String sql;
        sql = "SELECT pais FROM ciudad GROUP BY pais;";
        ResultSet temporal = JDBC.consulta1(sql);
        while (temporal.next()) {
            String pais = temporal.getString("pais");
            ComboPaises.addItem(pais);//añade los paises al combobox              
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
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTableCiudades;
    public static javax.swing.JTable jTablePropiedad;
    // End of variables declaration//GEN-END:variables
}
