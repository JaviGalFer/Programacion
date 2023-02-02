import java.util.Scanner;

/**
* En este programa mezcla los numeros pares e impares de ambos numeros introducidos
* @author Fco Javier Gallego Fernández
*/

public class MezclaNumeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print ("Introduce un numero: ");
    long numIntro1 = s.nextLong();
    
    System.out.print ("Introduce otro numero: ");
    long numIntro2 = s.nextLong();
    
    long numero = numIntro1;
    long volteado1 = 0;
    int longitud = 0;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado1 = (volteado1 * 10) + (numero % 10);
      numero /= 10;
      longitud ++;
    }
    
    numero = numIntro2;
    long volteado2 = 0;
    
    while (numero > 0) {
      volteado2 = (volteado2 * 10) + (numero % 10);
      numero /= 10;
    }
    
    long resultadoPares = 0;
    long resultadoImpares = 0;
    int digito;
    
    for (int i = 0; i < longitud; i++) {
      digito = (int)(volteado1 % 10);
      
      if ((digito % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito;
      }
      
      digito = (int)(volteado2 % 10);
      
      if ((digito % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito;
      }
      
      volteado1 /= 10;
      volteado2 /= 10;
    }
    
    System.out.println("El numero formado por los digitos pares es: " + resultadoPares);
    System.out.println("El numero formado por los digitos impares es: " +resultadoImpares);
    
 }
}
