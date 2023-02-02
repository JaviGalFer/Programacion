import java.util.Scanner;

/**
* Programa que pide 8 palabras y las almacena en un array.
* Las palabras correspondientes a un color se almacenan al comienzo
* y las que no son colores a continuación
* @author Fco Javier Gallego Fernández
*/

public class arrayColores {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int t = 8; //VARIABLE PARA ARRAY
    String[] palabra = new String[t];
    String[] colores = { "verde", "rojo", "azul", "amarillo", "rosa",
      "negro", "blanco", "morado"};
    String[] resultado = new String[t];
    int i;
    int j = 0;
    
    for (i = 0; i < t; i++) {
      System.out.println ("Introduzca la palabra del array \"" + i + "\" y pulse INTRO: ");
      palabra[i] = s.nextLine();
      
      for (String c : colores){
        if (palabra[i].equals(c)) {
          resultado[j++] = c;
        }
      }
    }
    
    for (i = 0; i < t; i++) {
      boolean esColores = false;
      
      for (String c : colores) {
        if (palabra[i].equals(c)){
          esColores = true;
        }
      }
      
      if(!esColores) {
        resultado[j++] = palabra[i];
      }
    }
    //Muestra el array original
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (i = 0; i < t; i++) {
      System.out.printf("│    %d   ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
    
    for (String p : palabra) {
      System.out.printf("|%-8s", p);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    
    //Muestra el array resultado
    System.out.println("\n\nArray resultado:");
    System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (i = 0; i < t; i++) {
      System.out.printf("│    %d   ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
    
    for (String r : resultado) {
      System.out.printf("|%-8s", r);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    
 }
}
