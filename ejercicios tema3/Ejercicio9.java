/**
 * Tema 3, ejercicio 9
 * 
 * Escribe un programa que calcule el volumen de un cono según la
 * fórmula V = (1/3)πr^2h
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio9 {
  
  static final double pi = 3.141592654;
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Cálculo del volumen de un cono");
    System.out.print("Por favor, introduce la altura en cm: ");
    double h = Double.parseDouble(s.nextLine());
    System.out.print("Por favor, introduce el radio en cm: ");
    double r = Double.parseDouble(s.nextLine());
    double v = (1.0/3.0) * pi * r * r * h;
    System.out.println("El volumen del cono es de " + v + " cm³");
    
  }
}
