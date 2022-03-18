/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composición;

/**
 *
 * @author danie
 */
public class Editorial {
    String nombre;
    String año; //año de publicación

    public Editorial() {
    }

    public Editorial(String nombre, String año) {
        this.nombre = nombre;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", a\u00f1o=" + año + '}';
    }
    

}