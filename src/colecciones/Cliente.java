/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Objects;

/**
 *
 * @author diego
 */
public class Cliente {
    
        public Cliente(String nombre, String n_cuenta, double saldo){
        
        this.nombre=nombre;
        this.n_cuenta=n_cuenta;
        this.saldo=saldo;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.n_cuenta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.n_cuenta, other.n_cuenta)) {
            return false;
        }
        return true;
    }
    

    
    
    private String nombre;
    private String n_cuenta;
    private double saldo;
}
