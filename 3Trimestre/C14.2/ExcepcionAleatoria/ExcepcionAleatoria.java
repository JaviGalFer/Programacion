import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
* 
* @author Fco Javier Gallego Fernández
*/
public class ExcepcionAleatoria {
    public static void main(String[] args) {
        Exception[] excepciones = 
        {
            new NumberFormatException(),
            new IOException(),
            new FileNotFoundException(),
            new IndexOutOfBoundsException(),
            new ArithmeticException()
        };

        try {
            throw excepciones[(int)(Math.random() * excepciones.length)];
        } catch (Exception e) {
            System.out.println (e.getClass());          //Muestra error de la clase
            System.out.println (e.getMessage());        //Muestra un mensaje más concreto de dónde ha estado el error
        }

    }
}
