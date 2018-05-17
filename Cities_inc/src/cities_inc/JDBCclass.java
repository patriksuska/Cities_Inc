/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Clase llamada JDBCclass que es una clase sin entorno grafico a la cual la llaman el resto de las clases para gestionar todas las consultas sql 
 * @author Patrik
 */
public class JDBCclass {
    //datos de acceso a la BD
    /**
     * Variable estatica de tipo string que contiene el nombre de la base de datos
     */
    private static String db = "u634818610_city";
    /**
     * Variable estatica de tipo string que contiene la direccion url de acceso a la base de datos por codigo java
     */
    private static String url = "jdbc:mysql://sql151.main-hosting.eu/" + db;
    /**
     * Variable estatica de tipo string que contiene el nombre de usuario de acceso a la base de datos remota
     */
    private static String user = "u634818610_pat";
    /**
     * Variable estatica de tipo string que contiene la contraseña del usuario de acceso a la base de datos remota
     */
    private static String pass = "patsus123";
    /**
     * Variable de tipo Connection que comprueba la conexion con la base de datos desde java para ver si el servidor esta activo y si lo esta,se conecta a el
     */
    private static Connection conn = null;
    /**
     * Variable de tipo Statement que ejecuta un metodo para realizar una consulta
     */
    public static Statement state;

    // funcion de conexion con la BD
    /**
     * Constructor de la clase JDBCclass que realiza la conexion con la base de datos remota
     * @throws SQLException En el caso de que la consulta sql no se realize correctamente
     */
    public JDBCclass() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conexion establecida");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al conectarse a la base de datos");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    // funcion de consulta para los select
    /**
     * Metodo de tipo ResultSet que se encarga de realizar la consulta solicitada por otras clases
     * @param sql es la variable de tipo string la cual fue generada en otras clases que hacen uso del metodo
     * @return Nos retorna el resultado de la ejecucion de la consulta
     * @throws SQLException Es una excepcion en caso de que la ejecucion del sql no se realize correctamente
     */
    public ResultSet consulta1(String sql) throws SQLException {
        ResultSet resultado = null;
        state = (Statement) conn.createStatement();
        resultado = state.executeQuery(sql);
        return resultado;
    }

    //funcion de consulta para los select count(en general los que devuelven un true/false
    /**
     * Metodo de tipo boolean que ha sido previamente llamada de otra clase para realizar la consulta contra la Base de Datos 
     * @param sql es la variable de tipo string la cual fue generada en otras clases que hacen uso del metodo
     * @return Nos retorna un verdadero o falso dependiendo del sql que se le pasa al metodo
     * @throws SQLException Es una excepcion en caso de que la ejecucion del sql no se realize correctamente
     */
    public boolean consulta2(String sql) throws SQLException {
        boolean estado = false;
        state = (Statement) conn.createStatement();
        state.executeQuery(sql);
        return estado;
    }

    //funcion para el update delete o insert que no devuelve nada
    /**
     * Metodo de tipo void que ha sido previamente llamada de otra clase para realizar la consulta contra la Base de Datos 
     * @param sql es la variable de tipo string la cual fue generada en otras clases que hacen uso del metodo
     * @throws SQLException Es una excepcion en caso de que la ejecucion del sql no se realize correctamente
     */
    public static void consulta3(String sql) throws SQLException {
        state = (Statement) conn.createStatement();
        state.executeUpdate(sql);
    }
}
