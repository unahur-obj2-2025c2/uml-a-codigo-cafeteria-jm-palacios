package ar.edu.unahur.obj2.composite.consumibles;

public class Cafe extends Bebida{
    private Boolean conLeche;

    public Cafe(String nombre, Double presioBase, Integer capacidadMl, Boolean conLeche) {
        super(nombre, presioBase, capacidadMl);
        this.conLeche = conLeche;
    }

    public Boolean getConLeche() {
        return conLeche;
    }

    public void setConLeche(Boolean conLeche) {
        this.conLeche = conLeche;
    }

    @Override
    protected Double doCosto() {
        return conLeche ? 6.5 : 5.0;
    }

    

}
