/*
Ejercicio 4: Pedir un numero hasta que se teclee uno negativo,
y mostrar cuántos numeros se han intrducido.
Lo hacemos primero con la clase JOptionPane
*/

package Ejercicio_04;

import javax.swing.JOptionPane;


public class Ejerrcicio04JOption {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El numero"+numero+"Es positivo");
            conteo++;
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
            
            }
            JOptionPane.showInputDialog(null, "A ingresado"+conteo +"numeros que so negativos");
        
         
    }
    
}
