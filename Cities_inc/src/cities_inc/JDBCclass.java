/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;
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
    
    public String db = "u634818610_city";
    public String url = "jdbc:mysql://sql151.main-hosting.eu/"+db;
    public String user = "u634818610_pat";
    public String pass = "patsus123";
    private Connection conn = null;
   
    public JDBCclass() {
       
        try{
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection)DriverManager.getConnection(url, user, pass);
            if(conn != null)
            {
                System.out.println("Conexion a BBDD "+url+" . . . Ok");
            }
            //Statement s = conn.createStatement();
            //String query1 = "insert into user (nombreUsuario,password,saldo,CSP) value (\"user1\",\"mypassword\",NOW())";
            //s.executeUpdate(query1);
        }
        catch(SQLException ex)
        {
            System.out.println("Hubo un problema al intentar conecarse a la base de datos"+url);
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println(ex);
        }      
    }

}
