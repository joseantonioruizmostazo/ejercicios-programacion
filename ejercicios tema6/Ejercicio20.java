/**
 * Tema 6, ejercicio 20
 * 
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación deberás introducir la capacidad (en litros) de una cuba\n");
    System.out.println("y se llenará aleatoriamente con una serie de litros\n");
    
    int capacidad;
    int espacios = 10;
    int litros;
    
    System.out.print("Por favor, introduce la capacidad de la cuba: ");
    
    capacidad = Integer.parseInt(s.nextLine());
    litros = ((int)(Math.random() * (capacidad + 1)) + 0);
    
    //número de filas, capacidad de la cuba, se cuenta desde arriba hacia abajo(parte superior a base de la cuba)      
    for (int i = capacidad; i > 0; i--) {
      System.out.print("*");
      //me pinta el ancho con los valores mostrados a continuacion en el if
      for (int j = 0; j < espacios; j++) {
          //si hay mas capacidad que litros de agua pintara espacios
          if (i > litros) {
           System.out.print(" ");
           //y el resto que será agua pintará agua.
          } else{
            System.out.print("=");
          }
      }
      System.out.println("*");
    }
    System.out.println("************");
  }
}
