
package cities_inc;
import org.json.*;
import java.sql.Connection;
/**
 *
 * @author Patrik
 */
public class MainClass {

    /**
     *
     * @param args
     * @throws JSONException
     */
    public static void main(String[] args) throws JSONException {
        // TODO code application logic here
       boolean logueado;
       
    /**
     *
     */
   /* java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
                    new LoginScreen().setVisible(true);
                }

    });*/
       JDBCclass c1=new JDBCclass();//conexion con BD
       CiudadClass.obtenerParadas();//Obtiene el numero de paradas de la ciudad
       CiudadClass.precioCiudad();//Obtiene el precio de la ciudad
       CiudadClass.bonificacion();//Obtiene la bonificacion por comprar la ciudad
    }
    
}
