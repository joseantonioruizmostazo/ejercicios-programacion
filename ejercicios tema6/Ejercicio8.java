/**
 * Tema 6, ejercicio 8
 * 
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * 
 * @author José Ruiz
 */

public class Ejercicio8 {
  public static void main(String[] args) {
    
    System.out.println("A continuación se mostrarán 3 apuetas de la quiniela al azar\n");
    
    for (int i = 1; i <= 15; i++) {
      
      String apuestaUno = "";
      switch((int)(Math.random() * 6) + 1) {
          case 1:
            apuestaUno = "1  ";
            break;
          case 2:
            apuestaUno = "1  ";
            break;
          case 3:
            apuestaUno = "1  ";
            break;
          case 4:
            apuestaUno = " x ";
            break;
          case 5:
            apuestaUno = " x ";
            break;
          case 6:
            apuestaUno = "  2";
            break;
          default:
      }
      String apuestaDos = "";
      switch((int)(Math.random() * 6) + 1) {
          case 1:
            apuestaDos = "1  ";
            break;
          case 2:
            apuestaDos = "1  ";
            break;
          case 3:
            apuestaDos = "1  ";
            break;
          case 4:
            apuestaDos = " x ";
            break;
          case 5:
            apuestaDos = " x ";
            break;
          case 6:
            apuestaDos = "  2";
            break;
          default:
      }
      
      String apuestaTres = "";
      switch((int)(Math.random() * 6) + 1) {
          case 1:
            apuestaTres=  "1  ";
            break;
          case 2:
            apuestaTres = "1  ";
            break;
          case 3:
            apuestaTres = "1  ";
            break;
          case 4:
            apuestaTres = " x ";
            break;
          case 5:
            apuestaTres = " x ";
            break;
          case 6:
            apuestaTres = "  2";
            break;
          default:
      }
      System.out.println(" |" + apuestaUno + "|" + apuestaDos + "|" + apuestaTres + "|");
    }
  }
}
