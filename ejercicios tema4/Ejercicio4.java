/**
 * Tema 4, ejercicio 4
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int salario;
    
    System.out.println("Cálculo de salario semanal, incluído horas extras\n");
    System.out.print("Por favor, introduce la cantidad de horas trabajadas esta semana: ");
    int horasTrabajadas = Integer.parseInt(s.nextLine());
    
    if (horasTrabajadas < 40) {
      salario = 12 * horasTrabajadas;
    } else {
      salario = (40 * 12) + ((horasTrabajadas - 40) * 16);
    }
    System.out.println("Su salario esta semana será de " + salario + " €");
  }
}
