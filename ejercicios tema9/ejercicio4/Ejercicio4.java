/*
 * Tema 9, Ejercicio 4
 * 
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de
 * los métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 * 
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio4;

public class Ejercicio4 {

  public static void main(String[] args) {
    
    Fraccion f1 = new Fraccion(5, 10);
    System.out.println("Se crea una nueva fración que es: " + f1);
    System.out.println("La fracción se va a invertir: ");
    f1.seInvierte();
    
    System.out.println();
    Fraccion f2 = new Fraccion(23, 33);
    System.out.println("Se crea una nueva fracción que es " + f2 + " y se multiplica con la anterior " + f1 + " y el resultado es: ");
    
    System.out.println(f1.seMultiplica(23, 33));
    System.out.println();
    
    System.out.println("Ahora vamos a hacer que se dividan, " + f1 + " entre " + f2 + " y el resultado es: ");
    Fraccion f3 = f1.seDivide(23, 33);
    System.out.println(f3);
    
    System.out.println("Por último vamos a simplificar la fracción resultante del ejercicio anterior: ");
    Fraccion f4 = f3.seSimplifica(f3);
    System.out.println(f3 + " simplificada es: " + f4);
  }
}
