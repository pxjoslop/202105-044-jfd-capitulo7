package edu.cibertec.capitulo7.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.comparing;
import java.util.DoubleSummaryStatistics;

public class Ejecutora {

    public static void main(String[] args) {
        List<Producto> lista = new ArrayList<>();
        lista.add(new Producto(1, "Fideos", 15.25));
        lista.add(new Producto(2, "Azucar", 20.88));
        lista.add(new Producto(3, "Detergente", 9.57));
        lista.add(new Producto(4, "Escoba", 13.95));
        
        lista.stream().sorted(comparing(Producto::getPrecio)).
                forEach(System.out::println);
        
        System.out.println("----------2 PRIMEROS CON 5% DCTO ----------");
        lista.stream().limit(2).mapToDouble(miPrecio->miPrecio.getPrecio()*0.05).
                forEach(System.out::println);
        
        System.out.println("---------- INDICADORES ----------");
        DoubleSummaryStatistics estadisticas = lista.stream().
                mapToDouble(p -> p.getPrecio()).summaryStatistics();
        System.out.println("La suma de los precios es = "+estadisticas.getSum());
        System.out.println("El precio mayor es = "+estadisticas.getMax());
        System.out.println("El precio menor es = "+estadisticas.getMin());
        System.out.println("El promedio de precios es = "+
                estadisticas.getAverage());
    }
    
}
