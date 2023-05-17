/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1;
/* Gato.java (proyecto GatosConClaseYBocadillos) */
/**
 *
 * @author Javier
 */
public class Gato {
  private String nombre;
  private String imagen;
  
  public Gato(String nombre, String imagen) {
  this.nombre = nombre;
  this.imagen = imagen;
  }
  public String getNombre() {
  return nombre;
  }
  public String getImagen() {
  return imagen;
  }
  @Override
    public String toString() {
    return "<div class='acciongato'><img src='" + imagen + "' width='80'><div class='arrow_box'> Hola, soy " + nombre + " y este es mi reino </div></div>";
  }
  
  public String maulla() {
  return "<div class='acciongato'><img src='" + imagen + "' width='80'><div class='arrow_box'>&nbsp;Miauuuuuuuu (pero en dramático que soy)&nbsp;</div></div>";
  }
 
  public String come(String comida) {
  return "<div class='acciongato'><img src='" + imagen + "' width='80'><div class='arrow_box'>&nbsp;Dónde está mi pienso? Qué ajco de " + comida + "&nbsp;</div></div>";
  }

  
}
