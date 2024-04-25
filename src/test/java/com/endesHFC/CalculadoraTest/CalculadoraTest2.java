package com.endesHFC.CalculadoraTest;

import com.endesHFC.Calculadora.Calculadora;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest2 {
    Calculadora calculadora = new Calculadora();
    @Test
    void testDividir1(){
       assertThrows(java.lang.ArithmeticException.class,()->Calculadora.dividir(4, 0));

    }

    @Test
    void testDividir4(){
        assertAll("Juntado Test",
                ()->assertEquals(1, Calculadora.dividir(4, 4)),
                ()->assertEquals(1, Calculadora.dividir(3, 2))
        );

    }
    @Test
    void testDividir5(){
        assertTrue(Calculadora.dividir(6, 2)==3);

    }

    @Test
    void testPar(){
        assertTrue( Calculadora.esPar(2));
        assertFalse( Calculadora.esPar(3));

    }

    @Test
    void parOImpar(){
        assertEquals("Par", Calculadora.parOImpar(0));
        assertEquals("Impar", Calculadora.parOImpar(25));
    }



}
