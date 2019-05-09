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
public class Ciclos7 {

    public static void main(String args[]) {
        // el encabezado de la instrucción for incluye la inicialización,
        // la condición de continuación de ciclo y el incremento

        String cadena = "";
        cadena = cadena + String.format("%s\t\t%s\n", "valor", "resultado");
        for (int contador = 10; contador > 1; contador--) {

            cadena = cadena + String.format("%d\t\t%d\n", contador, contador + 10);
        }
        System.out.print(cadena); // imprime una nueva línea

    } // fin de la clase ContadorFor

}
