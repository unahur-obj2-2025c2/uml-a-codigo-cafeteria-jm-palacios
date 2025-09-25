package ar.edu.unahur.obj2.composite.consumibles;

public abstract class Comestible extends Producto{
    protected Integer pesoGr;

    public Comestible(String nombre, Double presioBase, Integer pesoGr) {
        super(nombre, presioBase);
        this.pesoGr = pesoGr;
    }

    @Override
    public Double costo() {
       return super.costo() + doCosto();
    }

    protected abstract Double doCosto();  

}
