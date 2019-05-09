/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejowhile;

/**
 *
 * @author reroes
 */
public class CicloTres {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int limite_inferior = 10;
        int limite_superior = 20;
        int contador = 10;
        int suma = 0;
        while (contador >= limite_inferior && contador <= limite_superior){
            suma = suma + contador;
            System.out.printf("Contador %d\n", contador);
            contador = contador + 1;
        }
        
        System.out.printf("La suma final es %d\n", suma);
        
    }
}
