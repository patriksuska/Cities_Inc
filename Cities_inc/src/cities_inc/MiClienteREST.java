package cities_inc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
/**
 * Clase llamada MiClienteREST que es la encargada de gestionar la conexion a la API junto con la clase RestAPIClass
 * @see RestAPIClass
 * @author Patrik
 */
public class MiClienteREST {
    // Realiza una peticion REST a la URL especificada.
    // Devuelve un String con la respuesta a la peticion.
    // Si se produce una excepcion, muestra el error y devuelve null
    /**
     * Metodo estatico de tipo String que realiza la peticion a la api con la url proporcionada por la clase RestAPIClass
     * @param URL es la variable que contiene la direccion de la api
     * @return Nos devuelve el string de la peticion a la api
     */
    public static String request(String URL) {
        try {
            // Creamos una URL y una conexi�n a URL
            URL url = new URL(URL);
            URLConnection urlConn = url.openConnection();
            // Creamos un InputStreamReader & BufferedReader para leer la respuesta
            InputStreamReader isr = new InputStreamReader(urlConn.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            // Mientras el buffer no est� vacio, leemos chars y almacenamos en String
            String txt = "";
            int c;
            while ((c = br.read()) != -1) {
                txt = txt + (char) c;
            }
            // Cerramos el BufferedReader y el InputStreamReader
            br.close();
            isr.close();
            // Devolvemos la respuesta
            return txt;
        } catch (Exception e) {
            // Mostramos informaci�n de la excepci�n
            System.out.println("Se ha producido un error inesperado:");
            e.printStackTrace();
            // Devolvemos null
            return null;
        }
    }
}
