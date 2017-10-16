/**
 * Tema 4, ejercicio 1
 * 
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio1 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String dia;
    
    System.out.print("Por favor, introduce un dia de la semana: ");
    dia = (s.nextLine());
    dia.toLowerCase();
    
    switch(dia) {
      case "lunes":
      System.out.println("A primera hora tienes programación");
        break;
      case "martes":
      System.out.println("A primera hora tienes sistemas informáticos");
        break;
      case "miércoles":
      System.out.println("A primera hora tienes programación");
        break;
      case "jueves":
      System.out.println("A primera hora tienes entornos de desarrollo");
        break;
      case "viernes":
      System.out.println("A primera hora tienes sistemas informáticos");
        break;
      case "sábado":
      case "domingo":
      System.out.println("Ese día no hay clase");
        break;
      default:
        System.out.println("Lo siento, ese día no es correcto");
        
    }
  }
}
