import java.util.Scanner;

/**
* En este programa se utiliza el bucle do-while y el bucle for para mostrar por pantalla los números
* comprendidos entre el primer y segundo número de 7 en 7, mostrandolo por pantalla de menor a mayor.
* @author Fco Javier Gallego Fernández
*/

public class ComprendidosEntreDos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Se declaran variables
    
    int num2 = 0;
    
    System.out.println("Introduce el primer numero: ");
    int num = s.nextInt();
    
    do {
      System.out.print ("Introduce el segundo numero: ");
      num2 = s.nextInt();
    if (num2 == num) {
      System.out.println ("Debe introducir un numero diferente.");
    }
    
    }while (num2 == num);
    
    if (num > num2) {
      int aux = num;
      num = num2;
      num2 = aux;
    }
    
    System.out.println ("Los numeros comprendidos entre " +num+ " y "+num2+ " son: ");
    //Con el bucle for hacemos la suma de los 100 números siguientes al número introducido
    for (int i = num; i < num2; i = i + 7) {
      System.out.println (i);
      
    }
        
  }
}
