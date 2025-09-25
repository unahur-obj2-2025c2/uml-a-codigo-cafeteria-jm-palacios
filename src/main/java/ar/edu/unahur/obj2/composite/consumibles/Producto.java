package ar.edu.unahur.obj2.composite.consumibles;

public abstract class Producto  implements Consumible{
    protected String nombre;
    protected Double presioBase;
    
    public Producto(String nombre, Double presioBase) {
        this.nombre = nombre;
        this.presioBase = presioBase;
    }

    @Override
    public Double costo() {
        return presioBase;
    }      

}
