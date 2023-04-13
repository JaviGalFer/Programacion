import java.util.Scanner;
/**
* Dice cuales son pares, muestra en orden y suma todos
* @author Fco Javier Gallego Fernández
*/
public class ParesOrdenados {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print ("Introduce un numero entero positivo: ");
    long numIntro = s.nextLong();
    long numero = numIntro;
    long volteado = 0;
    int longitud = 0;
    if (numero == 0) {
      longitud = 1;
    }
    //le da la vuelta al numero y calcula longi
    while (numero > 0){
      volteado = (volteado * 10) + (numero%10);
      numero /= 10;
      longitud++;
    }
    //Muestra digitos pares
    System.out.print("Digitos pares: ");
    int digito;
    int sumaPares = 0;
    for (int i = 0; i < longitud; i++){
      digito = (int)(volteado % 10);
      if ((digito%2) == 0){
        System.out.print (digito + " ");
        sumaPares += digito;
      }
      volteado /= 10;
    }
    //Muestra suma Pares
    System.out.println("\nSuma de los digitos pares: "+ sumaPares);   
  }
}
