import java.util.Scanner;
/**
* Clase main para probar los diferentes métodos
* @author Fco Javier Gallego Fernández
*/
public class NumError {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maximo = Integer.MIN_VALUE;
        
        for (int contador = 1; contador <= 6; contador++) {
            System.out.print("Introduce el número " + contador + ": ");
            try {
                int numero = s.nextInt();
                if(numero > maximo) {
                    maximo = numero;
                }
            } catch (Exception e) {
                System.out.println("Debe introducir un número entero. Intente de nuevo.");
                s.next();
                contador--;
            }
        }
        System.out.println("El número máximo es: " + maximo);
        s.close();
    }
}
