import java.util.Scanner;
/**
* Clase main para probar las diferentes funciones
* @author Fco Javier Gallego Fernández
*/
public class PruebaVehiculos {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Declaramos variables
        String opcion = "";
        int opcionNum = 0;
        int km;
        //Creamos las clases
        Bicicleta bmk = new Bicicleta(9);
        Coche golmk1 = new Coche(2100);
        //Creamos un bucle con las diferentes opciones hasta pulsar 8 para salir
        while (opcionNum !=8){
            System.out.println("\n1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");
            //Creamos el if para comprobar que se introduzca un valor número
            opcion = s.nextLine();
            if (Vehiculo.esNumerico(opcion)){
                opcionNum = Integer.parseInt(opcion);
            }else{
                opcionNum = 0;
            }
            //Switch para llamar a las diferentes funciones según el número introducido
            switch (opcionNum) {
                case 1:
                    System.out.print ("¿Cuántos kilómetros quiere recorrer? ");
                    km = s.nextInt();
                    bmk.recorre(km);
                    break;
                case 2:
                    bmk.hazCaballito();
                    break;
                case 3:
                    System.out.print ("¿Cuántos kilómetros quiere recorrer? ");
                    km = s.nextInt();
                    golmk1.recorre(km);
                    break;
                case 4:
                    golmk1.quemaRueda();
                    break;
                case 5:
                    System.out.println ("La bicicleta lleva recorridos " + bmk.getKmRecorridos() + " km");
                    break;
                case 6:
                    System.out.println ("El coche lleva recorridos " +golmk1.getKmRecorridos() + " km");
                    break;
                case 7:
                    System.out.println ("Los vehículos llevan recorridos " + Vehiculo.getKmTotales() + " Km");
                default:
                    System.out.println("Opción no válida");
            }
        }
    s.close();
    }
}
