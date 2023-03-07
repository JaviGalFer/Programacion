/**
* Clase Mamífero extendida de la clase animal
* @author Fco Javier Gallego Fernández
*/
public class Mamifero extends Animal {
    //Creamos la clase Animal con los atributos heredados
    public Mamifero(String nombre, int edad, Sexo sexo){
        super(nombre, edad, sexo);
    }
    //Aplicamos diferentes funciones para la clase mamífero
    public void amamanta(){
        if (this.getSexo() == Sexo.MACHO){
            System.out.println ("Soy macho, no puedo amamantar");
        } else {
            System.out.println("Toma leshe");
        }
    }

    public void cuidaCrias(){
        System.out.println("Estoy cuidando de mis crias, deame tranqui");
    }
    //Modificamos con el @Override las funciones heredadas para la clase Mamífero
    @Override
    public void mover(){
        System.out.println("Mira cómo corro ompaeeee");
    }

    @Override
    public void emitirSonido(){
        System.out.println("*Emite un sonido*");
    }

}

