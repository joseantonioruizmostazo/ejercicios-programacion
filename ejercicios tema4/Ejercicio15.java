/**
 * Tema 4, ejercicio 15
 *
 * Escribe un programa que pinte una pirámide rellena con un carácter introdu-
 * cido por teclado que podrá ser una letra, un número o un símbolo como *, +,
 * -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
 * el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
 * izquierda o hacia la derecha.
 * 
 *@author José Ruiz
 */

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Pirámide con caractéres con el vértice mirando en 4 posiciones\n");
    System.out.println("Inserta una letra, número o caracter para utilizar como relleno de la pirámide\n");
    String r = (s.nextLine());
    System.out.println("¿Hacia dónde quieres que mire el vértice de una pirámide?");
    System.out.println("1) Hacia arriba\n2) Hacia abajo\n3) Hacia la izquierda\n4) Hacia la derecha"); 
    System.out.print("=> ");
    int respuesta = Integer.parseInt(s.nextLine());
    
      
    switch(respuesta) {
      case 1:
        System.out.println("    " + r + "    ");
        System.out.println("   " + r + r + r + "   ");
        System.out.println("  " + r + r + r + r + r + "  ");
        System.out.println(" " + r + r + r + r + r + r + r + " ");
        System.out.println(r + r + r + r + r + r + r + r + r);
        break;
      case 2:
        System.out.println(r + r + r + r + r + r + r + r + r);
        System.out.println(" " + r + r + r + r + r + r + r + " ");
        System.out.println("  " + r + r + r + r + r + "  ");
        System.out.println("   " + r + r + r + "   ");
        System.out.println("    " + r + "    ");
        break;
      case 3:
        System.out.println("        " + r);
        System.out.println("       " + r + r);
        System.out.println("      " + r + r + r);
        System.out.println("     " + r + r + r + r);
        System.out.println("    " + r + r + r + r + r);
        System.out.println("     " + r + r + r + r);
        System.out.println("      " + r + r + r);
        System.out.println("       " + r + r);
        System.out.println("        " + r);
        break;
      case 4:
        System.out.println(r + "        ");
        System.out.println(r + r + "       ");
        System.out.println(r + r + r + "      ");
        System.out.println(r + r + r + r + "     ");
        System.out.println(r + r + r + r + r + "    ");
        System.out.println(r + r + r + r + "     ");
        System.out.println(r + r + r + "      ");
        System.out.println(r + r + "       ");
        System.out.println(r + "        ");
        break;
        default:
    }
  }
}
