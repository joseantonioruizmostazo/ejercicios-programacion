/*
 * Tema 9, Ejercicio 6
 * 
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
 * son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
 * 30) donde los parámetros que se le pasan al constructor son las horas, los
 * minutos y los segundos respectivamente. Crea el método toString para ver los
 * intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
 * 35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
 * comprobar que la clase funciona bien.
 * 
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio6;

public class Ejercicio6 {

  public static void main(String[] args) {
    
  Tiempo t1 = new Tiempo(5, 59, 50);

    System.out.println("Se crea un nuevo tiempo que es (t1: " + t1 + ")");
    System.out.println("Le sumamos otro tiempo que metemos por parámetro: (5h 30m 45s)");
    Tiempo t2 = t1.suma(5, 30, 45);
    System.out.println("La suma es (t2: " + t2 + ")");
    System.out.println();
    
    System.out.println("Ahora vamos a sumar (t1: " + t1 + ") y (t2: " + t2 + ")");
    Tiempo t3 = t1.suma(t2);
    System.out.println("La suma es (t3: " + t3 + ")");
    System.out.println();
    
    System.out.println("Ahora vamos a sumar (t1: " + t1 + ")" + " más (t2: " + t2 + ")" + " más (t3: " + t3 + ")");
    Tiempo t4 = t1.suma(t2).suma(t3);
    System.out.println("La suma es (t4: " + t4 + ")");
    System.out.println();
    
    System.out.println("Ahora al tiempo (t2: " + t2 + ") le restaremos el tiempo (t1: " + t1 + ")");
    Tiempo t5 = t2.resta(t1);
    System.out.println("La resta es (t5: " + t5 + ")");
    System.out.println();
    
    System.out.println("Ahora al tiempo (t1: " + t1 + ") le restaremos el tiempo (t1: " + t1 + ")");
    Tiempo t6 = t1.resta(t1);
    System.out.println("La resta es (t6: " + t6 + ")");
    System.out.println();
    
    System.out.println("Ahora al tiempo (t1: " + t1 + ") le restaremos el tiempo (t2: " + t2 + ")");
    Tiempo t7 = t1.resta(t2);
    System.out.println("La resta es (t7: " + t7 + ")");
    System.out.println();
    
    System.out.println("Ahora al tiempo (t5: " + t5 + ") le restaremos el tiempo (t4: " + t4 + ")");
    Tiempo t8 = t5.resta(t4);
    System.out.println("La resta es (t8: " + t8 + ")");
    System.out.println();
    
    System.out.println("Ahora al tiempo (t4: " + t4 + ") le restaremos el tiempo (t5: " + t5 + ")");
    Tiempo t9 = t4.resta(t5);
    System.out.println("La resta es (t9: " + t9 + ")");
    System.out.println();
    
    
  }
}
