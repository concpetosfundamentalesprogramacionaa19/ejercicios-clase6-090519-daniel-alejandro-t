/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejowhile;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class CicloSeis {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int contador = 0;
        double suma_total = 0;
        double promedio_final = 0;
        boolean bandera = true;
        System.out.println("Ingrese las notas de los estudiantes de su materia");
        while (bandera){
            System.out.printf("Ingrese calificación número %d\n", contador);
            int valor = entrada.nextInt();
            double valor_real = (double)valor;
            suma_total = suma_total + valor_real;
            contador = contador + 1;
            
            // proceso para salir del ciclo.
            System.out.println("Ingrese el valor de -1(continuar) o -2(salir)\n");
            int temporal = entrada.nextInt();
            if(temporal==-1){
                bandera = true;
            }else{
                bandera = false;
            }
        }
        promedio_final = suma_total/contador;
        System.out.printf("El promedio final es %.2f\n", promedio_final);
        
    }
}
