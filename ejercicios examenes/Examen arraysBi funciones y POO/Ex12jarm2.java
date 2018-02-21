/**
 * Examen  2º Trimestre DAM
 * José Antonio Ruiz Mostazo
 * 19/02/18
 * 
 * Ejercicio 2
 * 
 * Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de forma aleatoria, que
 * encajen bien y que estén bien colocadas según el juego del dominó. No hay que controlar que si se
 * repiten o no las fichas.
 * Ejemplo:
 * [6|1][1|4][4|4][4| ][ |3][3|2][2|6][6|5]
 * 
 * @author José Ruiz
 * 
 */

package ex12jarm;

public class Ex12jarm2 {

  public static void main(String[] args) {
      
    FichaDomino f = new FichaDomino(((int)(Math.random() * 7)), (int)(Math.random() * 7));
    System.out.print(f);
      
    for (int i = 1; i <= 7; i++) {

      f = new FichaDomino(f.getLadoDerecho(), (int)(Math.random() * 7));
      System.out.print(f);
    }
  }
}
