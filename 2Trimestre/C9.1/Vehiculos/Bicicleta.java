/**
* Clase Bicicleta extendida de la clase Vehículo
* @author Fco Javier Gallego Fernández
*/
public class Bicicleta extends Vehiculo {
    //Atributo para la clase
    private int pinones;
    //Creamos la clase con sus atributos y herencias
    public Bicicleta(int p){
        super();
        this.pinones = p;
    }
    //Creamos una función para la clase
    public void hazCaballito() {
        System.out.println("Mira cómo hago el caballito burrruuumm");
    }
}
