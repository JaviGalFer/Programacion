/**
* Clase Coche extendida de Vehículo
* @author Fco Javier Gallego Fernández
*/
public class Coche extends Vehiculo {
    //Atributos para la clase
    private int cilindrada; 
    //le decimos sus atributos y herencias
    public Coche(int c){
        super();
        this.cilindrada = c;
    }
    //Creamos una función
    public void quemaRueda(){
        System.out.println("Fiiuussshhhhh");
    }
}
