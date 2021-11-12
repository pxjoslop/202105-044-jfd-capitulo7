package edu.cibertec.capitulo7.ejercicio1;

public class Producto implements Comparable {

    private int codigo;
    private String nombre;
    private double precio;

    @Override
    public int compareTo(Object t) {
        String nombreProducto = ((Producto)t).getNombre();
        return this.nombre.compareTo(nombreProducto);
    }

    
    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
