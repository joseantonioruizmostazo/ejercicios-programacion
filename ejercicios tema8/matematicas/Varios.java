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
    numeroIntroducido = pegaPorDetras(numeroIntroducido, 8);
    numeroIntroducido = volteado(numeroIntroducido);
    long quitaVolteado = quitaPorDetras(numeroIntroducido, quitaDelante);
    long normal = volteado(quitaVolteado);
    return normal = quitaPorDetras(normal,1);
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
    
    long copia = numeroIntroducido;
    long numeroDecimal = 0;
    long resto = 0;
    
    for (int i = 0; i < digitos(copia); ++i) {
      resto = numeroIntroducido % 10;
      
      numeroDecimal += ((potencia(2, i)) * resto);
      numeroIntroducido /= 10;
    }
    return numeroDecimal;
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
   * @return el número en binario.
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
  
  /**
   * Convierte un número decimal en binario.
   * 
   * @param numeroIntroducido un número en base decimal.
   * @return el número en binario.
   */
  public static int dec2Bin(int numeroIntroducido) {
    return (int)dec2Bin((long) numeroIntroducido);
  }

  /**
   * Convierte un número binario en octal.
   * 
   * @param numeroIntroducido un número binario compuesto por ceros y unos.
   * @return  el número en octal.
   */
  public static long bin2Oct(long numeroIntroducido) {
    int numeroOctal = 9;
    int numDigitos = digitos(numeroIntroducido);
    int trozos = 0;
    int trio = 0;
    int copiaTrozos = 0;
    
    if (numDigitos % 3 == 0) {
      trozos = numDigitos /3;
    } else {
      trozos = (numDigitos /3) + 1;
      copiaTrozos = trozos;
    }
    
    for (int i = 0; i < trozos; i++) {
      if (copiaTrozos > 1) {
        
        trio = (int)trozoDeNumero(numeroIntroducido, digitos(numeroIntroducido) -3, digitos(numeroIntroducido) - 1);
        numeroIntroducido = trozoDeNumero(numeroIntroducido, 0, digitos(numeroIntroducido) -4);
        int digitoDecimal = bin2Dec(trio);
        numeroOctal = pegaPorDetras(numeroOctal,digitoDecimal);
      } else {
        numeroOctal = pegaPorDetras(numeroOctal,bin2Dec((int)numeroIntroducido));
      }
      copiaTrozos--;
    }
    numeroOctal = volteado(numeroOctal);
    numeroOctal = quitaPorDetras(numeroOctal,1);
    return numeroOctal;
  }
  
  /**
   * Convierte un número binario en hexadecimal.
   * 
   * @param numeroIntroducido un número binario compuesto por ceros y unos.
   * @return  el número en hexadecimal.
   */
  public static String bin2Hex(long numeroIntroducido) {
    long numeroIntroducidoDecimal = bin2Dec(numeroIntroducido);
    int resto = 0;
    String [] digitoHexa = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",};
    String hexadecimal = "";
    String numeroFinal = "";
    int i = 0;
    while (numeroIntroducidoDecimal > 0) {
      resto = (int)numeroIntroducidoDecimal % 16;
      while (i < resto) {
        ++i;
      }
      hexadecimal += digitoHexa[i];
      numeroIntroducidoDecimal /= 16;
      i = 0;
    }
    for (int j = hexadecimal.length() - 1; j>=0; --j) {
      numeroFinal = numeroFinal + hexadecimal.charAt(j);
    }
    return numeroFinal;
  }
  
  /**
   * Convierte un número hexadecimal en binario.
   * 
   * @param numeroIntroducido un número hexadecimal compuesto por una cadena de 0 a F.
   * @return  el número en binario.
   */
  public static long hex2Bin(String numeroIntroducido) {
    
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;
    
    for (int i = 0; i < numeroIntroducido.length(); i++) {
      binario = binario * 10000 + dec2Bin(digitosHexa.indexOf(numeroIntroducido.charAt(i)));
    }
    return binario;
  }
  
  /**
   * Convierte un número octal en binario.
   * 
   * @param numeroIntroducido un número en base 8.
   * @return  el número en binario.
   */
  public static long oct2Bin(long numeroIntroducido) {
    
    long binario = 0;
    
    for (int i = 0; i < digitos(numeroIntroducido); i++) {
      binario = binario * 1000 + dec2Bin((digitoN(numeroIntroducido,i)));
    }
    return binario;
  }
  
/**
 * Esta función convierte el número n al sistema de palotes
 * y lo devuelve en una cadena de caracteres
 * 
 * 
 * @param n numero entero positivo.
 * @return Devuelve un string del numero que se pasa a palotes.
 */
  public static String convierteEnPalotes(int n) {
    String palotes = "";
    n = Varios.volteado(n);
    int resto = 0;
    while (n > 0) {
      resto = n % 10;
      for (int i = 0; i < resto; i++) {
        palotes += "|";
      }
      n /= 10;
      palotes += "-";
    }
    palotes = palotes.substring(0, palotes.length() - 1);
    return palotes;
  }
    
/**
 * Esta función convierte el número n a código morse
 * y lo devuelve en una cadena de caracteres
 * 
 * @param n numero entero positivo.
 * @return Devuelve un string del numero que se pasa a código morse.
 */
  public static String convierteEnMorse(int n) {
    String [] morse = {" _ _ _ _ _", " . _ _ _ _", " . . _ _ _", " . . . _ _", " . . . . _", " . . . . .", " _ . . . .", " _ _ . . .", " _ _ _ . .", " _ _ _ _ ."};
    String codigo = "";
    int resto = 0;
    n = Varios.pegaPorDetras(n, 8);
    n = Varios.volteado(n);
    while (n >= 10) {
      resto = (int)n % 10;
      codigo += morse[resto];
      n /= 10;
    }
    return codigo;
  }
  
/**
 * Esta función convierte el número n a palabras y lo devuelve en una cadena de caracteres
 * 
 * @param n numero entero positivo.
 * @return Devuelve un string del numero que se pasa a palabras.
 */
  public static String convierteEnPalabras(int n) {
    String [] palabras = {" cero,", " uno,", " dos,", " tres,", " cuatro,", " cinco,", " seis,", " siete,", " ocho,", " nueve,"};
    String codigo = "";
    int resto = 0;
    n = Varios.pegaPorDetras(n, 8);
    n = Varios.volteado(n);
    while (n >= 10) {
      resto = (int)n % 10;
      codigo += palabras[resto];
      n /= 10;
    }
    return codigo;
  }
  
/**
 * Esta función dice si un digito se encuentra en un número
 * 
 * @param numero numero entero positivo.
 * @return Devuelve true o false si el digito se encuentra o no en el numero.
 */
  public static boolean contieneDigito(int numero, int digito) {
    return posicionDeDigito(numero, digito) >= 0;
  }
}
