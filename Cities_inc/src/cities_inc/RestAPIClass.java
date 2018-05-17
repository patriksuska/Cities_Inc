/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Clase llamada RestAPIClass que es una clase sin entorno grafico que se conecta a la api utilizando el clienteREST
 * @see MiClienteREST
 * @author Patrik
 */
public class RestAPIClass {
    /**
     * Variable estatica de tipo string que contiene los criterios de busqueda en la api
     */
    static String temp = "?fields=stations";
    /**
     * Variable estatica de tipo string que contiene la direccion de la api
     */
    static String head = "http://api.citybik.es";
    // funcion que obtiene el numero de paradas de cada ciudad 
    /**
     * Metodo que obtiene el numero de paradas de una ciudad de la api
     * @param body es la url de cada ciudad de forma unica para poder realizar la busqueda de las paradas
     * @return Retorna el numero de paradas de la ciudad buscada
     */
    public static int obtenerParadas(String body) {//aqui hay que pasarle el body de la url de MainScreen
        int paradas = 0;
        String URL = head + body + temp;
        try {
            String txt = MiClienteREST.request(URL);
            JSONObject obj = new JSONObject(txt);
            JSONObject obj2 = obj.getJSONObject("network");
            JSONArray estacion = obj2.getJSONArray("stations");
            paradas = estacion.length();
        } catch (Exception e) {
            System.out.print("Error de paradas");
        }
        return paradas;
    }
}
