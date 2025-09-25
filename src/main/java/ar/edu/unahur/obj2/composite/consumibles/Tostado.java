package ar.edu.unahur.obj2.composite.consumibles;

public class Tostado extends Comestible{
    private tipoTostado tipo;

    public Tostado(String nombre, Double presioBase, Integer pesoGr, tipoTostado tipo) {
        super(nombre, presioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    protected Double doCosto() {
        return switch (tipo){
            case JAMON_Y_QUESO -> 8.0;
            case SALAME_YQUESO -> 10.0;
        } ;
    }

    

}
