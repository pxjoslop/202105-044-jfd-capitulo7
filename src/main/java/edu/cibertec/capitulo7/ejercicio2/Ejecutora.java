package edu.cibertec.capitulo7.ejercicio2;

public class Ejecutora {

    public static void main(String[] args) {
        Producto nuevo = new Producto(5, "Pescado", 20.65);
        BDProductoSet bDProductoSet = new BDProductoSet();
        System.out.println(bDProductoSet.cuentaElementosBD());
        bDProductoSet.insertarProducto(nuevo);
        System.out.println(bDProductoSet.cuentaElementosBD());
        System.out.println("El producto es = "+bDProductoSet.obtenerProducto(5).
                toString());
        bDProductoSet.insertarProducto(nuevo);
        System.out.println(bDProductoSet.cuentaElementosBD());

        // MAP - BD
        System.out.println(" --------- MAP ---------");
        BDProductoMap bDProductoMap = new BDProductoMap();
        System.out.println(bDProductoMap.cuentaElementosBD());
        bDProductoMap.insertarProducto(nuevo.getCodigo(), nuevo);
        System.out.println(bDProductoMap.cuentaElementosBD());
        System.out.println("El producto es = "+bDProductoMap.obtenerProducto(5).
                toString());
        bDProductoMap.insertarProducto(nuevo.getCodigo()+1, nuevo);
        System.out.println(bDProductoMap.cuentaElementosBD());
    }
    
}
