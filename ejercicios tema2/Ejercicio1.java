 /**
 * Tema 2, ejercicio 1
 * 
 * Escribe un programa en el que se declaren las variables enteras x e y . Asignales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * 
 * @author José Ruiz
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    int x;
    int y;
    
    x = 144;
    y = 999;
    
    System.out.print("x vale -->" + x + " |");
    System.out.println("y vale -->" + y);
    System.out.println("x + y = " + (x+y));
    System.out.println("y - x = " + (y-x));
    System.out.println("y / x = " + (y/x));
    System.out.println("x * y = " + (x*y));
    
    
    
  }
}
