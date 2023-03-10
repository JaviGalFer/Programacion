/**
* Clase Canario extendido de la clase Ave
* @author Fco Javier Gallego Fernández
*/
public class Canario extends Ave {
    //Creamos el object con sus atributos
    public Canario(String nombre, int edad, Sexo sexo){
        super(nombre, edad, sexo);              //Utilizamos super para decir que son atributos heredados
    }

    public Canario() {}
    
    public Canario(Sexo s){
        super(s);
    }

    //Creamos los diferentes métodos para la clase
    public void canta(){
        System.out.println ("Mio Mio Mio Mio Mio");
    }

    public void caza() {
        System.out.println("Los canarios no cazan");
    }

    public void pia() {
        System.out.println ("Estoy pio pio pio");
    }

    @Override                           //Utilizamos @override para decir que es un método heredada
    public void emitirSonido(){
        System.out.println("Miraa como te canto pio pio pio");
    }

    @Override
    public void mover(){
        System.out.println("Mira como vuelo ompae pillame");
    }
    
}
