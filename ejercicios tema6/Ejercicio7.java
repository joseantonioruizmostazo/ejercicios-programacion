/**
 * Tema 6, ejercicio 7
 * 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author José Ruiz
 */

public class Ejercicio7 {
  public static void main(String[] args) {
    
    System.out.println("A continuación se mostrarán 3 apuetas de la quiniela al azar\n");
    
    for (int i = 1; i <= 15; i++) {
      
      String apuestaUno = "";
      switch((int)(Math.random() * 3) + 1) {
          case 1:
            apuestaUno = "1  ";
            break;
          case 2:
            apuestaUno = " x ";
            break;
          case 3:
            apuestaUno = "  2";
            break;
          default:
      }
      String apuestaDos = "";
      switch((int)(Math.random() * 3) + 1) {
          case 1:
            apuestaDos = "1  ";
            break;
          case 2:
            apuestaDos = " x ";
            break;
          case 3:
            apuestaDos = "  2";
            break;
          default:
      }
      
      String apuestaTres = "";
      switch((int)(Math.random() * 3) + 1) {
          case 1:
            apuestaTres=  "1  ";
            break;
          case 2:
            apuestaTres = " x ";
            break;
          case 3:
            apuestaTres = "  2";
            break;
          default:
      }
      System.out.println(" |" + apuestaUno + "|" + apuestaDos + "|" + apuestaTres + "|");
    }
  }
}
