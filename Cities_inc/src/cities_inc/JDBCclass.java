/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrik
 */
public class JDBCclass {

    private static String db = "u634818610_city";
    private static String url = "jdbc:mysql://sql151.main-hosting.eu/" + db;
    private static String user = "u634818610_pat";
    private static String pass = "patsus123";
    private static Connection conn = null;
    public Statement state;

    public JDBCclass() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conexion a base de datos establecida");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al conecarse a la base de datos");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

    }

    public ResultSet consulta1(String sql) throws SQLException {//todos los select con multiples valores
        //Statement state = null;
        ResultSet resultado = null;
        state = (Statement) conn.createStatement();
        resultado = state.executeQuery(sql);
        // state.close();
        return resultado;
    }

    public boolean consulta2(String sql) throws SQLException {//count de un valor unico
        //Statement state = null;
        boolean estado = false;
        state = (Statement) conn.createStatement();
        state.executeQuery(sql);
        //state.close();
        return estado;
    }

    public void consulta3(String sql) throws SQLException {//update delete o insert
        //Statement state = null;
        state = (Statement) conn.createStatement();
        state.execute(sql);
        //state.close();
    }
    /*public static ResultSet consulta(String query1) {//para los select que devuelven multiples resultados
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Connection");
            Connection conn1 = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn1 != null) {
                System.out.println("Conectado.");
                //System.out.println("Conexion a BBDD: " + url + " . . . Ok");
            }
            Statement s = conn1.createStatement();
            rs = s.executeQuery(query1);
            s.close();
            conn1.close();
        } catch (SQLException ex) {
            System.out.println("Ups..¡Algo falla de esta conexion!: " + url);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public static boolean consulta2(String query2) {//un valor unico para count e verdadero o falso 
        boolean estado = false;
        try {
            Class.forName("com.mysql.jdbc.Connection");
            Connection conn2 = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn2 != null) {
                System.out.println("Conectado.");
                //System.out.println("Conexion a BBDD: " + url + " . . . Ok");
            }
            Statement x = conn2.createStatement();

            estado = x.execute(query2);
            x.close();
            conn2.close();
        } catch (SQLException ex) {
            System.out.println("Ups..¡Algo falla de esta conexion!: " + url);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return estado;
    }

    public static void consulta3(String query3) {//update delete o insert
        try {
            Class.forName("com.mysql.jdbc.Connection");
            Connection conn3 = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn3 != null) {
                System.out.println("Conectado.");
                //System.out.println("Conexion a BBDD: " + url + " . . . Ok");
            }
            Statement u = conn3.createStatement();
            u.executeQuery(query3);
            u.close();
            conn3.close();
        } catch (SQLException ex) {
            System.out.println("Ups..¡Algo falla de esta conexion!: " + url);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    /*public static ResultSet conectionBD(String sql) {//throws java.lang.Exception {
        
        ResultSet rs=null;
        try {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("u634818610_pat");
        dataSource.setPassword("patsus123");
        dataSource.setServerName("jdbc:mysql://sql151.main-hosting.eu/u634818610_city");
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);
        
        rs.close();
        stmt.close();
        conn.close();
        }catch (SQLException ex) {
            System.out.println("Ups..¡Algo falla de esta conexion!: " + url);
        } 
        return rs;
    }*/
}
