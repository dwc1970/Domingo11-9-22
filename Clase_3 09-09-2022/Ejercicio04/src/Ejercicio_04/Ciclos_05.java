/*
 Ejercicio 5: Realizar un jugo para adivinar un numero, 
para ello generar un numero aleatorio entre 0-100,y luego
ir pidiendo numeros indicando "es mayor" o " es menor" según
sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostramos el
numero de intentos hecho.
  */
package Ejercicio_04;

import java.util.Scanner;
        
public class Ciclos_05 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); // Esto genera un numero aleatorio
        do {            
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero < aleatorio){
                System.out.println("Digite un numero mayor");
                             
                
            }
            else if(numero > aleatorio){
        } while (numero != aleatorio);
            System.out.println("Adiviniaste el numero en: "+conteo+"intentos");
            
    
    

