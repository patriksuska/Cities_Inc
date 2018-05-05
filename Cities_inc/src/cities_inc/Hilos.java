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

    public static class Hilo1 extends Thread {//se encarga de lanzar el programa

        @Override
        public void run() {
            System.out.println("Hola hilo1");    
            MainClass.main(); 
        }
    }

    public static class Hilo2 extends Thread {//se encarga de lanzar la funcion de sumarbenificios cada hora

        @Override
        public void run() {     
                    try {
                        System.out.println("Hola hilo2");
                        //sleep(5*60*1000);
                        
                        MainScreen.sumarbenificios();  
                        sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
    }

    public static void main(String[] args) throws Exception {
        Thread hilo1 = new Hilo1();
        hilo1.start();    
    }
}
