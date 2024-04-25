package com.endesHFC.BaremoTest;

import com.endesHFC.Baremo.Baremo;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BaremoTest {
    @Test
    void test(){
        Baremo baremo = new Baremo();
        Assertions.assertEquals("No adjudicada", baremo.comprobarBaremo("1234567A", 4));
        Assertions.assertEquals("Adjudicada", baremo.comprobarBaremo("1234567A", 9));

        Assertions.assertEquals("Dato no valido", baremo.comprobarBaremo("123456A", 2));
        Assertions.assertEquals("Dato no valido", baremo.comprobarBaremo("1234567890A", 2));
        Assertions.assertEquals("Dato no valido", baremo.comprobarBaremo("1234ABC5D", 2));
        Assertions.assertEquals("Dato no valido", baremo.comprobarBaremo("ABCD12345", 6));
        Assertions.assertEquals("Dato no valido", baremo.comprobarBaremo("123456A", -5));
        Assertions.assertEquals("Dato no valido", baremo.comprobarBaremo("123456A", 20));
        Assertions.assertEquals("Dato no valido", baremo.comprobarBaremo("123456A", 7));


    }
}
