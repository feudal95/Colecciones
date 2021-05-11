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
public class PruebaMapas {
    public static void main(String[] args) {
        HashMap<String, Empleado>  personal = new HashMap<String, Empleado>();
        
        personal.put("145", new Empleado("Pablo"));
        personal.put("146", new Empleado("Ana"));
        personal.put("147", new Empleado("Antonio"));
        personal.put("148", new Empleado("Sandra"));
        personal.put("149", new Empleado("Chandra"));
        
        System.out.println(personal);
        
        personal.remove("147");
        
        System.out.println("\n\n\n\n\n");
        
        System.out.println(personal);
        
        System.out.println("\n\n\n\n\\n");
        
   //     System.out.println(personal.entrySet());
   
        for(Map.Entry<String,Empleado> entrada: personal.entrySet()){
            
            String clave = entrada.getKey();
            //215
            Empleado valor = entrada.getValue();
            
            System.out.println("Clave = "+ clave + ", Valor = "+ valor);
        }
        
        
        
    }
}

class Empleado{
    
    public Empleado(String n){
        nombre =n;
        sueldo = 2000;
        
        
    }
    
    public String toString(){
        
        return"[nombre=" + nombre + ", sueldo= "+ sueldo + "]" ;
    }
    
    private String nombre;
    
    private double sueldo;
    
    
}
