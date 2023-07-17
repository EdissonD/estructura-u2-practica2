/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.clases.contactos;

import ec.edu.ups.clases.contactos.modelo.Contacto;
import ec.edu.ups.clases.contactos.modelo.vista.arbolContactos;

/**
 *
 * @author HP
 */
public class Contactos {

    public static void main(String[] args) {
        arbolContactos arbol  = new arbolContactos();
        Contacto c1 = new Contacto("juan", "1234567");
        Contacto c2 = new Contacto("maria", "1234567");
        Contacto c3 = new Contacto("pedro", "1234567");
        Contacto c4 = new Contacto("juanitooo", "1234567");
        
        arbol.insert(c1);
        arbol.insert(c2);
        arbol.insert(c3);
        arbol.insert(c4);
        arbol.insert(new Contacto("julian", "1234567"));
        arbol.insert(new Contacto("jhon", "1234567"));
        
    }
}
