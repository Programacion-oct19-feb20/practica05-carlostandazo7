/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos;

import java.util.Scanner;

/**
 *
 * @author UTPL
 * Un padre de familia a pagado tres cuotas de navidad de sus hijos, la cuota 1
 * fue de $15 las cuota 2 de $10 y la cuota 3 de $16. Generar un programa en
 * lenguaje Java que permita ingresar por teclado los valores de las cuotas.
 * Luego presentar el promedio de dolares pagados entre las cuotas, además 
 * presentar un mensaje en pantalla (true o false) dependiendo del promedio, si
 * el promedio es >= a 11 = true, si el promedio es < 11 = false.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

        int cuota1;
        int cuota2;
        int cuota3;
        
        System.out.println("Ingrese el valor de la cuota 1");
        cuota1 = entrada.nextInt();
        System.out.println("Ingrese el valor de la cuota 2");
        cuota2 = entrada.nextInt();
        System.out.println("Ingrese el valor de la cuota 3");
        cuota3 = entrada.nextInt();
        
        
        int promedio = (cuota1 + cuota2 + cuota3)/3;
        System.out.printf("El promedio de cuotas es: %d\n" + "promedio: %s\n",
                promedio, promedio <=11);
        
        
        
        
      
    
    }
    
}
