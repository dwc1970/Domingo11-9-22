/* Ejercicio 3:Leer numeros hasta que se introduzca un cero 
Para cada uno indicar si es para o impar.
Primero lo haremos en clase Scanner, luego con la clase JOptionPane

*/

package Clase3_Ciclos;

import javax.swing.JOptionPane;


public class Ejercicio03 {
    public static void main(String[] args) {
        int numero;
            
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null,"El numero ingresado "+numero+"es PAR");
               
            }
            else{
                 JOptionPane.showMessageDialog(null,"El numero ingresado "+numero+"es IMPAR");
            }
        }
         
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
    }
    JOptionPane.showMessageDialog(null,"el numero ingresadoes: "+numero+" finaliza el programa");
    }
        
 