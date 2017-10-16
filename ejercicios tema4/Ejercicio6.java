/**
 * Tema 4, ejercicio 6
 * 
 * Realiza un programa que calcule el tiempo que tardará en caer un
 * objeto desde una altura h.
 * t = raiz(2h/g) siendo g = 9.81 m/s2
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio6 {
  
  static final double g = 9.81;
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Tiempo en caer un objeto desde una altura\n");
    System.out.print("Por favor, introduce la altura (en metros) desde la que cae el objeto: ");
    double h = Double.parseDouble(s.nextLine());
    double t = ((2 * h) / g) * ((2 * h) / g);
    System.out.println("El tiempo que tardará en caer será de " + t + " segundos");
    
  }
}
