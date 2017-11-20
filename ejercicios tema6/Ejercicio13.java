/**
 * Tema 6, ejercicio 13
 * 
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 * 
 * @author José Ruiz
 */

public class Ejercicio13 {
  public static void main(String[] args) {
    
    System.out.print("A continuación se simulará la tirada de dos dados de forma\n");
    System.out.print("aleatoria, cuando la cantidad de los dos dados sea la misma\n");
    System.out.println("el programa parará.\n");
    
    int dadoUno;
    int dadoDos;
    int tiradas = 0;
    do {
      dadoUno = ((int)(Math.random() * 6) + 1);
      dadoDos = ((int)(Math.random() * 6) + 1);
      System.out.println("Dado uno: " + dadoUno + " y dado dos: " + dadoDos);
      tiradas++;
    } while (dadoUno != dadoDos);
    System.out.println("Se ha/n utilizado " + tiradas + " tirada/s.");
  }
}
