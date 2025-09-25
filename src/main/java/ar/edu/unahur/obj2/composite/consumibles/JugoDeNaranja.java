package ar.edu.unahur.obj2.composite.consumibles;

public class JugoDeNaranja extends Bebida{

    public JugoDeNaranja(String nombre, Double presioBase, Integer capacidadMl) {
        super(nombre, presioBase, capacidadMl);
        
    }

    @Override
    protected Double doCosto() {
        return (capacidadMl * presioBase)/1000;
    }
    

}
