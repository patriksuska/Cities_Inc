package cities_inc;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Patrik
 */
public class MainClass {
    /**
     *
     * @param <error>
     * @param args
     * @throws JSONException
     */
    public static void main(/*String[] args*/)  {
        try {
            //abre la pantalla de Login
            LoginScreen logscreen = new LoginScreen();
            logscreen.setLocationRelativeTo(null);
            logscreen.setVisible(true);
    }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
}
}
}
