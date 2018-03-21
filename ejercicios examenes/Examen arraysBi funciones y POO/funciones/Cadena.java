
package ex12jarm.funciones;

public class Cadena  {
  
  /**
   * Dice si una palabra está o no dentro de un array.
   * 
   * @param array.
   * @param p.
   * @return True si no está en el array o False si está.
   */
  public static boolean noEstaEnArraySt(String array[], String p) {
	        
	        boolean noEsta = true;
	        for (int i = 0; i < array.length; i++) {
	          if (array[i].equals(p)) {
	            noEsta = false;
	          }
	        }
	        
	        return noEsta;
	    }
      
      
  /**
   * Borra las repeticiones de un array de String.
   * 
   * @param s.
   * @return array sin repeticiones.
   */    
  public static String[] sinRepetir(String[] s) {
    
    String [] aux = new String [s.length];
    int index = 0;
    
    for (int i = 0; i < aux.length; i++) {
    
      aux [i] = "";
      
    }
    
    for (int i = 0; i < s.length; i++) {
      
      if (noEstaEnArraySt(aux,s[i])) {
        
        aux[index++] = s[i];
        
      }
    
    
    }
    String [] aux2 = new String [index];
    
    for (int i = 0; i < index; i++) {
      
      aux2[i] = aux[i];
      
    }
    
    return aux2;
    
  }
  
  
  /**
   * Muestra un array de String.
   * 
   * @param s.
   */ 
  public static void muestraArraySt(String[] s) {
    
    for (int i = 0; i < s.length; i++) {
      
      System.out.print(s[i] + " ");
    }
    
  }
}
