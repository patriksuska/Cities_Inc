/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author Patrik
 */
public class RestAPIClass {
   static String temp="?fields=stations";
   static String head="http://api.citybik.es";  
   // funcion que obtiene el numero de paradas de cada ciudad 
   public static int obtenerParadas(String body){//aqui hay que pasarle el body de la url de MainScreen
    int paradas=0;
    String URL=head+body+temp;
    try{
    String txt=MiClienteREST.request(URL);
    JSONObject obj = new JSONObject(txt);
    JSONObject obj2 = obj.getJSONObject("network");
    JSONArray estacion = obj2.getJSONArray("stations");
    paradas=estacion.length();
    }
    catch(Exception e){
    System.out.print("Error");
    }
    return paradas;
    }
}
