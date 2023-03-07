/**
* Creamos la clase Pingüino extendida de la clase Ave
* @author Fco Javier Gallego Fernández
*/
public class Pinguino extends Ave {
    //Creamos la clase Pinguino con los atributos heredados
    public Pinguino(String nombre, int edad, Sexo sexo){
        super(nombre, edad, sexo);
    }

    public Pinguino(){}

    public Pinguino(Sexo s){
        super(s);
    }
    //Creamos las diferentes funciones
    public void vuela(){
        System.out.println("Qué te cree que soy illo?");
    }

    public void programa(){
        System.out.println("Dame la cartera que te estas pasando");
    }

    public void nada(){
        System.out.println("Po no hago nada");
    }

    //Modificamos con el @Override las funciones heredadas
    @Override
    public void emitirSonido(){
        System.out.println("*Sonido de Pinguino*");
    }

    @Override
    public void mover(){
        System.out.println("Mira como me muevo sobre el hielo ompaeee");
    }

    @Override
    public void come(String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Que weno dame ma no sea rata");
        } else {
            System.out.println("Esta mierda me vas a dar?");
        }
    }

}
