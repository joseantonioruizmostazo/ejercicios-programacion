/**
 * Tema 4, ejercicio 7
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio7 {
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
    
    
  }
}
