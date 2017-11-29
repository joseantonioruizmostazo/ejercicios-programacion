/**
 * Tema 6, ejercicio 21
 * 
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 * 
 * Ejemplo:
 * 
 * 2 céntimos - cara
 * 20 céntimos - cruz
 * 50 céntimos - cruz
 * 1 euro - cruz
 * 2 euros - cara
 * 
 * @author José Ruiz
 */


public class Ejercicio21 {
  public static void main(String[] args) {
    
    int moneda;
    int caraCruz;
    String tipoMoneda = "";
    
    System.out.print("A continuación se mostrará el lanzamiento al aire de 5 monedas\n");
    System.out.println("las monedas disponibles son 1 cnt, 2cnt, 5 cnt, 10 cnt, 20 cnt, 50 cnt, 1 € y 2 €.\n");
    
    for (int i = 1; i <= 5; i++) {
      
      caraCruz = ((int)(Math.random() * 2) + 1);
      moneda = ((int)(Math.random() * 8) + 1);   

      switch(moneda) {
        case 1:
          tipoMoneda = "1 céntimo";
          break;
        case 2:
          tipoMoneda = "2 céntimos";
          break;
        case 3:
          tipoMoneda = "5 céntimos";
          break;
        case 4:
          tipoMoneda = "20 céntimos";
          break;
        case 5:
          tipoMoneda = "50 céntimos";
          break;
        case 6:
          tipoMoneda = "1 euro";
          break;
        case 7:
          tipoMoneda = "2 euros";
          break;
        case 8:
          tipoMoneda = "10 céntimos";
          break;
        default:
      }

      switch(caraCruz) {
        case 1:
          tipoMoneda += " - cara";
          break;
        case 2:
          tipoMoneda += " - cruz";
          break;
        default:
      }
      System.out.println(tipoMoneda);
    }
  }
}
