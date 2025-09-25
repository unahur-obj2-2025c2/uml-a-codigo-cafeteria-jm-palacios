package ar.edu.unahur.obj2.composite.consumibles;

import java.util.List;

public class Combo implements Consumible{
    private String nombre;
    private Double precio;
    private List<Consumible> productos;
    
    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public Combo(String nombre, Double precio, List<Consumible> productos) {
        this.nombre = nombre;
        this.precio = precio;
        this.productos = productos;
    }

    public void agregarProducto(Consumible unConsumible){
        productos.add(unConsumible);
    }

    public void eleminarProducto(Consumible unConsumible){
        productos.remove(unConsumible);
    }

    @Override
    public Double costo() {
        Double lista = (productos.stream().mapToDouble(p->p.costo()).sum());
        return Double.min(precio, lista);
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public List<Consumible> getProductos() {
        return productos;
    }

    

}
