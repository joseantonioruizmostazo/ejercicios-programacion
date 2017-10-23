/**
 * Tema 5, ejercicio 7
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, introduzca un número de 4 cifras (0000-9999) para\nabrir la combinación de la caja fuerte, dispondrá de 4 intentos.\n");
    int intentos = 4;
    int codigo;
    boolean acertado = false;
    
    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      codigo = Integer.parseInt(s.nextLine());
      System.out.println(" ");
      
      if (codigo == 2580) {
        acertado = true;
      } else {
        System.out.println("Lo siento, la clave es incorrecta\n");
        intentos--;
        if (intentos == 1) {
          System.out.println("Le queda " + intentos + " intento.");
          } else {
          System.out.println("Le quedan " + intentos + " intentos");
          }
      }
      
      

    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
    }
  }
}
