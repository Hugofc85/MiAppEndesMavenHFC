package com.endesHFC.CajaBlancaTest;
import com.endesHFC.CajaBlanca.CajaBlanca;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CajaBlancaTest {
    @Test
    public void testImprimeMedia() {
        assertEquals(-1, CajaBlanca.imprimeMedia(-1, 0));


        assertEquals(1, CajaBlanca.imprimeMedia(1, 3));


        assertEquals(5, CajaBlanca.imprimeMedia(5, 5));
    }
    @Test
    public void testEjercicio2() {
        assertEquals(1, CajaBlanca.ejercicio2(2, 6, 1));

        assertEquals(-1, CajaBlanca.ejercicio2(2, 4, 1));

        assertEquals(-1, CajaBlanca.ejercicio2(0, 4, 3));

        assertEquals(-1, CajaBlanca.ejercicio2(0, 2, 3));
    }
}
