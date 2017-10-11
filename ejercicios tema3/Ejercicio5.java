/**
 * Tema 3, ejercicio 5
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Área de un rectángulo");
    System.out.print("Por favor, introduce la longitud de la base del rectángulo expresada en cm: ");
    double base = Double.parseDouble(s.nextLine());
    System.out.print("Por favor, introduce la altura del rectángulo expresada en cm: ");
    double altura = Double.parseDouble(s.nextLine());
    System.out.println("El área del rectángulo es " + (base * altura) + " cm²");
    
    
  }
}
