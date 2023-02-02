import java.util.Scanner;

/**Recibe la nota del primer examen, pregunta qué nota quieres sacar en el trimestre y te dice cuánta nota quieres sacar en el segundo examen.
 *@author Fco Javier Gallego Fernández
 */
 
 public class notas { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //*Aquí pregubnta la nota, creando una variable
    System.out.print ("Introduzca la nota del primer examen: ");
    double nota1 = s.nextDouble();
    
    System.out.print ("¿Que nota quiere sacar en el trimestre? ");
    double notaFinal = s.nextDouble();
    
    //*Aquí se realiza un calculo de la nota en la nueva variable
    double nota2 = ((notaFinal * 100) - (nota1 * 40)) /60;
    
    System.out.println ("Para tener un " + notaFinal + " en el trimestre");
    System.out.println (" necesita sacar un " + nota2 + " en el segundo examen.2");
    
    
  }
}
