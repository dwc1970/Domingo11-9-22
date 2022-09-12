/* Ejercicio 3:Leer numeros hasta que se introduzca un cero 
Para cada uno indicar si es para o impar.
Primero lo haremos en clase Scanner, luego con la clase JOptionPane
*/
package Clase3_Ciclos;

import java.util.Scanner

public class Clase_3_Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.err.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0){
            if(numero % 2 == 0){
                System.out.println("El numero ingresado "+numero+"es PAR");
               
            }
            else{
                System.out.println("El numero ingresado: "+numero+"es IMPAR");
            }
        }
        System.out.println("Digite un nuero: ");
        numer == Integer.parseInt(entrada.nextLine());
    }
    System.out.println("el numero ingresadoes: "+numero+"finaliza el programa");
}
