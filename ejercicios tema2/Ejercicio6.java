 /**
 * Tema 2, ejercicio 6
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 * 
 * @author José Ruiz
 */

public class Ejercicio6 {
  public static void main(String[] args) {
  
    double baseImponible = 10.80;
    
    System.out.printf("Base imponible %9.2f\n", baseImponible);
    System.out.printf("IVA            %9.2f\n", (baseImponible * 0.21));
    System.out.println("--------------------------");
    System.out.printf("Total          %9.2f\n", (baseImponible * 1.21));
  }
}
