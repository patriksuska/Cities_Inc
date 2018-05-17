package cities_inc;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Clase llamada MainClass que se ejecuta al inicio del programa y que lanza la ventana de login
 * @author Patrik
 */
public class MainClass {

    /**
     * Metodo main para lanzar la pantalla principal que en este caso es la pantalla de Login
     * @param args Argumentos del metodo main
     */
    public static void main(String[] args) {
        //abre la pantalla de Login
        try {
            LoginScreen logscreen = new LoginScreen();
            logscreen.setLocationRelativeTo(null);
            logscreen.setVisible(true);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
