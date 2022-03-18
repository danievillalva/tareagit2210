/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composición;

/**
 *
 * @author danie
 */
public class Autor {
    String nombre;
    int año; //año de publicación

    public Autor() {
    }

    public Autor(String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", a\u00f1o=" + año + '}';
    }
    

  
    
    
}
