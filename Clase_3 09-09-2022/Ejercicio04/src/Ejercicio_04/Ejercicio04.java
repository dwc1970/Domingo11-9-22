/*
Ejercicio 4: Pedir un numero hasta que se teclee uno negativo,
y mostrar cuántos numeros se han intrducido.
Lo hacemos primero conla clse Scanner y lugo con la clase JOptionPane
*/
 
package Ejercicio_04;


import java.util.Scanner;
        

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Digite un numero: ");
        numero =Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            System.out.println("el numero"+numero+"Es positivo");
            conteo++;
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            
            
        }
        System.out.println("A ingresado "+conteo+"numeros que no son negativos");
        
                
    }
    
}
