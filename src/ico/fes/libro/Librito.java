/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.libro;

import ico.fes.composición.Autor;
import ico.fes.composición.Editorial;


/**
 *
 * @author danie
 */
public class Librito {
    String título;
    Autor escritor;
    Editorial editor;

    public Librito() {
    }

    public Librito(String título, Autor escritor, Editorial editor) {
        this.título = título;
        this.escritor = escritor;
        this.editor = editor;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public Editorial getEditor() {
        return editor;
    }

    public void setEditor(Editorial editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Librito{" + "t\u00edtulo=" + título + ", escritor=" + escritor + ", editor=" + editor + '}';
    }

    public class set {

        public set() {
        }
    }
    
}
