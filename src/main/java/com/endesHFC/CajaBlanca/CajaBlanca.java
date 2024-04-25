package com.endesHFC.CajaBlanca;

public class CajaBlanca {
    public static int imprimeMedia(int x, int y) {
        if (x < 0 || y < 0) {
            System.out.println("x e y deben ser positivos");
        } else {
            int resultado = (x + y) / 2;
            System.out.println("La media es: " + resultado);
        }
        return x;
    }

    public static int ejercicio2(int a, int b, int c){
        int x=0;
        if (a> 1&& (b > 5) && (c < 2))
            x = x +1;
        else {
            x = x - 1;
        }
        return x;
    }
}
