/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clases.contactos.modelo.vista;

import ec.edu.ups.clases.contactos.modelo.Contacto;
import ec.edu.ups.clases.contactos.modelo.Nodo;

/**
 *
 * @author HP
 */
public class arbolContactos {
    private Nodo raiz;

    public arbolContactos() {
        this.raiz = null;
    }
    public void insert(Contacto newContacto){
        if(raiz==null){
            raiz = new Nodo(newContacto);
        }else{
            insertRecursivo(raiz, newContacto);
        }
    }
    private void insertRecursivo(Nodo nodo, Contacto newContacto){
        
        if(newContacto.getNombre().compareTo(nodo.getContacto().getNombre()) < 0){
            if(nodo.getLeft() == null){
                nodo.setLeft(new Nodo(newContacto));
            }else{
                insertRecursivo(nodo.getLeft(), newContacto);
            }
        }else if(newContacto.getNombre().compareTo(nodo.getContacto().getNombre()) > 0){
            if(nodo.getRight() == null){
                nodo.setRight(new Nodo(newContacto));
            }else{
                insertRecursivo(nodo.getRight(), newContacto);
            }
        }else{
            /// si el nombre del contacto nuevo es iguial a uno que ya existe 
            
        }
    }
    public boolean estaEquilibrado(){
        return verificarBalance(raiz);
    }
    private boolean verificarBalance(Nodo nodo){
        if(nodo == null){
            return true; //arbol vacio se condidera equilibrado
        }
        int alturaIzquierda = obtenerAltura(nodo.getLeft());
        int alturaDerecha = obtenerAltura(nodo.getRight());
        int diferencia = Math.abs(alturaIzquierda - alturaDerecha);
        //verificamos nuestras alturas
        if(diferencia > 1){
            return false;
        }        
        
        return verificarBalance(nodo.getLeft())&& verificarBalance(nodo.getRight());
    }
    private int obtenerAltura(Nodo nodo){
        if(nodo == null){
            return 0;
        }
        int alturaIzquierda = obtenerAltura(nodo.getLeft());
        int alturaDerecha = obtenerAltura(nodo.getRight());
        return Math.max(alturaIzquierda, alturaDerecha)+1;
    }
}
