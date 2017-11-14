/**
 * Tema 6, ejercicio 6
 * 
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
 * ducido es menor o mayor que el número secreto.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int numeroOculto;
    int oportunidades = 5;
    int numeroIntroducido;
    
    System.out.print("A continuación el programa pensará un número entre ");
    System.out.print("0 y 100 (ambos incluídos) y tendrás 5 oportunidades para acertarlo, ");
    System.out.println("y si fallas el programa te dirá si el número es mayor o menor.\n");
    
    //Muestra 1 numero enteros aleatorios entre 0 y 100 (ambos incluídos).
    
      numeroOculto = ((int)(Math.random() * 101));
      //System.out.println("numero oculto " + numeroOculto); (Línea no mostrada para ocultar el número oculto).
      
    //Este es el principio de un do while.
    do { 
      System.out.print("Por favor introduzca un número: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      //Comprueba si coincide el número oculto y el introducido por teclado.
      if (numeroIntroducido == numeroOculto) {
        System.out.println();
        System.out.println("¡Enhorabuena! el numero oculto era: " + numeroOculto);
        oportunidades -= 5;
      //Si no coincide solo resta una oprtunidad y sigue jugando.
      } else { 
          System.out.println();
          System.out.println("Lo siento, no es correcto");
          oportunidades--;
          System.out.println("Te quedan: " + oportunidades + " oportunidades.");
        }
      //Si el número oculto es menor que el introducido se lo dirá como pista.
      if ((numeroIntroducido > numeroOculto) && (oportunidades > 0)) {
        System.out.println("El número es menor, prueba otra vez");
      } 
      //Si el número oculto es mayor que el introducido se lo dirá como pista.
      if ((numeroIntroducido < numeroOculto) && (oportunidades > 0)) {
        System.out.println("El número es mayor, prueba otra vez");
      }
    //Fin del do while, se 
    } while (oportunidades > 0);
          
      if (numeroIntroducido == numeroOculto) {
      System.out.println("Se acabó el juego, gracias por jugar.\n");  
      } else { 
          System.out.println("Se acabó el juego, gracias por jugar.\n");
          System.out.println("El número oculto era: " + numeroOculto);
        }
  }
}
