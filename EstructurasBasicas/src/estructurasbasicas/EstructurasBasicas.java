/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Creamos el obj. de tipo Scanner 
        Scanner entrada = new Scanner (System.in);

        int numUsuarios;
        int contador = 0;
        boolean bandera = true;
        
        String mensajeFinal = "";
        
        /*
        String nombre = "Daniel Alejandro";
        String apellido = "Tinizaray O.";
        String profesion = "Estudiante";
        */
        
        // Consultamos cuandos usuarios va a ingresar
        System.out.println("Cuantos usuarios va a ingresar?");
        numUsuarios = entrada.nextInt();
        
        // Creamos un array para nombre - apellido y profesion
        String [] nombre = new String [numUsuarios];
        String [] apellido = new String [numUsuarios];
        String [] profesion = new String [numUsuarios];
        
        // TODO: Creamos un bucle while que rellene el cada uno de los array
        while (contador < numUsuarios && bandera){
            // Rellenamos array nombre
            System.out.println("Ingrese el nombre de la persona " + (contador+1));
            nombre [contador] = entrada.next();
            // Rellenamos array apellido
            System.out.println("Ingrese el apellido de la persona " + (contador+1));
            apellido [contador] = entrada.next();
            
            // Rellenamos array profesion
            System.out.println("Ingrese la profesion de la persona " + (contador+1));
            profesion [contador] = entrada.next();
            
            //  TODO: Desea seguir ingresando usuarios?
            System.out.println("Desea seguir ingresando datos? SI/NO");
            if (entrada.next().equalsIgnoreCase("no")){
                bandera = false;
            }
            
        }
            
        
        mensajeFinal = String.format("%s %s \n\n", mensajeFinal, "Informe de la ciudad de Loja:");
        mensajeFinal = String.format("%s %s \n\n", mensajeFinal, "Listado de personas:");
        
        while (contador < 5){
            mensajeFinal = String.format("%s Persona %d %s \n",mensajeFinal, contador, nombre);
        //    System.out.printf("Persona %i | Nombres: %s %S | Profesion: %s", contador, nombre, apellido, profesion);

            contador++;
        }
        
        System.out.println(mensajeFinal);
    }
    
}
