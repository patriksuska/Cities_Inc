/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;

/**
 *
 * @author Patrik
 */
public class CiudadClass {

    static int preciobase = 1000;
    //conectar a rest api class dentro de ciudad class

    public static int precioCiudad(int paradas) {//precio de cada ciudad basado en el preciobase y las paradas
        int precio = preciobase * paradas;
        System.out.println("El precio de la ciudad"+precio);
        return precio;
    }

    public static int bonificacion() {//bonificacion por cada ciudad comprada
        int bonificacion = (int) (Math.random() * 10) + 1;
        System.out.println("La bonificacion de la ciudad"+bonificacion);
        return bonificacion;
    }

    public void venta() {
        //int perdidas = 25 * precioCiudad;
        //System.out.println(perdidas);

    }

    public void compra() {

    }
    /*public static void dinero (String URL){
       
   }*/
}
