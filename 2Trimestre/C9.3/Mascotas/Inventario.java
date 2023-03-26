import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Fco Javier Gallego Fernández
 */
public class Inventario {
    private ArrayList<Mascota> inventario; // ArrayList para almacenar las mascotas del inventario

    public Inventario() {
        inventario = new ArrayList<>();
    }

    // Método para mostrar la lista de animales (solo tipo y nombre, 1 línea por animal)
    public void mostrarListaAnimales() {
        System.out.println("Lista de animales en el inventario:");
        for (Mascota mascota : inventario) {
            System.out.println(mascota.getClass().getSimpleName() + ": " + mascota.getNombre());
        }
        System.out.println();
    }

    // Método para mostrar todos los datos de un animal concreto
    public void mostrarDatosAnimal(String nombre) {
        for (Mascota mascota : inventario) {
            if (mascota.getNombre().equals(nombre)) {
                System.out.println(mascota.toString());
                return;
            }
        }
        System.out.println("No se encontró un animal con el nombre " + nombre + " en el inventario.");
    }

    // Método para mostrar todos los datos de todos los animales
    public void mostrarDatosAnimales() {
        System.out.println("Datos de todos los animales en el inventario:");
        for (Mascota mascota : inventario) {
            System.out.println(mascota.toString());
        }
        System.out.println();
    }

    // Método para insertar animales en el inventario
    public void insertarAnimal() {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("¿Qué tipo de animal quieres insertar?");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Loro");
        System.out.println("4. Canario");
    
        int opcion = sc.nextInt();
        sc.nextLine();
    
        switch (opcion) {
            case 1://///////     PERRO     ///////////////////
                System.out.println("Introduce el nombre del perro: ");
                String nombre = System.console().readLine();

                System.out.println("Introduce la edad del perro: ");
                /*int edad = sc.nextInt();
                sc.nextLine();*/
                int edad = Integer.parseInt(System.console().readLine());

                System.out.println("Introduce la raza del perro: ");
                String raza = System.console().readLine();
    
                System.out.println("Introduce el estado del animal (vivo = true, muerto = false):");
                boolean estado = Boolean.parseBoolean(System.console().readLine());
                //sc.nextLine();
                
                System.out.println("Introduce la fecha de nacimiento: ");
                String fechaNacimiento = System.console().readLine();
    
                System.out.println("¿Tiene pulgas? (true o false): ");
                /*boolean pulgas = sc.nextBoolean();
                sc.nextLine();*/
                boolean pulgas = Boolean.parseBoolean(System.console().readLine());
    
                Perro perro = new Perro(nombre, edad, estado, fechaNacimiento, raza, pulgas);
                inventario.add(perro);
                System.out.println("Perro insertado correctamente.");
                break;
    
            case 2://///////////////// GATO ///////////////////

                System.out.println("Introduce el nombre del gato: ");
                nombre = sc.next();

                System.out.println("Introduce la edad del gato: ");
                edad = sc.nextInt();
                sc.nextLine();

                System.out.println("Introduce el estado del animal (vivo = true, muerto = false):");
                estado = sc.nextBoolean();
                sc.nextLine();
                
                System.out.println("Introduce la fecha de nacimiento: ");
                fechaNacimiento = sc.next();
                sc.nextLine();

                System.out.println("Introduce el color del gato:");
                String color = sc.nextLine();

                boolean peloLargo = false;
                /**
                System.out.println("¿Tiene el pelo largo? (true o false):");
                boolean peloLargo = sc.nextBoolean();
                sc.nextLine();
                

                boolean peloLargo = false;
                while (true) {
                    try {
                        System.out.println("¿Tiene el pelo largo? (true o false):");
                        peloLargo = sc.nextBoolean();
                        sc.nextLine(); // limpiar buffer
                        break;
                    } catch (NoSuchElementException e) {
                        System.out.println("Entrada inválida, por favor ingrese un valor válido.");
                        sc.nextLine(); // descarta la entrada inválida
                    }
                }
                */
                Gato gato = new Gato(nombre, edad, estado, fechaNacimiento, color, peloLargo);
                inventario.add(gato);
                System.out.println("Gato insertado correctamente.");
                break;
    
            case 3:///////////  LORO  /////////////////
                System.out.println("Introduce el nombre del loro: ");
                nombre = sc.next();

                System.out.println("Introduce la edad del loro: ");
                edad = sc.nextInt();
                sc.nextLine();

                System.out.println("Introduce el pico del loro: ");
                double pico = sc.nextDouble();
                sc.nextLine();

                System.out.println("¿El loro puede volar? (Puede = true, no puede = false)");
                boolean vuela = sc.nextBoolean();
                sc.nextLine();

                System.out.println("Introduce el estado del animal (vivo = true, muerto = false):");
                estado = sc.nextBoolean();
                sc.nextLine();
                
                System.out.println("Introduce la fecha de nacimiento: ");
                fechaNacimiento = sc.next();
                sc.nextLine();

                System.out.println("Introduce el origen del loro:");
                String origen = sc.nextLine();
    
                System.out.println("¿Habla el loro? (true o false):");
                boolean habla = sc.nextBoolean();
                sc.nextLine();
    
                Loro loro = new Loro(nombre, edad, estado, fechaNacimiento, pico, vuela, origen, habla);
                inventario.add(loro);
                System.out.println("Loro insertado correctamente.");
                break;
    
            case 4:///////////////////  CANARIO   ///////////////////
                
                System.out.println("Introduce el nombre del canario: ");
                nombre = sc.next();
                

                System.out.println("Introduce la edad del canario: ");
                edad = sc.nextInt();
                sc.nextLine();

                System.out.println("Introduce el estado del animal (vivo = true, muerto = false):");
                estado = sc.nextBoolean();
                sc.nextLine();
                
                System.out.println("Introduce la fecha de nacimiento: ");
                fechaNacimiento = sc.next();

                System.out.println("Introduce el pico del loro: ");
                pico = sc.nextDouble();

                System.out.println("¿El canario puede volar? (Puede volar = true, no puede volar = false)");
                vuela = sc.nextBoolean();
                sc.nextLine();

                System.out.println("Introduce el color del canario:");
                String colorCanario = sc.nextLine();
                sc.nextLine();
    
                System.out.println("¿Canta el canario? (true o false):");
                boolean canta = sc.nextBoolean();
                sc.nextLine();
    
                Canario canario = new Canario(nombre, edad, estado, fechaNacimiento, pico, vuela, colorCanario, canta);
                inventario.add(canario);
                System.out.println("Canario insertado correctamente.");
                break;
    
            default:
                System.out.println("Opción incorrecta. No se ha insertado ningún animal.");
                break;
        }
        sc.close();
    }
    

    // Método para eliminar animales del inventario
    public void eliminarAnimal(String nombre) {
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getNombre().equals(nombre)) {
                inventario.remove(i);
                System.out.println("Se eliminó un animal con el nombre " + nombre + " del inventario.");
                return;
            }
        }
        System.out.println("No se encontró un animal con el nombre " + nombre + " en el inventario.");
    }

    // Método para vaciar el inventario
    public void vaciarInventario() {
        inventario.clear();
        System.out.println("Se vació el inventario.");
    }
}
