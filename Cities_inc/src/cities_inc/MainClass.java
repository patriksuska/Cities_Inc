/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;
import org.json.*;
import java.sql.Connection;
/**
 *
 * @author Patrik
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException {
        // TODO code application logic here
        
       CiudadClass.obtenerParadas();
       CiudadClass.precioCiudad();
       JDBCclass c1=new JDBCclass();
       
    }
    
}
