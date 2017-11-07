/**
 * Tema 5, ejercicio 40
 * 
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio40 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("A continuación se dibujará un rombo hueco a partir de la altura deseada.\n");
    System.out.print("Por favor, introduzca la altura del rombo: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    int espaciosInternos = 0;
    int espaciosPorDelante = alturaIntroducida / 2;

    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {
      
      int altura = 1;
      
      // parte de arriba /////////////////////////////////////      
      while (altura <= alturaIntroducida / 2 + 1) {

        // inserta espacios delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }

        // pinta la línea
        System.out.print("*");
        for (int i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }

        if (altura>1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante--;
        espaciosInternos+=2;
      } // while parte de arriba ///////////////////////

      // parte de abajo /////////////////////////////////////
      espaciosInternos = alturaIntroducida - 3;
      espaciosPorDelante = 1;
      altura = 0;

      while (altura < alturaIntroducida / 2) {

        // inserta espacios delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }

        // pinta la línea
        System.out.print("*");
        for (int i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        
        if(altura < alturaIntroducida / 2 - 1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante++;
        espaciosInternos -= 2;
      } // while parte de abajo ///////////////////////      
    } // else
  }
}
