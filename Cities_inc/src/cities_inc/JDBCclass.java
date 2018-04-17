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
    
    private static String db = "u634818610_city";
    private static String url = "jdbc:mysql://sql151.main-hosting.eu/"+db;
    private static String user = "u634818610_pat";
    private static String pass = "patsus123";
    private static Connection conn = null;

    public static ResultSet consulta(String query1) {//para los select que devuelven multiples resultados
        ResultSet rs=null;
        try{
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection)DriverManager.getConnection(url, user, pass);
            if(conn != null)
            {
                System.out.println("Conexion a BBDD "+url+" . . . Ok");
            }
            Statement s = conn.createStatement();
            rs=s.executeQuery(query1);
            s.close(); 
        }
        catch(SQLException ex)
        {
            System.out.println("Hubo un problema al intentar conectarse a la base de datos"+url);
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println(ex);
        }      
        return rs;
    }
    
     public static boolean consulta2(String query2) {//un valor unico para count 
        boolean estado=false;
       
        try{
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection)DriverManager.getConnection(url, user, pass);
            if(conn != null)
            {
                System.out.println("Conexion a BBDD "+url+" . . . Ok");
            }
            Statement x = conn.createStatement();
            
            estado=x.execute(query2);
            x.close();
        }
        catch(SQLException ex)
        {
            System.out.println("Hubo un problema al intentar conectarse a la base de datos"+url);
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println(ex);
        }      
        return estado;
    }
     
      public static void consulta3(String query3) {//update delete o insert

        try{
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection)DriverManager.getConnection(url, user, pass);
            if(conn != null)
            {
                System.out.println("Conexion a BBDD "+url+" . . . Ok");
            }
            Statement u = conn.createStatement();
            u.executeQuery(query3);
            u.close();
        }
        catch(SQLException ex)
        {
            System.out.println("Hubo un problema al intentar conectarse a la base de datos"+url);
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println(ex);
        }      
    }
}
