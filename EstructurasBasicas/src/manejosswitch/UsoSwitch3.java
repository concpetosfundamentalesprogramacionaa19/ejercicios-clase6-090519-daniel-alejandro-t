/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Desarrollar una pp que me permita ingresar placas de carros, se asume que las placas ingresadas pertenecen a la region costa
        del Ecuadorrrr en base a la placa nuestra app determinara y presentara la placa con la provincia a la que pertenece 
        */
        
        // Invocamos Scanner
        Scanner entrada = new Scanner (System.in);
        
        // Delcaramos las variables
        String placa = "";
        
        // User Ingresa la placa
        System.out.println("Ingrese la placa:");
        placa =  entrada.next();
        
        // Evaluamos si el primer caracter es de la costa                
        
        switch(placa.charAt(0)){      //M O G Y E O J
            case 'm':
            case 'M':    System.out.println("Es de la costa");     break;
            
            case 'o':
            case 'O':    System.out.println("Es de la costa");     break;
            
            case 'g':
            case 'G':    System.out.println("Es de la costa");     break;
            
            case 'y':
            case 'Y':    System.out.println("Es de la costa");     break;
            
            case 'e':
            case 'E':    System.out.println("Es de la costa");     break;
            
            case 'j':
            case 'J':    System.out.println("Es de la costa");     break;
            
            default:
                System.out.println("No es de la costa");
                
        }
        
    }
}
