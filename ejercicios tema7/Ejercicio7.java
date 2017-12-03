/**
 * Tema 7, ejercicio 7
 * 
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces
 * por teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 * 
 * @author José Ruiz
 * 
 */


import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación se mostrarán 100 números aleatorios entre 0 y 20\n");
    System.out.print("luego se pedirá por teclado dos valores y se cambiarán las ocurrencias del\n");
    System.out.println("primer valor por el segundo.\n");
    
    //se declara el array
    int[] numeros = new int[30];
    //se recogen en el array 100 numeros aleatorios entre 0 y 20
    for (int i = 0; i < 30; i++) {
      numeros [i] = (int)(Math.random() * 21);
    }
    //se muestran los 100 numeros
    for (int i = 0; i < 30; i++) {
      System.out.print("[ " + numeros [i]  + " ]");
    }
    
    System.out.println();
    
    //se pide el número que se quiere sustituir
    System.out.print("Por favor, introduzca un número de los que se han mostrado: \n");
    int sustituido = Integer.parseInt(s.nextLine());
    //se pide el numero que se quiere como sustituto
    System.out.print("Ahora introduzca un número por el que quiera sustituirlo: \n");
    int sustituto = Integer.parseInt(s.nextLine());
    
    //se muestran de nuevo los 100 numeros
    for (int i = 0; i < 30; i++) {
      if (numeros [i] == sustituido) {
      numeros [i] = sustituto;
      System.out.print("[\"" + numeros [i]  + "\"]");
      }else {
        System.out.print("[ " + numeros [i]  + " ]");
      }
    }
  }
}
