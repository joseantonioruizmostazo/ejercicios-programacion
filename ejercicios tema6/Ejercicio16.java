/**
 * Tema 6, ejercicio 16
 * 
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * 
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * 
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
 * ha perdido”.
 * 
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * 
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 * 
 * Ejemplo 1:
 * diamante diamante limón
 * Bien, ha recuperado su moneda
 * 
 * Ejemplo 2:
 * herradura campana diamante
 * Lo siento, ha perdido
 * 
 * Ejemplo 3:
 * corazón corazón corazón
 * Enhorabuena, ha ganado 10 monedas
 * 
 * @author José Ruiz
 */


public class Ejercicio16 {
  public static void main(String[] args) {
    
    System.out.println("A continuación se simulará la tirada de una tragaperras\n");
    
    int tiradas = 3;
    
    do {

      int tiradaUno = ((int)(Math.random() * 5) + 1);
      int tiradaDos = ((int)(Math.random() * 5) + 1);
      int tiradaTres = ((int)(Math.random() * 5) + 1);
      
      String figuraUno = "";
      String figuraDos = "";
      String figuraTres = "";
      
      switch(tiradaUno) {
        case 1:
          figuraUno = "Limón";
          break;
        case 2:
          figuraUno = "Corazón";
          break;
        case 3:
          figuraUno = "Herradura";
          break;
        case 4:
          figuraUno = "Diamante";
          break;
        case 5:
          figuraUno = "Campana";
          break;
        default:
      }
      switch(tiradaDos) {
        case 1:
          figuraDos = "Limón";
          break;
        case 2:
          figuraDos = "Corazón";
          break;
        case 3:
          figuraDos = "Herradura";
          break;
        case 4:
          figuraDos = "Diamante";
          break;
        case 5:
          figuraDos = "Campana";
          break;
        default:
      }
      switch(tiradaTres) {
        case 1:
          figuraTres = "Limón";
          break;
        case 2:
          figuraTres = "Corazón";
          break;
        case 3:
          figuraTres = "Herradura";
          break;
        case 4:
          figuraTres = "Diamante";
          break;
        case 5:
          figuraTres = "Campana";
          break;
        default:
      }
      tiradas -= 3;
      System.out.print(figuraUno + " " + figuraDos + " " + figuraTres + "\n");
      
      if ((figuraUno.equals(figuraDos)) && (figuraUno.equals(figuraTres))) {
        System.out.println("Enhorabuena, ha ganado 10 monedas");
      }
      if ((figuraUno.equals(figuraDos)) && (!figuraUno.equals(figuraTres))) {
        System.out.println("Bien, ha recuperado una moneda");
      }
      if ((!figuraUno.equals(figuraDos)) && (figuraUno.equals(figuraTres))) {
        System.out.println("Bien, ha recuperado una moneda");
      }
      if ((figuraDos.equals(figuraTres)) && (!figuraDos.equals(figuraUno))) {
        System.out.println("Bien, ha recuperado una moneda");
      }
      if ((!figuraUno.equals(figuraDos)) && (!figuraUno.equals(figuraTres)) && (!figuraDos.equals(figuraTres))) {
        System.out.println("Lo siento, ha perdido");
      }
    } while (tiradas != 0);
    
  }
}
