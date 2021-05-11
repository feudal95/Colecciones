/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.*;

/**
 *
 * @author Mac
 */
public class PruebaLinkedList {

    public static void main(String[] args) {
        LinkedList<String> personas = new LinkedList<String>();
        personas.add("PEPE");
        personas.add("Sandra");
        personas.add("Ana");
        personas.add("Laura");
        
        System.out.println(personas.size());
        
        ListIterator<String> it = personas.listIterator();
        
        it.next();
        
        it.add("Juan");

        
        for (String e: personas){
            System.out.println(e);
        }
    }
}
