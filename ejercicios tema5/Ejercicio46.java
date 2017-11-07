/**
 * Tema 5, ejercicio 46
 * 
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio46 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("A continuación se pintará un rectángulo hueco a partir de introducir la anchura y altura.\n");
    System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
    int anchura = Integer.parseInt(s.nextLine());

    System.out.print("Ahora introduzca la altura (como mínimo 2): ");
    int altura = Integer.parseInt(s.nextLine());

    if ((anchura < 2) || (altura < 2)) {

      System.out.print("Lo siento, los datos introducidos no son correctos, ");
      System.out.println(" el valor mínimo para la anchura y la altura es 2.");

    } else {
    
      // Línea superior ////////////////////////////////////////////////////////
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
      
      // Parte intermedia //////////////////////////////////////////////////////
      for (int i = 2; i < altura; i ++) {
        System.out.print("\n*");
        for (int espacios = 2; espacios < anchura; espacios++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
      
      // Línea inferior ////////////////////////////////////////////////////////
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
    } // else
  }
}
