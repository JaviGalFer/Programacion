import java.util.Scanner;
/*
 * @author Fco Javier Gallego Fernández
 */
public class Prueba {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENÚ:");
            System.out.println("1. Mostrar lista de animales");
            System.out.println("2. Mostrar datos de un animal concreto");
            System.out.println("3. Mostrar datos de todos los animales");
            System.out.println("4. Insertar un nuevo animal");
            System.out.println("5. Salir");

            opcion = Integer.parseInt(System.console().readLine());
            //sc.nextLine(); // para consumir el salto de línea después del entero

            switch (opcion) {
                case 1:
                    inventario.mostrarListaAnimales();
                    break;

                case 2:
                    System.out.println("Introduce el nombre del animal:");
                    String nombreAnimal = sc.nextLine();
                    inventario.mostrarDatosAnimal(nombreAnimal);
                    break;

                case 3:
                    inventario.mostrarDatosAnimales();
                    break;

                case 4:
                    inventario.insertarAnimal();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}

