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
   
   static int preciobase=1000;
   //conectar a rest api class dentro de ciudad class
   
   public static int precioCiudad(int paradas){//precio de cada ciudad basado en el preciobase y las paradas
       int precio=preciobase*paradas;
       System.out.println(precio);
       return precio;
   }
   
   public static int bonificacion(){//bonificacion por cada ciudad comprada
       int bonificacion=(int)(Math.random()*10)+1;
       System.out.println(bonificacion);
       return bonificacion;
   }
   /*public static void dinero (String URL){
       
   }*/
}

