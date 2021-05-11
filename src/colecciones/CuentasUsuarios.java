/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package colecciones;

import java.util.*;

/**
 *
 * @author diego
 */
public class CuentasUsuarios {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000.00);
        Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000.00);
        Cliente cl3 = new Cliente("Penelope Cruz", "00003", 300000.00);
        Cliente cl4 = new Cliente("Julio Iglesias", "00004", 500000.00);
        Cliente cl5 = new Cliente("Antonio Banderas", "00001", 200000.00);
        
        Set<Cliente> clientesBanco= new HashSet<Cliente>();
        
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);
        
        
        for (Cliente cliente : clientesBanco) {
            
            System.out.println(cliente.getNombre()+ " "
                    + cliente.getN_cuenta()+ " "
                            + " "+ cliente.getSaldo());
            
        }
        
        /*
        for (Cliente cliente : clientesBanco) {
            
            
            if(cliente.getNombre().equals("Julio Iglesias")){
                
                clientesBanco.remove(cliente);
                
            }
        }*/
        System.out.println("\n\n\n\n\n");
        
        
        Iterator<Cliente> it = clientesBanco.iterator();
        
        while(it.hasNext()){
            
            String nombre_cliente=it.next().getNombre();
            
            if(nombre_cliente.equals("Julio Iglesias")){
                
                it.remove();
                
            }
            
        }
        
        for (Cliente cliente : clientesBanco) {
            
            System.out.println(cliente.getNombre()+ " "
                    + cliente.getN_cuenta()+ " "
                            + " "+ cliente.getSaldo());
            
        }
        
        /*
        Iterator<Cliente> it = clientesBanco.iterator();
        
        while(it.hasNext()){
        
        String nombreCliente = it.next().getNombre();
        
        String n_cuenta= it.next().getN_cuenta();
        System.out.println(nombreCliente+", "+n_cuenta);
        
        }*/
        
    }
}
