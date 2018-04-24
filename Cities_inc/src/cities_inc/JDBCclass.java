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
    public static Statement state;

    public JDBCclass() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conexion establecida");
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

    public static void consulta3(String sql) throws SQLException {//update delete o insert
        //Statement state = null;
        state = (Statement) conn.createStatement();
        state.executeUpdate(sql);
        //state.close();
    }
}
