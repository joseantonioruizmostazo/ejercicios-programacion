/**
 * Tema 5, ejercicio 20
 * 
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = s.nextLine();
    
    int altura = 1;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosInternos = 0;
    
    while (altura < alturaIntroducida) {
      
      // inserta espacios delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      
      // pinta la línea
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(relleno);
      }
      
      System.out.println();
      altura++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    } // while ////////////////////////////
    
    // base de la pirámide
    for (i = 1; i < altura*2; i++) {
      System.out.print(relleno);
    }
  }
}