/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities_inc;

/**
 * Clase llamada CiudadClass que es una clase sin entorno grafico y que realiza acciones solicitadas por la clase MainScreen
 * @see MainScreen
 * @author Patrik
 */
public class CiudadClass {
    /**
     * Variable estatica de tipo entero que contiene el precio base de las ciudades apartir de la cual se calcula el precio de la ciudad
     */
    static int preciobase = 3000;
    /**
     * Metodo que se encarga de realizar el calculo del precio de una ciudad basandose en el numero de las paradas que tiene esa ciudad multiplicandolo por el precio base
     * @param paradas es una variable que se le pasa desde la clase RestAPIClass y apartir de la cual realiza el calculo
     * @return Nos retorna el precio de la ciudad en una variable entera
     */
    public static int precioCiudad(int paradas) {
        // funcion para obtener el precio de cada ciudad basado en el preciobase y las paradas
        int precio = preciobase * paradas;
        System.out.println("El precio de la ciudad" + precio);
        return precio;
    }
    /**
     * Metodo que se encarga de calcular la bonificacion de las ciudades dependiendo de la cantidad de paradas que tiene
     * @param paradas Es la variable que contiene el numero de paradas obtenido previamente del metodo obtenerParadas de la clase RestAPIClass
     * @see RestAPIClass.obtenerParadas()
     * @return Nos retorna el porcentaje de bonificacion de la ciudad en una variable de tipo entero
     */
    public static int bonificacion(int paradas) {
        // funcion para obtener la bonificacion por cada ciudad comprada
        int bonificacion = 0;
        if (paradas >= 1 && paradas <= 15) {
            bonificacion = (int) (Math.random() * 5) + 1;
        } else if (paradas >= 16 && paradas <= 35) {
            bonificacion = (int) (Math.random() * (12 - 6) + 6);
        } else if (paradas >= 36 && paradas <= 60) {
            bonificacion = (int) (Math.random() * (20 - 13) + 13);
        } else if (paradas >= 61 && paradas <= 99) {
            bonificacion = (int) (Math.random() * (25 - 21) + 21);
        } else if (paradas >= 100) {
            bonificacion = (int) (Math.random() * (30 - 26) + 26);
        } else {
            bonificacion = 0;
        }
        System.out.println("La bonificacion de la ciudad" + bonificacion);
        return bonificacion;
    }
    /**
     * Metodo encargado de realizar la conversion del porcentaje de bonificacion a euros
     * @param bonificacion es la variable obtenida de la funcion bonificacion de esta misma clase y que contiene el numero en porcentaje de bonificacion de una ciudad
     * @see bonificacion()
     * @param preciociudad es la variable obtenida de la funcion precioCiudad de esta misma clase y que contiene el precio de una ciudad
     * @see precioCiudad
     * @return Nos retorna en una variable de tipo entera la cantidad en euros de la bonificacion obtenida por una ciudad
     */
    public static int boneuro(int bonificacion, int preciociudad) {
        //funcion para calcular para cada ciudad la bonificacion que se obtiene en euros
        int calculo = preciociudad * bonificacion / 100;
        return calculo;
    }

}
