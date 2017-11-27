/**
 * Tema 6, ejercicio 15
 * 
 * Realiza un generador de melodía con las siguientes condiciones:
 * 
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 * sol, la y si.
 * 
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * 
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 * con dos barras.
 * 
 * d) La última nota de la melodía debe coincidir con la primera.
 * 
 * Ejemplo 1:
 * 
 * do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
 * 
 * Ejemplo 2:
 * 
 * la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 * 
 * @author José Ruiz
 */

public class Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.println("A continuación se simulará una melodía con notas al azar\n");
    
    int numeroNota;
    int numeroCompases;
    int contadorNotas = 0;
    String primeraNota = "";
    
    numeroCompases = ((int) (Math.random() * 7) + 1); //Número aleatorio de 1 a 7 (números de compases).
    for (int j = 0; j < numeroCompases; j++) {
      
      for (int i = 0; i < 4 ; i ++) { //Compás de 4 notas
        
        numeroNota = ((int)(Math.random() * 7) + 1);
        contadorNotas++;
        
        String nota = "";

        switch(numeroNota) {
          case 1:
            nota = "do";
            break;
          case 2:
            nota = "re";
            break;
          case 3:
            nota = "mi";
            break;
          case 4:
            nota = "fa";
            break;
          case 5:
            nota = "sol";
            break;
          case 6:
            nota = "la";
            break;
          case 7:
            nota = "si";
            break;
          default:
        }
        
        if (contadorNotas == 1) {
          primeraNota = nota;
        }
        if (contadorNotas == 4 * numeroCompases) {
          nota = primeraNota;
        }
        System.out.print(" " + nota + " ");
      }
      System.out.print("|");
    }
    System.out.println("|\n");
  }
}
