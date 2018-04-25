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
    // funcion para obtener el precio de cada ciudad basado en el preciobase y las paradas
    public static int precioCiudad(int paradas) {
        int precio = preciobase * paradas;
        System.out.println("El precio de la ciudad"+precio);
        return precio;
    }
    // funcion para obtener la bonificacion por cada ciudad comprada
    public static int bonificacion() {
        int bonificacion = (int) (Math.random() * 10) + 1;
        System.out.println("La bonificacion de la ciudad"+bonificacion);
        return bonificacion;
    }
//    public static int venta(int precioCiudad) {
//        int perdidas = 25 * precioCiudad;
//        System.out.println(perdidas);
//        return perdidas;
//    }
//    public void compra(String nombreCiudad,int precioCiudad,String nombreUsuario,int saldo,int bonificacion) {
//    }
}
