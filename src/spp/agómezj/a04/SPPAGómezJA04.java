/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agómezj.a04;
import java.util.Scanner;
/**
 *
 * @author Alberto
 */
public class SPPAGómezJA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Establecer variables
        int opEntrada;
        double angulo;
        double valor;
        Scanner kb = new Scanner (System.in);
        //Calculadora 
        System.out.println("1. Calcular Seno");
        System.out.println("2. Calcular Coseno");
        System.out.println("3. Calcular Tangente");
        System.out.println("4. Fin");
        opEntrada = kb.nextInt();
        //Proceso
        switch(opEntrada){
            case 1:
                System.out.println("Introducir ángulo");
                angulo= kb.nextDouble();
                valor= Math.sin(Math.toRadians(angulo));
                System.out.println("Seno de " + angulo + "°=" + valor);
                break;
            case 2:    
                System.out.println("Introducir ángulo");
                angulo= kb.nextDouble();
                valor= Math.cos(Math.toRadians(angulo));
                System.out.println("Coseno de " + angulo + "°=" + valor);
                break;
            case 3:
                System.out.println("Introducir ángulo");
                angulo= kb.nextDouble();
                valor= Math.tan(Math.toRadians(angulo));
                System.out.println("Tangente de " + angulo + "°=" + valor);
                break;
            case 4:
                System.out.println("Adiós");
           
                
            
                
                
        
    }
        
              
                
    }
    
}
