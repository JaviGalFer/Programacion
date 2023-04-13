import java.util.Scanner;

/**Recibe tres notas y realiza la nota media, diciendo después mediante un if la calificación (Insuficiente, Suficiente, Bien, Notable o Sobresaliente)
 *@author Fco Javier Gallego Fernández
 */
 
 public class BoletinNotas {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    System.out.println ("Este programa calcula la media de tres notas que insertes.");
    //Recibe las notas mediante el Scanner y lo almacena en su correspondiente variable
    System.out.println ("Por favor, introduzca la primera nota: ");
    Double nota1 = s.nextDouble();
    
    System.out.println ("Por favor, introduzca la segunda nota: ");
    Double nota2 = s.nextDouble();
    
    System.out.println ("Por favor, introduzca la tercera nota: ");
    Double nota3 = s.nextDouble();
    
    Double media = (nota1 + nota2 + nota3) / 3;
    
    System.out.printf ("La media es %.2f\n", media);
    
    //Mediante el if compara la variable "media" para mostrar dicho mensaje
    if (media < 5){
      System.out.print ("Insuficiente");
    }
    
    if ((media >= 5) && (media < 6)){
      System.out.print ("Suficiente");
    }
    
    if ((media >= 6) && (media < 7)) {
      System.out.print ("Bien");
    }
    
    if ((media >= 7) && (media < 9)) {
      System.out.print ("Notable");
    }
    
    if (media >= 9) {
      System.out.print ("Sobresaliente");
    }
  
  }
}
