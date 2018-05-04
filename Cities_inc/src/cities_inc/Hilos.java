/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Patrik
 */
public class Hilos {

    public static class Hilo1 extends Thread {

        @Override
        public void run() {
            System.out.println("Hola hilo1");
            LoginScreen LG;
            try {
                LG = new LoginScreen();
                LG.setVisible(true);
                MainScreen.sumarbenificios();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }

    public static class Hilo2 extends Thread {//ver si hay cambios en la tabla propiedades

        @Override
        public void run() {
                for(int i=0;i<5;i++){
                    try {
                        sleep(5*60*1000);
                        System.out.println("Hola hilo2"+i);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            

        }
    }

    public static void main(String[] args) throws Exception {
        Thread hilo1 = new Hilo1();
        hilo1.start();
        Thread hilo2 = new Hilo2();
        hilo2.start();
    }
}
