/**
 * Tema 3, ejercicio 4
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    String linea; 
    
    System.out.print("Por favor, introduce un número: ");
    linea = s.nextLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("Por favor, introduce otro número: ");
    linea = s.nextLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    int suma;
    suma = primerNumero + segundoNumero;
    
    int resta;
    resta = primerNumero - segundoNumero;
    
    int multiplicacion;
    multiplicacion = primerNumero * segundoNumero;
    
    double division;
    division = (double)primerNumero / (double)segundoNumero;
    
    
    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo número es " + segundoNumero);
    System.out.println("La suma entre los dos números es " + suma);
    System.out.println("La resta entre los dos números es " + resta);
    System.out.println("La multiplicación entre los dos números es " + multiplicacion);
    System.out.printf("La division entre los dos números es " + division);
    
    
    
  }
}
