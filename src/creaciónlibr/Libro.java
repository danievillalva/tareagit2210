/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creaciónlibr;

import ico.fes.composición.Autor;
import ico.fes.composición.Editorial;
import ico.fes.libro.Librito;

/**
 *
 * @author danie
 */
public class Libro {

    public static void main(String[] args) {
        Librito lib = new Librito();
        lib.setTítulo("Ladrona de libros");
        lib.setEscritor(new Autor("Markus Zusak", 2005));
        lib.setEditor(new Editorial("Porrúa","Páginas: 544"));
        
        System.out.println(lib);
        
        // TODO code application logic here
    }
    
}
