/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos2;

/**
 *
 * @author reroes
 */
public class Ciclos5 {

    public static void main(String args[]) {
        // el encabezado de la instrucción for incluye la inicialización,
        // la condición de continuación de ciclo y el incremento
        int numero = 1;
       
        while (numero <= 5) {
            
            for (int contador = 1; contador <= 10; contador++) {
                System.out.printf("%d * %d = %d\n", numero, contador, numero*contador);
            }
            System.out.println(); // imprime una nueva línea
            numero = numero + 1;
        }
    } // fin de la clase ContadorFor

}
