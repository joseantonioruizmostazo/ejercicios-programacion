/**
 * Tema 6, ejercicio 18
 * 
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 * 
 * @author José Ruiz
 */
package ejercicios.tema6;

public class Ejercicio18 {
  public static void main(String[] args) {
    
    System.out.println("A continuación se pintarán 3 dormitorios de diferentes colores\n");
    
    String colorUno = "";
    String colorDos = "";
    String colorTres = "";
    int dormitorioUno;
    int dormitorioDos;
    int dormitorioTres; 
    do {
      dormitorioUno = ((int)(Math.random() * 6) + 1);
      dormitorioDos = ((int)(Math.random() * 6) + 1);
      dormitorioTres = ((int)(Math.random() * 6) + 1);
    } while ((dormitorioUno == dormitorioDos) || (dormitorioUno == dormitorioTres) || (dormitorioDos == dormitorioTres));
      
      switch(dormitorioUno) {
        case 1:
          colorUno = "Rojo";
          break;
        case 2:
          colorUno = "Azul";
          break;
        case 3:
          colorUno = "Verde";
          break;
        case 4:
          colorUno = "Amarillo";
          break;
        case 5:
          colorUno = "Violeta";
          break;
          case 6:
          colorUno = "Naranja";
          break;
        default:
      }
      switch(dormitorioDos) {
        case 1:
          colorDos = "Rojo";
          break;
        case 2:
          colorDos = "Azul";
          break;
        case 3:
          colorDos = "Verde";
          break;
        case 4:
          colorDos = "Amarillo";
          break;
        case 5:
          colorDos = "Violeta";
          break;
          case 6:
          colorDos = "Naranja";
          break;
        default:
      }
      switch(dormitorioTres) {
        case 1:
          colorTres = "Rojo";
          break;
        case 2:
          colorTres = "Azul";
          break;
        case 3:
          colorTres = "Verde";
          break;
        case 4:
          colorTres = "Amarillo";
          break;
        case 5:
          colorTres = "Violeta";
          break;
          case 6:
          colorTres = "Naranja";
          break;
        default:
      }
      
      System.out.println("Dormitorio uno: " + colorUno);
      System.out.println("Dormitorio dos: " + colorDos);
      System.out.println("Dormitorio tres: " + colorTres);
      
    
  }
}