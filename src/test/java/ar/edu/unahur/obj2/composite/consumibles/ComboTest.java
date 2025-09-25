package ar.edu.unahur.obj2.composite.consumibles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ComboTest {
    private Producto cafeConLeche = new Cafe("cafe con leche", 5.00, 100, true);
    private Producto medialunaDeGrasa = new Medialuna("media de grasa", 4.0, 200, tipoMedialuna.DE_GRASA);
    private Producto jugo =new JugoDeNaranja("jugo de naranja", 6.0, 150);
    private Producto medialunaDeManteca = new Medialuna("media de manteca", 4.0, 200, tipoMedialuna.DE_MANTECA);
    //private Producto medialunaConDulce = new Medialuna("medialuna con dulce de leche", 6.0, 250, tipoMedialuna.CON_DULCE_DE_LECHE);
    private Producto tostadoDeJAmon = new Tostado("tostado de JyQ", 10.5, 300, tipoTostado.JAMON_Y_QUESO);
    //private Producto tostadoDeSalamn = new Tostado("tostado de SyQ", 12.5, 300, tipoTostado.SALAME_YQUESO);
    private List<Consumible> productos = new ArrayList<>();
    private Combo combo1 = new Combo("cafe con leche y medialuna de manteca", 20.0,productos);
    private Combo combo2 = new Combo("jugo con tostado de salame y queso", 30.5);
    @Test
    void testAgregarProducto() {
        combo1.agregarProducto(cafeConLeche);
        combo1.agregarProducto(medialunaDeManteca);
        Integer tamanio = combo1.getProductos().size();
        assertEquals(2,tamanio );

    }

    @Test
    void testCosto() {
        combo1.agregarProducto(tostadoDeJAmon);
        combo1.agregarProducto(jugo);

        assertEquals(20.0, combo1.costo());

    }

    @Test
    void testCosto2() {
        combo1.agregarProducto(medialunaDeGrasa);
        combo1.agregarProducto(jugo);

        assertEquals(14.9, combo1.costo());

    }

    @Test
    void testEleminarProducto() {
        combo1.agregarProducto(cafeConLeche);
        combo1.agregarProducto(medialunaDeManteca);
        Integer tamanio = combo1.getProductos().size();
        assertEquals(2,tamanio );
        combo1.eleminarProducto(medialunaDeManteca);        
        assertEquals(1, combo1.getProductos().size());

    }
    @Test
    void dadoElCombo2_elNomreES_Jugo_Con_Tostado_De_Salame_Y_Queso_Y_SulValorEs30Con50(){
        assertEquals("jugo con tostado de salame y queso", combo2.getNombre());
        assertEquals(30.5, combo2.getPrecio());

    }
}
