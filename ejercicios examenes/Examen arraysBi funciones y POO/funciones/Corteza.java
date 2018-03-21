
package ex12jarm.funciones;

public class Corteza  {
  
  /**
   * Recorre un array bidimensional por la corteza para convertirlo en un array de una dimensión.
   * 
   * @param array bidimensional.
   * 
   * @return array de una dimensión.
   */
  public static int[] corteza(int[][] n) {
    
    int [] aux = new int [(n[0].length * 2) + (n.length * 2 - 4)];
    int index = 0;
    
    for(int i = 0; i < n[0].length; i++) {
      
      aux[index++] = n[0][i];

      
    }
    
    for(int j = 1; j < n.length; j++) {
      
      aux[index++] = n[j][n[0].length - 1];
 
    }
    
    for(int i = n[0].length - 2; i >= 0; i--) {
      
      aux[index++] = n[n.length - 1][i];
   
    }
    
    for(int j = n.length - 2; j > 0; j--) {
      
      aux[index++] = n[j][0];
 
    }
    
    return aux;
    
  }
  
  /**
   * Muestra un array.
   * 
   * @param  array.
   */
  public static void muestraArray(int array[]) {
	      
    for (int i=0; i < array.length; i++) {
      
      System.out.print(array[i] + " ");
      
    }
    
  }
  
  /**
    * Muestra un array bidemensional.
    * 
    * @param array.
    */
  public static void muestraArrayBi(int array[][]) {
	      
    for (int j=0; j< array.length; j++) {
      
      for (int i=0; i < array[j].length; i++) {
        
        System.out.print(array[j][i] + " ");
        
      }
      
      System.out.println();
    }
  }
           
}
