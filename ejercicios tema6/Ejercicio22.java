/**
 * Tema 6, ejercicio 22
 * 
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una
 * posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 * teclado y se supone que el usuario introducirá un dato correcto.
 * Ejemplo:
 * Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
 *           @
 *           *
 *            *
 *           *
 *          *
 *           *
 *            *  
 * @author José Ruiz
 */

import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación se mostrará el serpenteo de una serpierda\n");
    System.out.print("de forma aleatoria, usted deberá introducir la longitud de la\n");
    System.out.println("serpiente incluyendo la cabeza.\n");
    
    int longitud;
    int movimiento;
    int espacios = 12;
        
    System.out.print("Por favor, introduzca la longitud de la serpiente: ");
    longitud = Integer.parseInt(s.nextLine());
    
    //pinta la cabeza con 12 espacios
    System.out.print("            @\n");
    
    //bucle para la longitud
    for (int i = 1; i < longitud; i++) {
      
      //movimiento aleatorio de 1 a 3
      movimiento = ((int)(Math.random() * 3) + 1);
        //si el movimiento es igual a 1 los espacios aumentan en 1
        if (movimiento == 1) {
          espacios++;
        //si el movimiento es igual a 2 los espacios disminuyen en 1
        }else if (movimiento == 2) {
          espacios--;
        //y si el movimiento es igual a 3 los espacios se quedan igual
        }
      //bucle dentro del otro bucle para pintar el número de espacios  
      for (int j = 0; j < espacios; j++) {
       
          System.out.print(" ");
      }
      //y despues de los espacios pintar el cuerpo de la serpiente
      System.out.print("*\n");
    }
  }
}
