/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejofor;

/**
 *
 * @author reroes
 */
public class Ciclos6 {

    public static void main(String args[]) {
        // el encabezado de la instrucción for incluye la inicialización,
        // la condición de continuación de ciclo y el incremento
        int numero = 1;
        String cadena = String.format("%s\t%s\n","Encabezado", "tablas");
        while (numero <= 5) {
            
            for (int contador = 1; contador <= 10; contador++) {
                cadena = String.format("%s%d * %d = %d\n", cadena, numero, contador, numero*contador);
            }
            cadena = String.format("%s\n",cadena); // imprime una nueva línea
            numero = numero + 1;
        }
        System.out.println(cadena);
    } // fin de la clase ContadorFor

}
