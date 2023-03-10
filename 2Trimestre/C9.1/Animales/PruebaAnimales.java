/**
 * Programa main que utiliza las diferentes clases de animales creadas
* @author Fco Javier Gallego Fernández
*/
public class PruebaAnimales {
    public static void main(String[] args){
        //Creamos una clase pingüino y llamamos a diferntes funciones
        System.out.println("Vamos a adoptar a un Pingüino!!");
        Pinguino Pepe = new Pinguino("pepe", 2, Sexo.MACHO);
        System.out.println(Pepe.getNombre());
        Pepe.come("Palomitas");
        Pepe.programa();
        
        //Creamos al objeto perro y llamamos a las diferentes funciones
        System.out.println("Vamos a adoptar a un Perro!!");
        Perro Laika = new Perro("Laika", 5, Sexo.HEMBRA, "Golden Retriever");
        System.out.println("Nombre: " + Laika.getNombre());
        System.out.println("Edad: " + Laika.getEdad());
        System.out.println("Sexo: " + Laika.getSexo());
        System.out.println("Raza: " + Laika.getRaza());
        System.out.println(Laika.getNombre() + " vete a dormir");
        Laika.duerme();
        System.out.println(Laika.getNombre() + " dame la patita");
        Laika.dameLaPata();
        System.out.println(Laika.getNombre() + " amamanta a tus cachorros");
        Laika.amamanta();
        System.out.println(Laika.getNombre() + " cuida a tus crías");
        Laika.cuidaCrias();
        System.out.println(Laika.getNombre() + " ladra");
        Laika.ladra();
        System.out.println(Laika.getNombre() + " caza");
        Laika.caza();
        System.out.println(Laika.getNombre() + " peleate!!");
        Laika.pelear(Pepe);
        
        //Creamos a la clase Gato y llamamos a las diferentes funciones
        System.out.println("Vamos a adoptar a un Gato!!");
        Gato Neo = new Gato("Neo", 1, Sexo.MACHO, "Siames");
        System.out.println("Nombre: " + Neo.getNombre());
        System.out.println("Edad: " + Neo.getEdad());
        System.out.println("Sexo: " + Neo.getSexo());
        System.out.println("Raza: " + Neo.getRaza());
        System.out.println(Neo.getNombre() + " a ver cómo ronroneas");
        Neo.ronronea();
        System.out.println(Neo.getNombre() + " vete a dormir");
        Neo.duerme();
        System.out.println(Neo.getNombre() + " toma una latita");
        Neo.come("latita");
        System.out.println(Neo.getNombre() + " a ver cómo te afilas las garras");
        Neo.afilarGarras();
        System.out.println(Neo.getNombre() + " mira una mosca!!!");
        Neo.caza();
        System.out.println(Neo.getNombre() + " atacaaa!!!");
        Neo.pelear(Laika);
        
        //Creamos a la clase Lagarto y llamamos a las diferentes funciones
        System.out.println("Vamos a adoptar a un Lagarto!!");
        Lagarto Godzilla = new Lagarto("Godzilla", 10, Sexo.MACHO);
        System.out.println("Nombre: " + Godzilla.getNombre());
        System.out.println("Edad: " + Godzilla.getEdad());
        System.out.println("Sexo: " + Godzilla.getSexo());
        Godzilla.tomaElSol();
        System.out.println(Godzilla.getNombre() + " vete a dormir");
        Godzilla.duerme();
        System.out.println(Godzilla.getNombre() + " te estoy viendo");
        Godzilla.escondete();
        System.out.println(Godzilla.getNombre() + " voy a por ti!!");
        Godzilla.mover();
        System.out.println(Godzilla.getNombre() + " atacaaa!!!!");
        Godzilla.pelear(Laika);
        
        //Creamos a la clase canario y llamamos a las diferentes funciones
        System.out.println("Vamos a adoptar a un Canario!!");
        Canario Coto = new Canario ("Coto", 2, Sexo.MACHO);
        System.out.println("Nombre: " + Coto.getNombre());
        System.out.println("Edad: " + Coto.getEdad());
        System.out.println("Sexo: " + Coto.getSexo());
        System.out.println(Coto.getNombre() + " a ver cómo cantas");
        Coto.canta();
        System.out.println(Coto.getNombre() + " estás un poco sucio ehhh");
        Coto.limpiate();
        System.out.println(Coto.getNombre() + " peleaaa!!");
        Coto.pelear(Godzilla);

        //Creamos otra clase Pingüino y llamamos a las diferentes funciones
        System.out.println("Vamos a adoptar a otro Pingüino!!");
        Pinguino Kowalski = new Pinguino("kowalski", 4, Sexo.MACHO);
        System.out.println("Nombre: " + Kowalski.getNombre());
        System.out.println("Edad: " + Kowalski.getEdad());
        System.out.println("Sexo: " + Kowalski.getSexo());
        System.out.println(Kowalski.getNombre() + " mueveteeee!");
        Kowalski.mover();
        System.out.println(Kowalski.getNombre() + " a ve que te vea volar");
        Kowalski.vuela();
        System.out.println(Kowalski.getNombre() + " tu sabe programa eun java?");
        Kowalski.programa();
        System.out.println(Kowalski.getNombre() + " nada");
        Kowalski.nada();

    }
}
