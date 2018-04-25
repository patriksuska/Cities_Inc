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
    //datos de acceso a la BD
    private static String db = "u634818610_city";
    private static String url = "jdbc:mysql://sql151.main-hosting.eu/" + db;
    private static String user = "u634818610_pat";
    private static String pass = "patsus123";
    private static Connection conn = null;
    public static Statement state;
    // funcion de conexion con la BD
    public JDBCclass() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conexion establecida");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al conectarse a la base de datos");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    // funcion de consulta para los select
    public ResultSet consulta1(String sql) throws SQLException {
        ResultSet resultado = null;
        state = (Statement) conn.createStatement();
        resultado = state.executeQuery(sql);
        return resultado;
    }
    //funcion de consulta para los select count(en general los que devuelven un true/false
    public boolean consulta2(String sql) throws SQLException {
        boolean estado = false;
        state = (Statement) conn.createStatement();
        state.executeQuery(sql);
        return estado;
    }
    //funcion para el update delete o insert que no devuelve nada
    public static void consulta3(String sql) throws SQLException {
        state = (Statement) conn.createStatement();
        state.executeUpdate(sql);
    }
}
