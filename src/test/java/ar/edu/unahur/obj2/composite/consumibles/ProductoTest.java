package ar.edu.unahur.obj2.composite.consumibles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductoTest {
    private Producto cafeConLeche = new Cafe("cafe con leche", 5.00, 100, true);
    private Producto medialunaDeGrasa = new Medialuna("media de grasa", 4.0, 200, tipoMedialuna.DE_GRASA);
    private Producto jugo =new JugoDeNaranja("jugo de naranja", 6.0, 150);
    private Producto medialunaDeManteca = new Medialuna("media de manteca", 4.0, 200, tipoMedialuna.DE_MANTECA);
    private Producto medialunaConDulce = new Medialuna("medialuna con dulce de leche", 6.0, 250, tipoMedialuna.CON_DULCE_DE_LECHE);
    private Producto tostadoDeJAmon = new Tostado("tostado de JyQ", 10.5, 300, tipoTostado.JAMON_Y_QUESO);
    private Producto tostadoDeSalamn = new Tostado("tostado de SyQ", 12.5, 300, tipoTostado.SALAME_YQUESO);
    @Test
    void conUnCafeConLecheYMedialunaDeGrasa_LosCostosSon11_50_Y_8_00() {
        assertEquals(11.5,cafeConLeche.costo());
        assertEquals(8.0, medialunaDeGrasa.costo());
    }
    @Test
    void conUnTotadoDeSalameYUnJugoDeNaranja_LosCostosSon(){
        assertEquals(22.5, tostadoDeSalamn.costo());
        assertEquals(6.9, jugo.costo());
    }
    @Test
    void elValorDeUnaMedialunaDeMantecaYUnaMedialunaConDulce_Son_(){
        assertEquals(9.0, medialunaDeManteca.costo());
        assertEquals(13.0, medialunaConDulce.costo());
    }
    @Test
    void elValorDeUntostadoDeJamonEs_18_50(){
        assertEquals(18.5, tostadoDeJAmon.costo());
    }
}
