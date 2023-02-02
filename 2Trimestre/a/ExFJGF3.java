import java.util.Scanner;
/** 
 * @author Francisco Javier Gallego Fernández
 * 26/01/2023
 * Turno: Tarde
 */
public class ExFJGF3 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    //Se inicializa variables
    int t = 6; //Variable tamaño
    int j;
    int i;
    int f = 10; //Variable filas
    int c = 5;  //Variable columnas
    int boleto[][] = new int[f][c];
    int aux = 1;
    int apuesta[] = new int[t];
    int cont = 0;
    int p = 0;
    
    System.out.println("Boleto Primitiva");
    System.out.println();
    //Se muestra el array generado
    for (i = 0; i < f; i++) {
      for (j = 0; j < c; j++) {
        boleto[i][j] = aux;
        System.out.printf ("%3d ", boleto[i][j]);
        aux++;
      }
      System.out.println();
    }
    //Se muestra las apuestas
    System.out.println();
    System.out.print ("Apuesta: ");
    for (i = 0; i < t; i++){
      apuesta[i] = (int)(Math.random() * 50) +1;
      System.out.printf (apuesta[i] + " ");
     }
    System.out.println();
    //Se muestra el array con las apuestas destacadas
    System.out.println("Boleto apuesta: ");
    System.out.println();
    for (i = 0; i < f; i++) {
      for (j = 0; j < c; j++) {
        boolean esApuesta = false;
        for (p = 0; p < 6; p++){
          if (boleto[i][j] == apuesta[p]){
            esApuesta = true;
            break;
          }
        }
        if (esApuesta) {
          System.out.printf(" *%3d* ", boleto[i][j]);
        } else {
          System.out.printf(" %3d ", boleto[i][j]);
        }
      }
      System.out.println();
    }
  }
}

  
