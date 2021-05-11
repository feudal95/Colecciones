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
public class Prueba_TreeSet {

    public static void main(String[] args) {
        /*  TreeSet<String> ordenarPersonas = new TreeSet<String>();

        ordenarPersonas.add("Sandra");
        ordenarPersonas.add("Amanda");
        ordenarPersonas.add("Diana");
        for (String s : ordenarPersonas) {
            System.out.println(s);
        }*/

        //  ComparadorArticulos compara_art= new ComparadorArticulos();
        
        
        
        
        
        TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(new Comparator<Articulo>() {
            @Override
            public int compare(Articulo t, Articulo t1) {
                String descripcionA = t.getDescripcion();
                String descripcionB = t1.getDescripcion();

                return descripcionA.compareTo(descripcionB);
            }

        });

        Articulo primero = new Articulo(1, "primer Articulo");
        Articulo segundo = new Articulo(2, "segundo Articulo");
        Articulo tercero = new Articulo(30, "tercero Articulo");
        Articulo cuarto = new Articulo(4, "cuarto Articulo");

        TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
        ordenaArticulos.add(tercero);
        ordenaArticulos.add(primero);
        ordenaArticulos.add(cuarto);
        ordenaArticulos.add(segundo);

        for (Articulo art : ordenaArticulos) {
            System.out.println(art.getDescripcion());
        }

        System.out.println("\n\n\n");
        /* Articulo comparadorArticulos = new Articulo();

        TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos);
         */
        ordenaArticulos2.add(primero);
        ordenaArticulos2.add(segundo);
        ordenaArticulos2.add(tercero);
        ordenaArticulos2.add(cuarto);

        for (Articulo art : ordenaArticulos2) {
            System.out.println(art.getDescripcion());
        }

    }

}

class Articulo implements Comparable<Articulo>/*, Comparator<Articulo>*/ {

    /*  public Articulo() {

    }*/
    public Articulo(int num, String desc) {

        numero_articulo = num;
        descripcion = desc;
    }

    @Override
    public int compareTo(Articulo t) {
        //  System.out.println("soy "+t.numero_articulo);
        // System.out.println("soyyy" +numero_articulo);
        return numero_articulo - t.numero_articulo;
    }

    /**
     * @return the numero_articulo
     */
    public int getNumero_articulo() {
        return numero_articulo;
    }

    /**
     * @param numero_articulo the numero_articulo to set
     */
    public void setNumero_articulo(int numero_articulo) {
        this.numero_articulo = numero_articulo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /*
    @Override
    public int compare(Articulo t, Articulo t1) {
        String descripcionA = t.getDescripcion();
        String descripcionB = t1.getDescripcion();

        return descripcionA.compareTo(descripcionB);
    }*/

    private int numero_articulo;
    private String descripcion;

}

class ComparadorArticulos implements Comparator<Articulo> {

    @Override
    public int compare(Articulo t, Articulo t1) {
        String descripcionA = t.getDescripcion();
        String descripcionB = t1.getDescripcion();

        return descripcionA.compareTo(descripcionB);
    }

}
