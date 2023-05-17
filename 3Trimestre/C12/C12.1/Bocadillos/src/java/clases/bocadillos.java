/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.util.Random;
/**
 *
 * @author Javier
 */
public class bocadillos {
    private String nombre;
private String imagen;
private String bocadillo;

public bocadillos(String nombre, String imagen, String bocadillo) {
this.nombre = nombre;
this.imagen = imagen;
this.bocadillo = bocadillo;
}

public String getNombre() {
return nombre;
}

public String getImagen() {
return imagen;
}

public String getBocadillo() {
return bocadillo;
}

public String toString() {
return "<div class='accionpersonaje'><img src='" + imagen + "' width='80'><div class='arrow_box'>" + bocadillo + "</div></div>";
}

public String generarDialogo() {
    String[] dialogos = {
    "Hola, ¿cómo estás?",
    "¡Qué día tan bonito!",
    "¿Has visto la última película de Marvel?",
    "¿Te gustan los animales?",
    "¡Qué rico está este bocadillo!",
    "¡Me encanta viajar!",
    "¿Qué planes tienes para el fin de semana?",
    "¡Qué bien nos lo estamos pasando!"
    };
    int indice = new Random().nextInt(dialogos.length);
    return dialogos[indice];
}

}
