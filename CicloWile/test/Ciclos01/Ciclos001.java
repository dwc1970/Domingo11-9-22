/*
Ejercicio 1: Leer los numeros y mostrar su cuadrado, repetir
el proceso hasta que se introduzca un numero negativo
*/
package Ciclos01;

import java.util.Scanner; 
import javax.swing.JOptionPane;

public class Ciclos01 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner System.in);
        
                
       numero JOpcionPane.JOptionPane.showInputDialog();
        
        System.out.println("Digite un numero: ");
       numero = Integer.parceInt(entrada.nextLine() );
       while(numero >= 0)
       {
           cuadrado = (int)Math.pow(numero, 2);
           System.out.println("El numero" + numero+ "El numero elevado al cuadrado es: " + cuadrado);
           System.out.println("Digite un numero: ");
           numero = Integer.parseInt(entrada.nextLine() );
           
       }
        System.out.println("El progrma a finalizado por numero negativo");
           
    }
}
