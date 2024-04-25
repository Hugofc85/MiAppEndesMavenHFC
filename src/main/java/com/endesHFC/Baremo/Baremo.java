package com.endesHFC.Baremo;

public class Baremo {
    public String comprobarBaremo(String DNI, int baremo){
        if(baremo>=5 && DNI.length() == 8)
            return "Adjudicada";
        else if (DNI.length() != 8){
            return "Dato no valido";
        }
        else
            return "No adjudicada";

    }
}
