/**
* Tema 4, ejercicio 15
*
*@author José Ruiz
*/

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String respuesta;
    
    System.out.println("Pirámide con caractéres con el vértice mirando en 4 posiciones\n");
    System.out.println("Inserta una letra, número o caracter\n");
    
    System.out.println("¿Hacia dónde quieres que mire el vértice de una pirámide?");
    System.out.println("a) Hacia arriba\nb) Hacia abajo\nc) Hacia la izquierda\nd) Hacia la derecha"); 
    System.out.print("=> ");
    respuesta = (s.nextLine());
    
      
    switch(respuesta) {
      case 1:
        
        break;
      case 2:
        
        break;
      case 3:
        break;
      case 4:
        break:
        default:
    
    System.out.println("    *    ");
    System.out.println("   ***   ");
    System.out.println("  *****  ");
    System.out.println(" ******* ");
    System.out.println("*********");
  }
}
