package ar.edu.unahur.obj2.composite.consumibles;

public abstract class Bebida extends Producto{
    protected Integer capacidadMl;

    public Bebida(String nombre, Double presioBase, Integer capacidadMl) {
        super(nombre, presioBase);
        this.capacidadMl = capacidadMl;
    }

    @Override
    public Double costo() {
        return super.costo() + doCosto();
    }

    protected abstract Double doCosto();    

}
