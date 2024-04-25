package com.endesHFC.ArraysTest;


import com.endesHFC.Arrays.MisArrays;
import org.junit.After;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.ClassOrderer.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 class ArraysTest  {

    static int[] array1,array2,resul , array3,array4,resul2;

    @Order(3)
    @Test
    public void testSumar() {
        MisArrays arra= new MisArrays();
        assertArrayEquals(resul,arra.sumar(array1, array2));
    }
    @Order(2)
    @Test
    public void testSumar2(){
        MisArrays arra= new MisArrays();
        assertArrayEquals(resul2,arra.sumar(array3, array4));

    }
    @Order(1)
    @Test
    void testDecrementar() {
        MisArrays arra=new MisArrays();
        arra.decrementar(array1,1);
        assertArrayEquals(array1,new int[] {1,3,4});
    }
    @BeforeAll
    static void iniciar() {
        array1= new int[]{2,4,5};
        array2= new int[]{1,1,1};
        resul= new int[]{3,5,6};

        array3 = new int[]{2,4,5,5,2};
        array4 = new int[]{1,1,1,5,3};
        resul2 = new int[]{3,5,6,10,5};
    }
    @BeforeEach
    void iniciar2() {
        array1= new int[]{2,4,5};
        array2= new int[]{1,1,1};
        resul= new int[]{3,5,6};
    }
    @AfterAll
    static void finalizar(){
        System.out.println("Fin de los tests");
    }
    @AfterEach
    void finalizar2(){
        System.out.println("Finaliza un test");

    }


}
