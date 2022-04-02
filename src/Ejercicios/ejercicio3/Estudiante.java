package Ejercicios.ejercicio3;

import java.util.Hashtable;
import java.util.Scanner;


public class Estudiante {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Hashtable<String,String> estudiante= new Hashtable<String,String>();
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Ingrese el numero de carnet : ");
            Double carnet = leer.nextDouble();
            estudiante.put("a" +i,String.valueOf(carnet));
            System.out.println("Introdusca el nombre del estudiante : ");
            /* String nombre = leer.nextLine();
            estudiante.put( +i, String.(nombre));*/
            
        }
    }
}
