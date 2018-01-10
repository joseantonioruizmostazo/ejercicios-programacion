/**
 * Funciones matemáticas de propósito general
 * 
 * @author Jose Ruiz
 */

package ejercicios.tema8.matematicas;

public class Varios {
  
  /**
   * Le da la vuelta a un número entero positivo
   * 
   * @param x un número entero positivo
   * @return  número volteado
   */
  
  public static int volteado(int x) {
    
    int n = 0;
    
    while (x > 0) {
      n = (x % 10) + (n * 10);
      x /= 10; 
    }
    return n;
  }
  
  /**
   * Comprueba si un número entero positivo es capicúa.
   * 
   * @param n un número entero positivo.
   * @return  <code>true</code> si el número es capicúa o <code>false</code> en caso contrario.
   */
  
  public static boolean esCapicua(int n) {
    
    if (volteado(n) == n) {
        return true;
    } else {
    return false;
    }
  }
  
  /**
   * Comprueba si un número entero positivo es primo.
   * 
   * @param n un número entero positivo.
   * @return  <code>true</code> si el número es primo o <code>false</code> en caso contrario.
   */
  
  public static boolean esPrimo(int n) {
  for (int i = 2; i < n; i++) {
    if ((n % i) == 0) {
        return false;
    }
  }
  return true;
  }
  
  /**
   * A partir de un número introducido debe mostrarnos el número primo siguiente.
   * 
   * @param n un número entero positivo.
   * @return  Siguiente número primo al introducido.
   */
  
  public static int siguientePrimo(int n) {
    
    while (!esPrimo(++n)) {
    }
    return n;
  }
  
  /**
   * A partir de un número introducido y su exponente se debe mostrar la potencia.
   * 
   * @param base base de la potencia, un número entero positivo.
   * @param exponente exponente de la potencia.
   * @return  Resultado de la potencia.
   */
  
  public static long potencia(int base, int exponente) {
    
  long potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      potencia = 1/potencia;
    }
    return potencia;
  }
  
  /**
   * Le da la vuelta a un número entero positivo
   * 
   * @param x un número entero positivo
   * @return  número volteado
   */
  
  public static int digitos(int n) {
    
    if (n == 0) {
      return 1;
    } else {
      int x = 0;
      while (n > 0) {
        n = n / 10;
        x++;
      }
      return x;
    }
    }
  
  /**
   * A partir de un número introducido y una posición se debe mostrar el dígito de esa posición.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param posicion una posición en ese número (empezando desde 0 y contando de izquierda a derecha).
   * @return  El dígito de la posición elegida.
   */
  
  public static int digitoN(int numeroIntroducido, int posicion) {
    
    numeroIntroducido = volteado(numeroIntroducido);

    while (posicion-- > 0) {
      numeroIntroducido = numeroIntroducido / 10;
    }

    return (int)numeroIntroducido % 10;
  }
  
  
  /**
   * A partir de un número introducido y un digito se debe mostrar la posición que ocupa.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param digito una posición en ese número (empezando desde 0 y contando de izquierda a derecha).
   * @return  El dígito de la posición elegida.
   */
  
  public static int posicionDeDigito(int numeroIntroducido, int digito) {
    int longitud = 0;
    int posicion = -3;
    int volteado = 0;
    //Si el numero es igual a 0, la longitud será de 1.
    if (numeroIntroducido == 0) {
      longitud = 1;
    }
    
    //Para voltear el número y además averiguar su longitud.
    while (numeroIntroducido > 0) {
      volteado = (numeroIntroducido % 10) + (volteado * 10);
      numeroIntroducido /= 10;
      longitud++;
    }
    //Comprueba la posición
    while (volteado > 0) {
      if ((volteado % 10) == digito) {
      }
      volteado /= 10;
      posicion++;
    }
    return posicion;
  }
}