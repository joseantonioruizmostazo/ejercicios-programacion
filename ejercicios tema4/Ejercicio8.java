/**
 * Tema 4, ejercicio 8
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Nota media de 3 notas\n");
    System.out.print("Por favor, introduce la primera nota: ");
    double nota1 = Double.parseDouble(s.nextLine());
    System.out.print("Por favor, introduce la primera nota: ");
    double nota2 = Double.parseDouble(s.nextLine());
    System.out.print("Por favor, introduce la primera nota: ");
    double nota3 = Double.parseDouble(s.nextLine());
    double media = (nota1 + nota2 + nota3) / 3;
    System.out.printf("La media es %.1f\n", media);
    
    if ((media >= 0) && (media <= 4.99)) {
      System.out.println("Insuficiente");
    }
    
    if ((media >= 5) && (media <= 5.99)) {
      System.out.println("Suficiente");
    }
    
    if ((media >= 6) && (media <= 6.99)) {
      System.out.println("Bien");
    }
    
    if ((media >= 7) && (media <= 8.99)) {
      System.out.println("Notable");
    }
      
    if ((media >= 9) && (media <= 10)) {
    System.out.println("¡Sobresaliente!");
    
    }
  }
}
