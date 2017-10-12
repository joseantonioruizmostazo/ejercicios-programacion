/**
 * Tema 3, ejercicio 12
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio12 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Cálculo de nota deseada");
    System.out.print("Por favor, introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(s.nextLine());
    System.out.print("¿Qué nota te gustaría sacar en el trimestre?: ");
    double notaFinal = Double.parseDouble(s.nextLine());
    double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    System.out.println("Para tener un " + notaFinal + " en el trimestre, necesitas sacar un " + nota2 + " en el segundo examen");
    
  }
}
