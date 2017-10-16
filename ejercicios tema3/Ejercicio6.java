/**
 * Tema 3, ejercicio 6
 * 
 * Escribe un programa que calcule el área de un triángulo.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Área de un triángulo");
    System.out.print("Por favor, introduce la longitud de la base del triángulo expresada en cm: ");
    double base = Double.parseDouble(s.nextLine());
    System.out.print("Por favor, introduce la altura del triángulo expresada en cm: ");
    double altura = Double.parseDouble(s.nextLine());
    System.out.println("El área del triángulo es " + (base * altura) / 2 + " cm²");
    
  }
}
