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
public class CicloCinco {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int limite = 3;
        int contador = 1;
        double suma_total = 0;
        double promedio_final = 0;
        System.out.println("Ingrese las notas de los estudiantes de su materia");
        while (contador <= limite){
            System.out.printf("Ingrese calificación número %d\n", contador);
            int valor = entrada.nextInt();
            double valor_real = (double)valor;
            suma_total = suma_total + valor_real;
            contador = contador + 1;
        }
        promedio_final = suma_total/limite;
        System.out.printf("La suma final es %.2f\n", promedio_final);
        
    }
}
