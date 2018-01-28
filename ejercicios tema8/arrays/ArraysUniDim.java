/**
 * Funciones para arrays de una dimensión
 * 
 * @author Jose Ruiz
 */

package ejercicios.tema8.arrays;
import ejercicios.tema8.matematicas.Varios;
public class ArraysUniDim {
  
  
  /**
   * Muestra un array
   * 
   * @param x un array
   */
  public static void mostrarArrayInt(int x []) {
    for (int i = 0; i < x.length; i++) {
      System.out.printf("[%4d ]", x[i]);
    }
  }
  
  /**
   * Genera un array de tamaño <code>n</code> con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * 
   * @param numero un numero entero positivo
   * @param min parametro mínimo del intervalo, un número entero positivo
   * @param max parametro máximo del intervalo, un número entero positivo
   * @return  Array generado
   */
  public static int[] generaArrayInt(int x, int min, int max) {
    int [] array = new int [x];
    for (int i = 0; i < array.length; ++i) {
      array[i] = (int)(Math.random()*((max + 1) - min)) + min;
    }
    return array;
  } 
  
  /**
   * Devuelve el valor mínimo del array que se pasa como parámetro.
   * 
   * @param x array de números enteros
   * @return  valor mínimo del array
   */
  public static int minimoArrayInt(int x []) {
    int minimo = maximoArrayInt(x);
    for (int i = 0; i < x.length; i++) {
      if (x[i] < minimo) {
        minimo = x[i];
      }
    }
    return minimo;
  }
  
  /**
   * Devuelve el valor máximo del array que se pasa como parámetro.
   * 
   * @param x array de números enteros
   * @return  valor máximo del array
   */
  public static int maximoArrayInt(int x []) {
    int maximo = 0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] > maximo) {
        maximo = x[i];
      }
    }
    return maximo;
  }
  
  /**
   * Devuelve la media del array que se pasa como parámetro.
   * 
   * @param x array de números enteros
   * @return  valor máximo del array
   */
  public static double mediaArrayInt(int x []) {
    double media = 0;
    for (int i = 0; i < x.length; i++) {
        media += x[i];
    }
    return media / x.length;
  }
  
  /**
   * Dice si un número está o no dentro de un array.
   * 
   * @param x array de números enteros
   * @param numero número del que se desea conocer si se encuentra dentro del array o no
   * @return <code>true</code> En el caso de que esté
   * @return <code>false</code> En el caso de que no esté
   */
  public static boolean estaEnArrayInt(int x [], int numero) {
    boolean esta = false;
    for (int i = 0; i < x.length; i++) {
      if (numero ==  x[i]) {
        return esta = true;
      }
    }
    return esta;
  }
  
  /**
   * Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
   * 
   * @param x array de números enteros
   * @param numero numero entero
   * @return  posición del índice en la que se encuentra
   */
  public static int posicionEnArray(int x [], int numero) {
    int posicion = -1;
    for (int i = 0; i < x.length; i++) {
       if (numero == x[i]) {
         posicion = i;
       }
    }
    return posicion;
  }
  
  /**
   * Le da la vuelta a un array.
   * 
   * @param x array de números enteros
   * @return  Array volteado
   */
  public static void volteaArrayInt(int x []) {
    int [] copia = new int [x.length];
    int contador = 0;
    for (int i = x.length - 1; i >= 0; i--) {
      copia[contador] = x[i];
      contador++;
    }
    for (int i = 0; i < copia.length; i++) {
      System.out.print("[" + copia[i] + "]");
    }
  }
  
  /**
   * Rota <code>n</code> posiciones a la derecha los números de un array.
   * 
   * @param x array de números enteros
   * @param posiciones número de posiciones que se quiere rotar el array a la derecha
   * @return  Array rotado <code>n</code> posiciones a la derecha
   */
  public static int [] rotaDerechaArrayInt(int x [], int posiciones) {
    int [] copia = new int [x.length + 1]; //se declara el array copia con la misma capacidad que el array x
    int [] auxiliar = new int [x.length + 1];//se declara el array auxiliar con la misma capacidad que el array x
    
    if (posiciones == 0) {
      for (int i = 0; i < copia.length - 1; ++i) {      //Si el número de posiciones a rotar es 0 el array se queda igual
        copia[i] = x[i];
      }
      return copia;
    } else {
    
      for (int i = 0; i < copia.length - 1; ++i) {
        copia[i] = x[i];                                //Aquí se copian los valores del array x en el array copia
      }

      for (int i = 0; i < posiciones; i++) {

        for (int j = 0; j < copia.length - 1; j++) {
          auxiliar[j + 1] = copia[j];                   //Aquí rota el array
          if (j + 1 == copia.length - 1) {
            auxiliar[0] = copia[copia.length - 2];
          }
        }

        for (int j = 0; j < copia.length; j++) {
          copia[j] = auxiliar[j];                       //Aquí se copia para luego al rotar de nuevo no machacar el valor
        }
      }
      return auxiliar;
    }
  }
  
  /**
   * Rota <code>n</code> posiciones a la izquierda los números de un array.
   * 
   * @param x array de números enteros
   * @param posiciones número de posiciones que se quiere rotar el array a la izquierda
   * @return  Array rotado <code>n</code> posiciones a la izquierda
   */
  public static int [] rotaIzquierdaArrayInt(int x [], int posiciones) {
    int [] copia = new int [x.length + 1]; //se declara el array copia con la misma capacidad que el array x
    int [] auxiliar = new int [x.length + 1];//se declara el array auxiliar con la misma capacidad que el array x
    
    if (posiciones == 0) {
      for (int i = 0; i < copia.length - 1; ++i) {      //Si el número de posiciones a rotar es 0 el array se queda igual
        copia[i] = x[i];
      }
      return copia;
    } else {
    
      for (int i = 0; i < copia.length - 1; ++i) {
        copia[i] = x[i];                                //Aquí se copian los valores del array x en el array copia
      }

      for (int i = 0; i < posiciones; i++) {
        for (int j = copia.length - 2; j >= 0; j--) {                   //Aquí rota el array
          if (j - 1 == -1) {
          auxiliar[auxiliar.length - 2] = copia[0];
          } else {
            auxiliar[j - 1] = copia[j];
          }
        }
        for (int j = 0; j < copia.length; j++) {
          copia[j] = auxiliar[j];                       //Aquí se copia para luego al rotar de nuevo no machacar el valor
        }
      }
      return auxiliar;
    }
  }
  
/**
 * Devuelve un array con todos los números primos que
 * se encuentren en otro array
 * 
 * @param x un array del que queremos buscar los números primos
 * @return Devuelve un array formado solo con los números primos del array pasado por parámetro
 */
  public static int[] filtraPrimos(int x[]) {
    int contador = 0;
    int [] primoAux = new int [1000];
    for (int i = 0; i < x.length; i++) {
      if (Varios.esPrimo(x[i])) {
        primoAux[contador] = x[i];
        ++contador;
      }
    }
    if (contador == 0) {
      primoAux[0] = -1;
    }
    int [] primo = new int [contador];
    for (int j = 0; j < contador; j++) {
      primo[j] = primoAux[j];
    }  
    return primo;
  }
}