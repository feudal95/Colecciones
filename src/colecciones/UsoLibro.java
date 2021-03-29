/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author diego
 */
public class UsoLibro {
    public static void main(String[] args) {
        Libro libro1= new Libro("P en JAVA", "Juan", 25);
        Libro libro2= new Libro("P en JAVA II", "Juan", 25);
        
      //  libro1 = libro2;
        
        if(libro1.equals(libro2)){
            
            System.out.println("Es el  mismo libro");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }else{
            System.out.println("no es el mismo libro");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }
    }
    
}
