/**
* Clase Lagarto extendida de la clase Animal
* @author Fco Javier Gallego Fernández
*/
public class Lagarto extends Animal {
    //Creamos el objeto con sus atributos
    public Lagarto(String nombre, int edad, Sexo sexo){
        super(nombre, edad, sexo);                          //Utilizamos super para decir que es heredado
    }

    public Lagarto(){}

    public Lagarto(Sexo s){
        super(s);
    }
    //Aplicamos diferentes funciones
    public void tomaElSol(){
        System.out.println("illo no vea como pega er so");
    }

    public void duchate(){
        System.out.println("eennove que fresquita");
    }

    public void escondete(){
        System.out.println("Me ve ahora no me ve");
    }

    public void sexo(){
        System.out.println(getSexo());
    }

    //@Override para modificar métodos heredados
    @Override
    public void come(String comida) {
        if (comida.equals("insecto")) {
            System.out.println("Que weno dame ma no sea rata");
        } else {
            System.out.println("Esta mierda me vas a dar?");
        }
    }

    @Override
    public void emitirSonido(){
        System.out.println("*Sonido particular de Lagarto*");
    }

    @Override
    public void mover(){
        System.out.println("Mira como me muevo de agil por la pare ompae");
    }

    @Override
    public void pelear(Animal otroAnimal){
        if(otroAnimal instanceof Lagarto){
            System.out.println("illo ven que este es mi barrio");
        } else {
            super.pelear(otroAnimal);
        }
    }

}
