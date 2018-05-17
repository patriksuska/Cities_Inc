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
import javax.swing.table.DefaultTableModel;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Clase llamada MainScreen que es la pantalla de juego
 * @author Patrik
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Constructor de la clase MainScreen el cual lanza los metodos que tiene en el constructor (rellenausuario,rellenapais,rellenatablapropiedad)
     * @throws SQLException Excepcion SQL en caso de un sql mal escrito
     * @throws UnsupportedLookAndFeelException  En caso de que no este soportado el LookAndFeel
     * @throws InstantiationException  En caso de que la instanciacion falle
     * @throws IllegalAccessException En caso de que hay un inicio no esperado
     * @throws ClassNotFoundException Por si la clase no se encuentra
     */
    public MainScreen() throws SQLException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        setUndecorated(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
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

        jPanel1 = new javax.swing.JPanel();
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
        jTextFieldAcumulado = new javax.swing.JTextField();
        Cobrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(29, 0));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 103, -1, 365));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 68, -1, 399));

        BtnComprar.setText("Comprar");
        BtnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 474, -1, -1));

        BtnVender.setText("Vender");
        BtnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVenderActionPerformed(evt);
            }
        });
        jPanel1.add(BtnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 474, 70, -1));

        BtnLogout.setText("Cerrar Sesion");
        BtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 12, -1, -1));

        jLabel1.setText("¡  Hola: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 15, -1, -1));

        jLabel2.setText("Nombre de Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 15, -1, -1));

        jLabel3.setText("!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 15, -1, -1));

        TextSaldoActual.setEditable(false);
        jPanel1.add(TextSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 13, 113, -1));

        jLabel4.setText("€");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 16, -1, -1));

        jLabel5.setText("Saldo actual:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 16, -1, -1));

        jLabel6.setText("Tus ciudades:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 47, 452, -1));

        jLabel7.setText("Ciudades disponibles:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 47, 458, -1));

        BtnRanking.setText("Ranking");
        BtnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRankingActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 474, -1, -1));

        ComboPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Pais" }));
        jPanel1.add(ComboPaises, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, 345, -1));

        BtnSeleccionar.setText("Seleccionar");
        BtnSeleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSeleccionarMouseClicked(evt);
            }
        });
        jPanel1.add(BtnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 69, 90, -1));

        jTextFieldAcumulado.setEditable(false);
        jPanel1.add(jTextFieldAcumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 475, 140, -1));

        Cobrar.setText("Cobrar");
        Cobrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CobrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(846, 474, 90, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("€");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 478, 20, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dinero acumulado durante el mes:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 478, 170, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Patrik\\Documents\\NetBeansProjects\\Cities_Inc\\Cities_inc\\lib\\city-wallpaper-1.jpg")); // NOI18N
        jLabel10.setText("jLabel11");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -13, 960, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo autogenerado por Netbeans que abre la pantalla de Ranking al pulsar el boton llamado ranking
     * @param evt 
     */
    private void BtnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRankingActionPerformed
        //codigo para ver el ranking de usuarios
        try {
            RankingScreen RK = new RankingScreen();
            RK.setLocationRelativeTo(null);
            RankingScreen.main();
            RK.setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnRankingActionPerformed
    /**
     * Variable que contiene el precio de una ciudad autogenerada en la clase Ciudad
     * @see precioCiudad
     */
    public static int precioCiudad;
    /**
     * Metodo autogenerado por Netbeans para realizar la accion de compra de la ciudad al pulsar el boton Comprar
     * @param evt 
     */
    private void BtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarActionPerformed
        //codigo para comprar una ciudad
        try {
            String usr = jLabel2.getText();
            JDBCclass JDBC = new JDBCclass();
            int filasseleccionadas = jTableCiudades.getSelectedRowCount();
            if (filasseleccionadas != 0) {
                String ciudadcomprada = String.valueOf(jTableCiudades.getValueAt(jTableCiudades.getSelectedRow(), 0));
                precioCiudad = (int) (jTableCiudades.getValueAt(jTableCiudades.getSelectedRow(), 1));
                int bonificacion = (int) (jTableCiudades.getValueAt(jTableCiudades.getSelectedRow(), 2));
                if (precioCiudad == 0) {
                    JOptionPane.showMessageDialog(null, "¡No puedes comprar esta ciudad!");
                } else {
                    if (saldo < precioCiudad) {
                        JOptionPane.showMessageDialog(null, "¡No dispones de saldo suficiente para comprar esta ciudad!");
                    } else {
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
                        filascantidad++;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Selecciona una ciudad a comprar!");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede comprar la ciudad");
        }

    }//GEN-LAST:event_BtnComprarActionPerformed
    /**
     * Metodo autogenerado por Netbeans para vender una ciudad seleccionada al pulsar el boton de vender
     * @param evt 
     */
    private void BtnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVenderActionPerformed
        //codigo query para vender una ciudad
        try {
            String usr = jLabel2.getText();
            JDBCclass JDBC = new JDBCclass();
            int filasseleccionadas = jTablePropiedad.getSelectedRowCount();
            if (filasseleccionadas != 0) {
                String ciudadvendida = String.valueOf(jTablePropiedad.getValueAt(jTablePropiedad.getSelectedRow(), 0));
                String sql3 = "SELECT precioCiudad FROM ciudad WHERE nombreCiudad='" + ciudadvendida + "';";
                ResultSet tmp = JDBC.consulta1(sql3);
                int preuCiudad = 0;
                if (tmp.next()) {
                    preuCiudad = tmp.getInt("precioCiudad");
                }
                String sql;
                sql = "UPDATE ciudad SET precioCiudad=null, nombreUsuario=null, bonificacion=null WHERE nombreCiudad='" + ciudadvendida + "';";
                JDBC.consulta3(sql);
                saldo = saldo + (75 * preuCiudad / 100);
                String sql2 = "UPDATE usuario SET saldo=" + saldo + " where nombreUsuario='" + usr + "';";
                JDBC.consulta3(sql2);
                rellenausuario();
                rellenatablapropiedad();
                insertarciudades();
                JOptionPane.showMessageDialog(null, "Venta realizada correctamente");
                JDBC.state.close();
                filascantidad--;
            } else {
                JOptionPane.showMessageDialog(null, "¡Selecciona una ciudad a vender!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede vender la ciudad");
        }
    }//GEN-LAST:event_BtnVenderActionPerformed
    /**
     * Metodo autogenerado por Netbeans para que cuando se pulse el boton de cerrar sesion se cierra esta ventana y lanza la de Login
     * @param evt 
     */
    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
        //codigo para cerrar sesion
        try {
            dispose();
            LoginScreen lg = new LoginScreen();
            lg.setLocationRelativeTo(null);
            lg.setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnLogoutActionPerformed
    /**
     * Metodo de creacion propia que inserta las ciudades de un pais seleccionado previamente
     */
    public void insertarciudades() {
        //codigo para insertar las ciudades en la tabla de ciudades disponibles de un pais seleccionado previamente
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio (€)");
        modelo.addColumn("Bonificacion (%)");
        modelo.addColumn("Paradas");
        jTableCiudades.setModel(modelo);
        try {
            String pais = String.valueOf(ComboPaises.getSelectedItem());
            if (pais.equals("Selecciona Pais")) {
                JOptionPane.showMessageDialog(null, "¡Selecciona un pais existente!");
            } else {
                String sql;
                sql = "SELECT * ";
                sql += "FROM ciudad ";
                sql += "WHERE pais='" + pais + "' and nombreUsuario is null ORDER BY nombreCiudad;";
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
    /**
     * Metodo autogenerado por Netbeans que llama a la funcion insertaciudades una vez que se ha seleccionado el pais y se le ha dado click al boton seleccionar
     * @param evt 
     */
    private void BtnSeleccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSeleccionarMouseClicked
//codigo para seleccionar el pais pulsando el boton seleccionar
        insertarciudades();
    }//GEN-LAST:event_BtnSeleccionarMouseClicked
    /**
     * Metodo autogenerado por Netbeans que realiza el cobro de la bonificacion al pulsar el boton Cobrar
     * @param evt 
     */
    private void CobrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CobrarMouseClicked
        //codigo para cobrar las bonificaciones acumuladas
        try {
            if (beni == 0) {
                JOptionPane.showMessageDialog(null, "No tienes dinero acumulado");
            } else {
                saldo = saldo + beni;
                String usr = jLabel2.getText();
                JDBCclass JDBC = new JDBCclass();
                String sql2 = "UPDATE usuario SET saldo=" + saldo + " where nombreUsuario='" + usr + "';";
                JDBC.consulta3(sql2);
                rellenausuario();
                beni = 0;
                jTextFieldAcumulado.setText(String.valueOf(beni));
                JDBC.state.close();
                JOptionPane.showMessageDialog(null, "Cobro realizado correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el saldo del jugador");
        }

    }//GEN-LAST:event_CobrarMouseClicked

    /**
     * Variable estatica de tipo entero que contiene el saldo del usuario
     */
    static int saldo;
    /**
     * Metodo de creacion propia que rellena los datos del usuario en el label de usuario y en el textfield de saldo 
     * @throws SQLException En caso de que falle la consulta sql
     */
    public static void rellenausuario() throws SQLException {
        //codigo para rellenar los campos sobre el usuario(nombre y su saldo)
        String usr = LoginScreen.nombreUsuario;
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
    /**
     * Metodo de creacion propia que rellena la tabla de TusCiudades en la pantalla del juego con las ciudades que tiene el usuario en propiedad
     * @throws SQLException En caso de que falle la consulta sql
     */
    public static void rellenatablapropiedad() throws SQLException {
        //codigo para rellenar la tabla de tus ciudades compradas
        String usr = LoginScreen.nombreUsuario;
        String sql;
        sql = "SELECT * ";
        sql += "FROM ciudad ";
        sql += "WHERE nombreUsuario='" + usr + "';";
        JDBCclass JDBC = new JDBCclass();
        ResultSet temporal = JDBC.consulta1(sql);
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Bonificacion (%)");
        modelo1.addColumn("Paradas");
        modelo1.addColumn("Recaudacion/mes (€)");
        jTablePropiedad.setModel(modelo1);
        Object[] propiedad = new Object[4];
        while (temporal.next()) {
            String URL = temporal.getString("URL");
            String nombreCiudad = temporal.getString("nombreCiudad");
            int paradas = RestAPIClass.obtenerParadas(URL);
            int bon = temporal.getInt("bonificacion");
            int preciociudad = temporal.getInt("precioCiudad");
            int boneuros = CiudadClass.boneuro(bon, preciociudad);
            propiedad[0] = nombreCiudad;
            propiedad[1] = bon;
            propiedad[2] = paradas;
            propiedad[3] = boneuros;
            modelo1.addRow(propiedad);

        }
        JDBC.state.close();
    }
    /**
     * Variable de tipo entero que contiene el benificio generado por el metodo llamado sumarbenificios
     * @see sumarbenificios()
     */
    public static int beni;
    /**
     * Variable que contiene la cantidad de filas existentes en la tabla TusCiudades a la hora de realizar la suma de los benificios
     */
    public static int filascantidad;
    /**
     * Metodo de creacion propia que suma los benificios de cada una de las ciudades en propiedad del usuario y las junta todas en un textfield llamado jTextFieldAcumulado
     */
    public static void sumarbenificios() {
        //codigo para sumar todos los benificios de las ciudades en un campo
        int benificios = 0;
        int filascant = jTablePropiedad.getRowCount();
        System.out.println(filascant + "" + filascantidad);
        if (filascantidad >= filascant) {
            for (int i = 0; i < filascant; i++) {
                benificios = (int) jTablePropiedad.getValueAt(i, 3);
                beni = beni + benificios;
            }
            jTextFieldAcumulado.setText(String.valueOf(beni));
        } else if (filascantidad < filascant) {
            benificios = 0;
            beni = 0;
            for (int i = 0; i < filascant; i++) {
                benificios = (int) jTablePropiedad.getValueAt(i, 3);
                beni = beni + benificios;
            }
            jTextFieldAcumulado.setText(String.valueOf(beni));
        }
    }
    /**
     * Metodo de creacion propia que inserta los paises existentes de la Base de Datos en un comboBox antes de que el usuario realize cualquier operacion
     * @throws SQLException En caso de que el sql no se realize correctamente 
     */
    public static void rellenapais() throws SQLException {
        //codigo para rellenar el combobox de paises desde la BD
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

    /**
     * Metodo de creacion propia que autoejecuta cada X tiempo la funcion de sumarbenificios
     * @see sumarbenificios()
     */
    public static void main() {
        //funcion que se autoejecuta cada minuto y hace la funcion de sumarbenificios(); de forma repetida
        filascantidad = jTablePropiedad.getRowCount();
        ScheduledExecutorService execService = Executors.newScheduledThreadPool(5);
        execService.scheduleAtFixedRate(() -> {
            sumarbenificios();
            System.out.println("Sumando benificios");
        }, 0, 1, TimeUnit.MINUTES);//el retraso de inicio y cada cuanto se repite y la medida del tiempo

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnComprar;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JButton BtnRanking;
    private javax.swing.JButton BtnSeleccionar;
    private javax.swing.JButton BtnVender;
    private javax.swing.JButton Cobrar;
    public static javax.swing.JComboBox<String> ComboPaises;
    public static javax.swing.JTextField TextSaldoActual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTableCiudades;
    public static javax.swing.JTable jTablePropiedad;
    public static javax.swing.JTextField jTextFieldAcumulado;
    // End of variables declaration//GEN-END:variables
}
