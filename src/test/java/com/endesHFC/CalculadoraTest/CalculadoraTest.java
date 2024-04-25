package com.endesHFC.CalculadoraTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.endesHFC.Calculadora.Calculadora;
import org.junit.jupiter.api.Test;

    public class CalculadoraTest {
        @Test
        void testRestar() {

            assertEquals(6, Calculadora.restar(8, 2));


        }
    }


