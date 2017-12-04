/**
 * Tema 7, ejercicio 8
 * 
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 * 
 * @author José Ruiz
 * 
 */


import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación se pedirá que introduzca la temperatura media de cada mes\n");
    System.out.println("de un determinado año y se mostrará un diagrama de barras con esos datos\n");
    
    String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    
    int[] temperatura = new int[12];
    int i;
    int j;
    
    //Se recogen 12 temperaturas media
    for (i = 0; i < 12; i++) {
      System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
      temperatura [i] = Integer.parseInt(s.nextLine());
    }
    System.out.println();
    //se muestra el nombre de los meses con una barra separadora
    for (i = 0; i < 12; i++) {
      System.out.printf("%15s" + "│", mes[i]);
      //se muestran las barras de temperatura
      for (j = 0; j < temperatura[i]; j++) {
        System.out.print("▄");
      }
      //se muesta la temperatura en grados y añade un salto de linea
      System.out.println(" " + temperatura[i] + "ºC");
    }
  }
}
