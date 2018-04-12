/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;
//import java.sql.*;
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
   /* public Connection Conectar(){

      Connection link = null;

       try{

           Class.forName("com.mysql.jdbc.Connection");

           link = (Connection)DriverManager.getConnection(this.url, this.user, this.pass);
           System.out.println("Funciono");
       }catch(Exception ex){

           JOptionPane.showMessageDialog(null, ex);

       }


       
       return link;
   }*/
    public JDBCclass() {
       
        try{
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection)DriverManager.getConnection(url, user, pass);
            if(conn != null)
            {
                System.out.println("Conexi-n a base de datos "+url+" . . . Ok");
            }
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
