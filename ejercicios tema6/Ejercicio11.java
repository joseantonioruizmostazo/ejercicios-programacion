/**
 * Tema 6, ejercicio 11
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc
 * 
 * @author José Ruiz
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.print("A continuación se mostrarán 20 notas al azar en forma de\n");
    System.out.print("suspenso, suficiente, bien, notable o sobresaliente\n");
    System.out.println("Y se mostrará la cantidad de cada uno de ellos\n");
    
    int cantidadSuspenso = 0;
    int cantidadSuficiente = 0;
    int cantidadBien = 0;
    int cantidadNotable = 0;
    int cantidadSobresaliente = 0;
    
    //Bucle para las 10 líneas.
    for (int i = 1; i <= 20; i++) {
      int tipoNota = ((int)(Math.random() * 5) + 1);
      String nota = "";
      switch(tipoNota) {
        case 1:
          nota = "Suspenso";
          cantidadSuspenso++;
          break;
        case 2:
          nota = "Suficiente";
          cantidadSuficiente++;
          break;
        case 3:
          nota = "Bien";
          cantidadBien++;
          break;
        case 4:
          nota = "Notable";
          cantidadNotable++;
          break;
        case 5:
          nota = "Sobresaliente";
          cantidadSobresaliente++;
          break;
        default:
      }
      System.out.println(nota);
    }
    System.out.println("Hay " + cantidadSuspenso + " suspenso/s.");
    System.out.println("Hay " + cantidadSuficiente + " suficiente/s.");
    System.out.println("Hay " + cantidadBien + " bien/es.");
    System.out.println("Hay " + cantidadNotable + " notable/s.");
    System.out.println("Hay " + cantidadSobresaliente + " sobresaliente/s.");
  }
}
