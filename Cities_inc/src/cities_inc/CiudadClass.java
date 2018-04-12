/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;
import org.json.*;
/**
 *
 * @author Patrik
 */
public class CiudadClass {
   static int paradas;
   static String temp="?fields=stations";
   static String head="http://api.citybik.es";
   static String body="/v2/networks/valenbisi";
   static int preciobase=1000;
   String nombreCiudad;
   String Pais;
   
   public static int obtenerParadas(){//obtiene el numero de paradas de cada ciudad 
    paradas=0;
    
    String URL=head+body+temp;

    try{
    String txt=MiClienteREST.request(URL);
    JSONObject obj = new JSONObject(txt);
    JSONObject obj2 = obj.getJSONObject("network");
    JSONArray estacion = obj2.getJSONArray("stations");
    paradas=estacion.length();

    //System.out.println(paradas);
    
    }
    catch(Exception e){
    System.out.print("Error");
    }
    return paradas;
    }
   
   public static int precioCiudad(){//precio de cada ciudad basado en el preciobase y las paradas
       int precio=preciobase*paradas;
       System.out.println(precio);
       return precio;
   }
   
   public static int bonificacion(){//bonificacion por cada ciudad comprada
       
       int bonificacion=(int)(Math.random()*10)+1;
       System.out.println(bonificacion);
       return bonificacion;
   }
}

