/*
 * Tema 9, Ejercicio 3
 * 
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 * 
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio3;

public class Ejercicio3 {

  public static void main(String[] args) {
    System.out.println("Mamiferos\n");
    // gatos //////////////////////////////
    System.out.println("Gatos\n");
    Gato garfield = new Gato(Sexo.MACHO);
    Gato lisa = new Gato(Sexo.HEMBRA);
    Gato silvestre = new Gato();
    
    System.out.println(garfield);
    System.out.println(lisa);
    System.out.println(silvestre);
    
    silvestre.come();
    lisa.juega();
    garfield.seLava();
    silvestre.maulla();
    lisa.amamanta();
    lisa.bebe();
    lisa.daALuz();
    lisa.duerme();
    lisa.protegeCrias();
    System.out.println();
    // perro ////////////////////////////////////////
    System.out.println("Perro\n");
    Perro pepe = new Perro();
    
    pepe.come();
    pepe.ladra();
    pepe.aulla();
    pepe.atrapaFrisbi();
    pepe.amamanta();
    pepe.bebe();
    pepe.daALuz();
    pepe.duerme();
    pepe.protegeCrias();
    System.out.println();
    // lagarto /////////////////////////////////////
    System.out.println("Lagarto\n");
    Lagarto juancho = new Lagarto();
    
    juancho.come();
    juancho.poneHuevos();
    juancho.tomaSol();
    juancho.sacaLengua();
    juancho.bebe();
    juancho.duerme();
    System.out.println();
    //aves //////////////////////////////////////////
    System.out.println("Aves\n");
    System.out.println("Pinguino\n");
    Pinguino pingu = new Pinguino(Sexo.HEMBRA);
    
    pingu.grazna();
    pingu.vuela();
    pingu.baila();
    pingu.alimentaCrias();
    pingu.bebe();
    pingu.come();
    pingu.duerme();
    pingu.poneHuevos();
    System.out.println();
    Canario piolin = new Canario();
    System.out.println("Canario\n");
    piolin.come();
    piolin.poneHuevos();
    piolin.vuela();
    piolin.alimentaCrias();
    piolin.seMojaCara();
    piolin.bebe();
    piolin.canta();
    piolin.duerme();
    piolin.seColumpia();

  }
}
