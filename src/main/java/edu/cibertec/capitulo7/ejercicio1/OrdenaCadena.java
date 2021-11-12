package edu.cibertec.capitulo7.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenaCadena {

    public static void main(String[] args) {
        ArrayList<String> listaCursos = new ArrayList<>();
        listaCursos.add("Java");
        listaCursos.add("Angular");
        listaCursos.add("SQL Server");
        listaCursos.add("Php");
        
        //Orden ascendente
        Collections.sort(listaCursos);
        System.out.println(listaCursos);
        //Orden descendente
        Collections.reverse(listaCursos);
        System.out.println(listaCursos);
        
        System.out.println("---------------------------------");
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto(1, "Fideos", 15.36));
        listaProductos.add(new Producto(2, "Detergente", 20.87));
        listaProductos.add(new Producto(3, "Azucar", 1.50));
        listaProductos.add(new Producto(4, "Bolsa Arroz", 5.95));
        
        Collections.sort(listaProductos);
        for (Producto listaProducto : listaProductos) {
            System.out.println(listaProducto.getNombre());
        }
    }

}
