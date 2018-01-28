/**
 * Funciones para arrays bidimensionales
 * 
 * @author Jose Ruiz
 */

package ejercicios.tema8.arrays;

public class ArraysBiDim {
  
  /**
   * Muestra un array bidimensional
   * 
   * @param x un array
   */
  public static void mostrarArrayBiInt (int x [][]) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[0].length; ++j) { //Longitud de una fila del array
        System.out.printf("[%4d ]", x[i][j]);
      }
      System.out.println();
    }
  }
  
  /**
   * Genera un array bidimensional
   * 
   * @param filas número entero positivo para definir el número de filas
   * @param columnas número entero positivo para definir el número de columnas
   * @param min número entero positivo
   * @param max número entero positivo
   * @return array bidimensional
   */
  public static int [][] generaArrayBiInt (int filas, int columnas, int min, int max) {
    int [][] array = new int [filas][columnas];
      
    for (int i = 0; i < filas; ++i) {
      for (int j = 0; j < columnas; ++j) {
          array[i][j] = (int)(Math.random()*((max + 1) - min)) + min;
      }
    }
    return array;
  }
  
  /**
   * Devuelve la fila i-ésima del array que se pasa como parámetro.
   * 
   * @param x array que se introduce como parámetro
   * 
   * @return la fila i-ésima del array que se pasa como parámetro.
   */
  public static int [] filaDeArrayBiInt (int x [][], int fila) {
    int [] array = new int [x[0].length];
    for (int i = 0; i < array.length; i++) {
      array[i] = x[fila][i];
    }
    return array;
  }
  
  /**
   * Devuelve la columna j-ésima del array que se pasa como parámetro.
   * 
   * @param x array que se introduce como parámetro
   * 
   * @return la columna j-ésima del array que se pasa como parámetro.
   */
  public static int [] columnaDeArrayBiInt (int x [][], int columna) {
    int [] array = new int [x.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = x[i][columna];
    }
    return array;
  }
  
  /**
   * Devuelve la fila y la columna (en un array con dos elementos) de la primera
   * ocurrencia de un número dentro de un array bidimensional. Si el número no
   * se encuentra en el array, la función devuelve el array {-1, -1}.
   * 
   * @param x array que se introduce como parámetro
   * @param numero número del que deseamos averiguar sus coordenadas
   * 
   * @return coordenadas del número introducido.
   */
  public static int [] coordenadasEnArrayBiInt (int x [][], int numero) {
    int [] array = new int [2];
    array[0] = -1;
    array[1] = -1;
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[0].length; j++) {
        if (numero == x[i][j]) {
          array[0] = i;
          array[1] = j;
          return array;     //Si la condición se cumple, este return muestra las coordenadas del número
        }
      }
    }
    return array; //si no se cumple la condición anterior, las coordenadas tomarán el valor [-1][-1] con este return
  }
  
  /**
   * Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
   * 
   * @param x array que se introduce como parámetro
   * @param numero número del que deseamos averiguar si es punto de silla
   * 
   * @return Devuelve <code>true</code> si es punto de silla o <code>false</code> si no lo es
   */
  public static boolean esPuntoDeSilla (int x [][], int numero) {
    boolean puntoSilla = false;
    int [] array = coordenadasEnArrayBiInt(x, numero);//array de 2 valores (coordenadas)
    int [] fila = new int [x[0].length];//array de la longitud de la fila
    int [] columna = new int [x.length];//array de la longitud de la columna
    
    for (int i = 0; i < fila.length; i++) { //revisa cada valor de la fila del número introducido
      fila[i] = x[array[0]][i]; 
    }
    for (int i = 0; i < columna.length; i++) {//revisa cada valor de la columna del número introducido
      columna[i] = x[i][array[1]];
    }
    if ((numero == ArraysUniDim.minimoArrayInt(fila))&&(numero == ArraysUniDim.maximoArrayInt(columna))) {
      puntoSilla = true;//compara si el número es el mínimo de su fila y el mayor de su columna y devuelve true
    }
    return puntoSilla;//si no cumple la condición anterior devuelve false
  }
  
  /**
   * Devuelve un array que contiene una de las diagonales del array bidimensional que se
   * pasa como parámetro. Se pasan como parámetros fila, columna y dirección. La fila y la columna determinan
   * el número que marcará las dos posibles diagonales dentro del array. La dirección es una cadena de
   * caracteres que puede ser “nose” o “neso”. La cadena “nose” indica que se elige la diagonal que va del noroeste hacia
   * el sureste, mientras que la cadena “neso” indica que se elige la diagonal que va del noreste hacia el suroeste.
   * 
   * @param x array que se introduce como parámetro
   * @param fila determina el número que marcará las dos posibles diagonales dentro del array
   * @param columna determina el número que marcará las dos posibles diagonales dentro del array
   * @param direccion direccion de la diagonal
   * @return la diagonal elegida en un array
   */
  public static int [] diagonal (int x [][], int fila, int columna, String direccion) {
    int elementos = 0, i, j;
    int[] diagonalAux = new int [1000];
    
    for (i = 0; i < x.length; i++) {
      for (j = 0; j < x[0].length; j++) {
        if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))
          || (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
          diagonalAux[elementos++] = x[i][j];
        }
      }
    }
    int[] diagonal = new int[elementos];
    for (j = 0; j < elementos; j++) {
      diagonal[j] = diagonalAux[j];
    } 
    return diagonal;
  }
}

//Otra forma de hacerlo, pero la diagonal siempre toma la longitud de una fila del array
/*int contador = 0;
    int [] array = new int [x.length]; //se declara un array con la longitud de una fila del array x
    
    if (direccion.equals("nose")) { //Si la dirección va de (arriba-izquierda) a (abajo-derecha)
        while ((fila > 0)&&(columna > 0)) {
        --fila;
        --columna;
      }
      while ((fila < x.length)&&(columna < x[0].length)) {
        array[contador] = x[fila][columna];
        contador++;
        ++fila;
        ++columna;
      }
    } else { //la dirección será 'nose' (arriba-derecha) a (abajo-izquierda)
      while ((fila > 0)&&(columna < x[0].length)) {
        --fila;
        ++columna;
      }
      while ((fila < x.length)&&(columna >= 0)) {
        array[contador] = x[fila][columna];
        contador++;                                     
        ++fila;                                         
        --columna;
      }
    }
    return array;
  }*/