/**
 * Tema 6, ejercicio 23
 * 
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 * 
 * Ejemplo 1:
 * 
 * Q J 7 J As
 * 
 * Ejemplo 2:
 * 
 * K 8 J As 7
 * 
 * @author José Ruiz
 */


public class Ejercicio23 {
  public static void main(String[] args) {
    
    int tirada;
    String valor = "";
    
    System.out.print("A continuación se mostrará la tirada de cinco dados de poker.\n");
    //bucle de 5 tiradas del dado de poker
    for (int i = 1; i <= 5; i++) {
      //numero aleatorio del 1 al 6, que son las posibilidades posibles
      tirada = ((int)(Math.random() * 6) + 1);
     //se asigna un valor a cada uno de las 6 posibilidades 
     switch(tirada) {
          case 1:
            valor = "As";
            break;
          case 2:
            valor = "K";
            break;
          case 3:
            valor = "Q";
            break;
          case 4:
            valor = "j";
            break;
          case 5:
            valor = "7";
            break;
          case 6:
            valor = "8";
            break;
          default:
      } 
     //esto sigue dentro del for, se imprimen los 5 valores separados por espacios.
     System.out.print(valor  + " ");
    }
  }
}
