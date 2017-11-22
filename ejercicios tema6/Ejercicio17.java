/**
 * Tema 6, ejercicio 17
 * 
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro
 * de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 * 
 * @author José Ruiz
 */

package ejercicios.tema6;
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación deberás introducir la altura y anchura de una pecera\n");
    System.out.print("que deberá ser mínimo 4 en ambos casos y dentro de la pecera se mostrará\n");
    System.out.println("un pececito rellenando un espacio en cualquier posición aleatoria.\n");
    
    int altura;
    int anchura;
    
    
    System.out.print("Por favor, introduce la altura (mínimo 4): ");
    
    altura = Integer.parseInt(s.nextLine());
    
    System.out.print("Por favor, introduce la anchura (mínimo 4): ");
    
    anchura = Integer.parseInt(s.nextLine());
    
    int espacios = anchura - 2;
    
    int posicionAltura = (int)(Math.random() * (altura - 2));
    int posicionAnchura = (int)(Math.random() * (anchura -2));
    System.out.println(posicionAltura + " " + posicionAnchura);
    
    //Parte superior, primera linea
    for (int j = 0; j < anchura; j++) {
      
      System.out.print("*");
    }
    
    System.out.println();
    
    //cada linea de la parte interior
    for (int i = 0; i < altura - 2; i++) {
      System.out.print("*");
      
      //interior de cada linea
      for (int j = 0; j < espacios; j++) {
        //posicion del pez suplantando un espacio
        if ((i == posicionAltura)  && (j == posicionAnchura)) {
          System.out.print("&");
        }else {
          System.out.print(" ");
        }
      }
      System.out.print("*\n");
    }
    //base pecera
    for (int j = 0; j < anchura; j++) {
      System.out.print("*");
    }
  }
}