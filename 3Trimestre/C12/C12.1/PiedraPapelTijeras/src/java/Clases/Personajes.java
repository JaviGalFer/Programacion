/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.Random;
/**
 *
 * @author Javier
 */
public class Personajes {
private String nombre;
    private String imagen;

    public Personajes(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public String generarJugada() {
        Random random = new Random();
        int jugada = random.nextInt(3);

        switch (jugada) {
            case 0:
                return "Piedra";
            case 1:
                return "Papel";
            case 2:
                return "Tijeras";
            default:
                return "Error";
        }
    }
}
