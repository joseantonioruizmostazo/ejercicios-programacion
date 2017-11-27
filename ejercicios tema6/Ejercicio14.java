/**
 * Tema 6, ejercicio 14
 * 
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número
 * entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor
 *que el que te acaba de decir.
 * 
 * @author José Ruiz
 */

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int numeroPensado;
    int oportunidades = 5;
    int maximo = 100;
    int minimo = 0;
    
    
    System.out.print("A continuación deberás pensar un número entre 0 y 100");
    System.out.print("(ambos incluídos) y el programa tendrá 5 oportunidades para acertarlo, ");
    System.out.println("y si falla el programa te preguntará si el número es mayor o menor.\n");
    
    System.out.println("Piensa el número y pulsa intro");
    s.nextLine();
    
    do {
      
      numeroPensado = (int)(Math.random() * (maximo - minimo) + minimo);
    
      System.out.print("¿El número que has pensado es " + numeroPensado + "?\nescribe si es mayor, menor o igual: \n");

      String respuesta;

      respuesta = (s.nextLine());
      if (respuesta.equals("igual")) {
        System.out.println("Oleee te he ganado humano");
        oportunidades -=5;
      }
      
        else if ((respuesta.equals("mayor")) && (oportunidades > 0)) {
          minimo = numeroPensado + 1;
          oportunidades--;
          if (oportunidades == 0) {
            System.out.println("Oh que pena, he gastado todas las oportunidades, me has ganado.");
          } else {
          System.out.println("Oh que pena, bueno aún tengo " + oportunidades + " oportunidad/es");
          }
        }
        
        else if ((respuesta.equals("menor")) && (oportunidades > 0)) {
          maximo = numeroPensado - 1;
          oportunidades--;
          if (oportunidades == 0) {
            System.out.println("Oh que pena, he gastado todas las oportunidades, me has ganado.");
          } else {
          System.out.println("Oh que pena, bueno aún tengo " + oportunidades + " oportunidad/es");
          }
        }
    } while (oportunidades > 0);
  }
}
