/**
* Clase Ave que es extendida de la clase Animal por lo que 
* hereda atributos y funciones
* @author Fco Javier Gallego Fernández
*/
public class Ave extends Animal {
    //Creamos la clase Ave con los atributos
    public Ave(String nombre, int edad, Sexo sexo){
        super(nombre, edad, sexo); //Utilzamos "super" para decirle que son heredados
    }
    //Aplicamos la clase sexo
    public Ave() {
        super(Sexo.HEMBRA);
    }

    public Ave(Sexo s){
        super(s);
    }
    //Creamos métodos por defecto para la instancia Ave que se van a heredar
    public void ponHuevo() {
        if (this.getSexo() == Sexo.MACHO) {
            System.out.println ("Que soy un macho empanao");
        } else {
            System.out.println ("*plop* toma huevaso");
        }
    }

    public void limpiate() {
        System.out.println ("illo no me mire que me estoy acicalando");
    }

    public void vuela() {
        System.out.println ("Mira como vuelo uuuuuuuuuuuaaa");
    }

    @Override                   //Utilizamos @override para decirle que es una métodos heredada
    public void mover(){
        System.out.println("Mira cómo vueeelooo");
    }

    @Override
    public void emitirSonido(){
        System.out.println("*Emite un sonido*");
    }

}

