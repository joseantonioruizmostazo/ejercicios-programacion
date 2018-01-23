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
  public static long volteado(long x) {
    
    long n = 0;
    
    while (x > 0) {
      n = (x % 10) + (n * 10);
      x /= 10; 
    }
    return n;
  }
  
  /**
   * Le da la vuelta a un número entero positivo
   * 
   * @param x un número entero positivo
   * @return  número volteado
   */
  public static int volteado(int x) {
    
    return (int)volteado((long) x);
  }
  
  /**
   * Comprueba si un número entero positivo es capicúa.
   * 
   * @param n un número entero positivo.
   * @return  <code>true</code> si el número es capicúa o <code>false</code> en caso contrario.
   */
  public static boolean esCapicua(long n) {
    
    return (volteado(n) == n);
  }
  
  /**
   * Comprueba si un número entero positivo es capicúa.
   * 
   * @param n un número entero positivo.
   * @return  <code>true</code> si el número es capicúa o <code>false</code> en caso contrario.
   */
  public static boolean esCapicua(int n) {
    return esCapicua((long) n);
  }
  
  /**
   * Comprueba si un número entero positivo es primo.
   * 
   * @param n un número entero positivo.
   * @return  <code>true</code> si el número es primo o <code>false</code> en caso contrario.
   */
  public static boolean esPrimo(long n) {
  for (int i = 2; i < n; i++) {
    if ((n % i) == 0) {
        return false;
    }
  }
  return true;
  }
  
    /**
   * Comprueba si un número entero positivo es primo.
   * 
   * @param n un número entero positivo.
   * @return  <code>true</code> si el número es primo o <code>false</code> en caso contrario.
   */
  public static boolean esPrimo(int n) {
    return esPrimo((long) n);
  }
  
  /**
   * A partir de un número introducido debe mostrarnos el número primo siguiente.
   * 
   * @param n un número entero positivo.
   * @return  Siguiente número primo al introducido.
   */
  public static long siguientePrimo(long n) {
    
    while (!esPrimo(++n)) {
    }
    return n;
  }
  
  /**
   * A partir de un número introducido debe mostrarnos el número primo siguiente.
   * 
   * @param n un número entero positivo.
   * @return  Siguiente número primo al introducido.
   */
  public static int siguientePrimo(int n) {
    return (int)siguientePrimo((long)n);
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
   * Cuenta los dígitos de un número
   * 
   * @param n un número entero positivo
   * @return  número de dígitos de un numero
   */
  public static int digitos(long n) {
    
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
   * Cuenta los dígitos de un número
   * 
   * @param n un número entero positivo
   * @return  número de dígitos de un numero
   */
  public static int digitos(int n) {
      return (int)digitos((long) n);
  }
  
  /**
   * A partir de un número introducido y una posición se debe mostrar el dígito de esa posición.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param posicion una posición en ese número (empezando desde 0 y contando de izquierda a derecha).
   * @return  El dígito de la posición elegida.
   */
  public static int digitoN(long numeroIntroducido, int posicion) {
    
    numeroIntroducido = volteado(numeroIntroducido);

    while (posicion-- > 0) {
      numeroIntroducido = numeroIntroducido / 10;
    }
    return (int)numeroIntroducido % 10;
  }
  
    /**
   * A partir de un número introducido y una posición se debe mostrar el dígito de esa posición.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param posicion una posición en ese número (empezando desde 0 y contando de izquierda a derecha).
   * @return  El dígito de la posición elegida.
   */
  public static int digitoN(int numeroIntroducido, int posicion) {
    return digitoN((long)numeroIntroducido, posicion);
  }
  
  
  /**
   * A partir de un número introducido y un digito se debe mostrar la posición que ocupa.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param digito una posición en ese número (empezando desde 0 y contando de izquierda a derecha).
   * @return  El dígito de la posición elegida.
   */
  public static int posicionDeDigito(long numeroIntroducido, int digito) {
    int longitud = 0;
    int posicion = 0;
    long numVolteado = volteado(numeroIntroducido);
    int posicionDigito = -1;

    //Comprueba la posición
    while (numVolteado > 0) {
      if ((numVolteado % 10) == digito) {
        posicionDigito = posicion;
      }
      numVolteado /= 10;
      posicion++;
    }
    return posicionDigito;
  }
  
    /**
   * A partir de un número introducido y un digito se debe mostrar la posición que ocupa.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param digito una posición en ese número (empezando desde 0 y contando de izquierda a derecha).
   * @return  El dígito de la posición elegida.
   */
  public static int posicionDeDigito(int numeroIntroducido, int digito) {
    return posicionDeDigito((long)numeroIntroducido, digito);
  }
  
    /**
   * Le quita <code>n</code> números por detrás a un número introducido.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param quitaDetras es el número de dígitos que se desea quitar(por detrás) al número introducido).
   * @return  El número restante.
   */
  public static long quitaPorDetras(long numeroIntroducido, int quitaDetras) {
    
    long nuevoNum;
    long numDigitos = digitos(numeroIntroducido);
    
    if (numDigitos < quitaDetras) {
      return -1;
    }

    while (quitaDetras != 0) {
      numeroIntroducido /= 10;
      quitaDetras--;
    }
    nuevoNum = numeroIntroducido;
    return nuevoNum;
  }
  
      /**
   * Le quita <code>n</code> números por detrás a un número introducido.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param quitaDetras es el número de dígitos que se desea quitar(por detrás) al número introducido).
   * @return  El número restante.
   */
  public static int quitaPorDetras(int numeroIntroducido, int quitaDetras) {
    return (int)quitaPorDetras((long) numeroIntroducido, quitaDetras);
  }
  
   /**
   * Le quita <code>n</code> números por delante (por la izquierda) a un número introducido.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param quitaDelante es el número de dígitos que se desea quitar(por delante) al número introducido).
   * @return  El número restante.
   */
  public static long quitaPorDelante(long numeroIntroducido, int quitaDelante) {
    
    numeroIntroducido = volteado(numeroIntroducido);
    long quitaVolteado = quitaPorDetras(numeroIntroducido, quitaDelante);
    return volteado(quitaVolteado);
  }
  
     /**
   * Le quita <code>n</code> números por delante (por la izquierda) a un número introducido.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param quitaDelante es el número de dígitos que se desea quitar(por delante) al número introducido).
   * @return  El número restante.
   */
  public static int quitaPorDelante(int numeroIntroducido, int quitaDelante) {
    return (int)quitaPorDelante((long) numeroIntroducido, quitaDelante);
  }
  
   /**
   * Le añade un número por detrás a un número introducido.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param pegaDetras es dígito que se desea pegar(por detrás) al número introducido).
   * @return  El número restante.
   */
  public static long pegaPorDetras(long numeroIntroducido, int pegaDetras) {
    return (numeroIntroducido * 10) + pegaDetras;
  }
  
     /**
   * Le añade un número por detrás a un número introducido.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param pegaDetras es dígito que se desea pegar(por detrás) al número introducido).
   * @return  El número restante.
   */
  public static int pegaPorDetras(int numeroIntroducido, int pegaDetras) {
    return (int)pegaPorDetras((long) numeroIntroducido, pegaDetras);
  }
  
   /**
   * Le añade un número por delante a un número introducido.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param pegaDelante es dígito que se desea pegar(por detrás) al número introducido).
   * @return  El número restante.
   */
  public static long pegaPorDelante(long numeroIntroducido, int pegaDelante) {
    int numDigitos = digitos(numeroIntroducido);
    int potenciaPegaDelante = (int)potencia(10, numDigitos);
    return numeroIntroducido + (pegaDelante * potenciaPegaDelante);
  }
  
     /**
   * Le añade un número por delante a un número introducido.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param pegaDelante es dígito que se desea pegar(por detrás) al número introducido).
   * @return  El número restante.
   */
  public static int pegaPorDelante(int numeroIntroducido, int pegaDelante) {
    return (int)pegaPorDelante((long) numeroIntroducido, pegaDelante);
  }
  
   /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param inicio posicion inicial del número introducido).
   * @param fin posicion final del número introducido).
   * @return  El número restante.
   */
  public static long trozoDeNumero(long numeroIntroducido, int inicio, int fin) {
    int numDigitos = digitos(numeroIntroducido);
    numeroIntroducido = quitaPorDelante(numeroIntroducido, inicio);
    numeroIntroducido = quitaPorDetras(numeroIntroducido, numDigitos - fin - 1);
    return numeroIntroducido;
  }
  
     /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param inicio posicion inicial del número introducido).
   * @param fin posicion final del número introducido).
   * @return  El número restante.
   */
  public static int trozoDeNumero(int numeroIntroducido, int inicio, int fin) {
    return (int)trozoDeNumero((long) numeroIntroducido, inicio, fin);
  }
  
  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param pegaNumero otro número entero introducido para pegarlo al anterior.
   * @return  El número juntado.
   */
  public static long juntaNumeros(long pegaNumero, long numeroIntroducido) {
    return pegaPorDelante(numeroIntroducido, (int)pegaNumero);
  }
  
    /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param pegaNumero otro número entero introducido para pegarlo al anterior.
   * @return  El número juntado.
   */
  public static int juntaNumeros(int pegaNumero, int numeroIntroducido) {
    return (int)juntaNumeros((long) pegaNumero, (long) numeroIntroducido);
  }
  
    /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param pegaNumero otro número entero introducido para pegarlo al anterior.
   * @return  El número juntado.
   */
  public static long juntaNumeros(long pegaNumero, int numeroIntroducido) {
    return juntaNumeros((long) pegaNumero, numeroIntroducido);
  }
  
   /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
   * 
   * @param numeroIntroducido un número entero positivo.
   * @param pegaNumero otro número entero introducido para pegarlo al anterior.
   * @return  El número juntado.
   */
  public static long juntaNumeros(int pegaNumero, long numeroIntroducido) {
    return juntaNumeros(pegaNumero, (long) numeroIntroducido);
  }
  
  /**
   * Convierte un número binario en decimal.
   * 
   * @param numeroIntroducido un número binario compuesto por ceros y unos.
   * @return  el número en decimal.
   */
  public static long bin2Dec(long numeroIntroducido) {
    
    int exponente = 1;
    int base = 2;
    int numDigitos = digitos(numeroIntroducido);
    int numeroDecimal = 0;
    
    long numeroIntroducidoVolteado = volteado(numeroIntroducido * (10) + 7);//multiplico por 10 y le sumo un numero para que al voltearlo no me de error por si acaba en 0.
    
    while (numDigitos != 0){
      
      numeroDecimal += digitoN(numeroIntroducidoVolteado, exponente) * potencia(base, exponente -1);
      exponente++;
      numDigitos--;
    }
    return (numeroDecimal);
  }
  
    /**
   * Convierte un número binario en decimal.
   * 
   * @param numeroIntroducido un número binario compuesto por ceros y unos.
   * @return  el número en decimal.
   */
  public static int bin2Dec(int numeroIntroducido) {
    return (int)bin2Dec((long) numeroIntroducido);
  }
  
      /**
   * Convierte un número decimal en binario.
   * 
   * @param numeroIntroducido un número en base decimal.
   * @return  el número en binario.
   */
  public static long dec2Bin(long numeroIntroducido) {
    
    long binario = 8;
    
    while(numeroIntroducido > 1) {
      binario = pegaPorDetras(binario, (int)(numeroIntroducido % 2));
      numeroIntroducido /= 2;
    }
    binario = pegaPorDetras(binario,1);
    long volteadoBinario = volteado(binario);
    return quitaPorDetras(volteadoBinario,1);
  }
  
    public static int dec2Bin(int numeroIntroducido) {
    return (int)dec2Bin((long) numeroIntroducido);
  }
  
  
}