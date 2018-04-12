package cities_inc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MiClienteREST {
	
	// Realiza una petici�n REST a la URL especificada.
	// Devuelve un String con la respuesta a la petici�n.
	// Si se produce una excepci�n, muestra el error y devuelve null
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