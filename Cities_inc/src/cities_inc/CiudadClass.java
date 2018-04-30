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
    static int preciobase = 3000;
    // funcion para obtener el precio de cada ciudad basado en el preciobase y las paradas
    public static int precioCiudad(int paradas) {
        int precio = preciobase * paradas;
        System.out.println("El precio de la ciudad"+precio);
        return precio;
    }
    // funcion para obtener la bonificacion por cada ciudad comprada
    public static int bonificacion(int paradas) {
        int bonificacion=0;
        if(paradas>=1 && paradas<=15){
            bonificacion = (int) (Math.random() * 5) + 1;
        }
        else if(paradas>=16 && paradas<=35){
            bonificacion = (int) (Math.random() *(12-6)+6);
        }
        else if(paradas>=36 && paradas<=60){
            bonificacion = (int) (Math.random() * (20-13)+13);
        }
        else if(paradas>=61 && paradas<=99){
            bonificacion = (int) (Math.random() * (25-21)+21);
        }
        else if(paradas>=100){
            bonificacion = (int) (Math.random() * (30-26)+26);
        }
        else{
            bonificacion=0;
        }
        System.out.println("La bonificacion de la ciudad"+bonificacion);
        return bonificacion;
    }
    //funcion para calcular para cada ciudad la bonificacion que se obtiene en euros
    public static int boneuro(int bonificacion,int preciociudad){
        int calculo=preciociudad*bonificacion/100; 
        return calculo;
    }
    
}
