/*
 * Ejercicios 1-14
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
 * es capicúa y falso en caso contrario.
 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
 * es primo y falso en caso contrario.
 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que
 * se pasa como parámetro.
 * 4. potencia: Dada una base y un exponente devuelve la potencia.
 * 5. digitos: Cuenta el número de dígitos de un número entero.
 * 6. voltea: Le da la vuelta a un número.
 * 7. digitoN: Devuelve el dígito que está en la posición n de un número
 * entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
 * derecha).
 * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
 * izquierda).
 * 11. pegaPorDetras: Añade un dígito a un número por detrás.
 * 12. pegaPorDelante: Añade un dígito a un número por delante.
 * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
 * dentro de un número y devuelve el trozo correspondiente.
 * 14. juntaNumeros: Pega dos números para formar uno.
 */

package ejercicios.tema8;


import java.util.Scanner;

import static ejercicios.tema8.matematicas.Varios.digitos;
import static ejercicios.tema8.matematicas.Varios.digitoN;
import static ejercicios.tema8.matematicas.Varios.esCapicua;
import static ejercicios.tema8.matematicas.Varios.esPrimo;
import static ejercicios.tema8.matematicas.Varios.juntaNumeros;
import static ejercicios.tema8.matematicas.Varios.pegaPorDelante;
import static ejercicios.tema8.matematicas.Varios.pegaPorDetras;
import static ejercicios.tema8.matematicas.Varios.posicionDeDigito;
import static ejercicios.tema8.matematicas.Varios.potencia;
import static ejercicios.tema8.matematicas.Varios.quitaPorDelante;
import static ejercicios.tema8.matematicas.Varios.quitaPorDetras;
import static ejercicios.tema8.matematicas.Varios.siguientePrimo;
import static ejercicios.tema8.matematicas.Varios.trozoDeNumero;
import static ejercicios.tema8.matematicas.Varios.volteado;

public class Ejercicios1a14 {

    public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
      
      //6. voltea: Le da la vuelta a un número.
      System.out.print("Introduce un número entero positivo: ");
      int numeroIntroducido = Integer.parseInt(s.nextLine());
      System.out.println();
      System.out.print("El número introducido del revés es: ");
      System.out.println(volteado(numeroIntroducido));
      System.out.println();
    
      //1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
      System.out.print("¿Es el número capicúa? ");
      System.out.println(esCapicua(numeroIntroducido));
      System.out.println();
      
      //2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
      System.out.print("¿Es el número primo? ");
      System.out.println(esPrimo(numeroIntroducido));
      System.out.println();
      
      //3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
      System.out.print("El siguiente número primo al introducido es:  ");
      System.out.println(siguientePrimo(numeroIntroducido));
      System.out.println();
      
      //4. potencia: Dada una base y un exponente devuelve la potencia.
      System.out.print("Introduzca un número que sirva como exponente al primer número introducido, para calcular su potencia: ");
      int exponente = Integer.parseInt(s.nextLine());
      System.out.println(potencia(numeroIntroducido, exponente));
      System.out.println();
      
      //5. digitos: Cuenta el número de dígitos de un número entero.
      System.out.println("El número introducido tiene " + digitos(numeroIntroducido) + " digito/s.");
      System.out.println();
      
      //7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
      //Se empieza contando por el 0 y de izquierda a derecha.
      System.out.print("Introduzca la posición del dígito que desea extraer del número anteriormente introducido: ");
      int posicion = Integer.parseInt(s.nextLine());
      System.out.println("El dígito de la posición elegida es: " + digitoN(numeroIntroducido, posicion));
      System.out.println();
      
      //8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
      //dentro de un número entero. Si no se encuentra, devuelve -1.
      System.out.print("Introduzca el dígito del que desea mostrar la posición en el número anteriormente introducido: ");
      int digito = Integer.parseInt(s.nextLine());
      System.out.println("La posición del dígito elegido es: " + posicionDeDigito(numeroIntroducido, digito));
      System.out.println();
      
      //9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
      System.out.print("Introduzca el número de dígitos que desea quitarle (por la derecha) al número anteriormente introducido: ");
      int quitaDetras = Integer.parseInt(s.nextLine());
      System.out.println("Le ha quitado " + quitaDetras + " dígitos al número " + numeroIntroducido + " y el número que le queda es: " + quitaPorDetras(numeroIntroducido, quitaDetras));
      System.out.println();
      
      //10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
      System.out.print("Introduzca el número de dígitos que desea quitarle (por la izquierda) al número anteriormente introducido: ");
      int quitaDelante = Integer.parseInt(s.nextLine());
      System.out.println("Le ha quitado " + quitaDelante + " dígitos al número " + numeroIntroducido + " y el número que le queda es: " + quitaPorDelante(numeroIntroducido, quitaDelante));
      System.out.println();
      
      //11. pegaPorDetras: Añade un dígito a un número por detrás(por la derecha).
      System.out.print("Introduzca el dígito que desea pegarle por detrás (por la derecha) al número anteriormente introducido: ");
      int pegaDetras = Integer.parseInt(s.nextLine());
      System.out.println("Ha añadido el dígito " + pegaDetras + " al número " + numeroIntroducido + " y el número que le queda es: " + pegaPorDetras(numeroIntroducido, pegaDetras));
      System.out.println();
      
      //12. pegaPorDelante: Añade un dígito a un número por delante.
      System.out.print("Introduzca el dígito que desea pegarle por delante (por la izquierda) al número anteriormente introducido: ");
      int pegaDelante = Integer.parseInt(s.nextLine());
      System.out.println("Ha añadido el dígito " + pegaDelante + " al número " + numeroIntroducido + " y el número que le queda es: " + pegaPorDelante(numeroIntroducido, pegaDelante));
      System.out.println();
      
      //13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número
      //y devuelve el trozo correspondiente.
      System.out.print("Introduzca el inicio del trozo del número: ");
      int inicioTrozo = Integer.parseInt(s.nextLine());
      System.out.print("Introduzca el final del trozo del número: ");
      int finTrozo = Integer.parseInt(s.nextLine());
      System.out.println("Al número " + numeroIntroducido + " le has cogido el trozo que va desde la posición " + inicioTrozo + " a la posición " + finTrozo + " quedando el número: " + trozoDeNumero(numeroIntroducido, inicioTrozo, finTrozo));
      System.out.println();
      
      //14. juntaNumeros: Pega dos números para formar uno.
      System.out.print("Introduzca el número que desea juntar al número anteriormente introducido: ");
      int pegaNumero = Integer.parseInt(s.nextLine());
      System.out.println("Si cogemos el primer número introducido " + numeroIntroducido + " y el segundo número introducido " + pegaNumero + " y los juntamos nos queda: " + juntaNumeros(numeroIntroducido, pegaNumero));
      System.out.println();
    } 
}
