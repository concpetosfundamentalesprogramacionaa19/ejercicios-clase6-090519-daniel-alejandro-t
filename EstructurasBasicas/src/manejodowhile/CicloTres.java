/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodowhile;

import java.util.Scanner;

/**
 *
 * @author jhand
 */
public class CicloTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota = 0;
        int contador = 0;
        int suma = 0;
        double promedio = 0;
        String cadena = "";
        String cadenaTmp = "";
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        
        do{ 
            contador = contador + 1;
            System.out.println("Ingrese un nota");
            nota = entrada.nextInt();
            suma = suma + nota;
            cadena = String.format("%snota\t%d = %d\n", cadena, contador, 
                    contador);
            entrada.nextLine();        
            
            System.out.println("Desea seguir, pulse 's'");
            String valor = entrada.nextLine();
            if(valor.equals("s")){
                bandera = false;
            }
        }while(bandera) ;
        
        promedio = suma / contador;
        cadena = String.format("%spromedio\t\t= %f\n", cadena, promedio);
                    
        System.out.printf("%s", cadena);
        
    }
        
 }
    
    

