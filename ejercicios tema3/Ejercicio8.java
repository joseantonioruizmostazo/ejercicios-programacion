/**
 * Tema 3, ejercicio 8
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Cálculo de salario semanal");
    System.out.print("Por favor, introduce la cantidad de horas trabajadas esta semana: ");
    double salario = Double.parseDouble(s.nextLine());
    System.out.println("Su salario esta semana será de " + (salario * 12) + " €");
    
  }
}
