package ar.edu.unahur.obj2.composite.consumibles;

public class Medialuna extends Comestible{
    private tipoMedialuna tipo;

    public Medialuna(String nombre, Double presioBase, Integer pesoGr, tipoMedialuna tipo) {
        super(nombre, presioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    protected Double doCosto() {
        return switch (tipo){
            case DE_GRASA -> 4.0;
            case DE_MANTECA -> 5.0;
            case CON_DULCE_DE_LECHE -> 7.0;

        };
    }   

}
