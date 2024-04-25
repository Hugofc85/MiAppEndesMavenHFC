package com.endesHFC.Refactorizacion;

import java.util.Map;
import java.util.Random;

/**
 * La clase Principal contiene el método main para iniciar el programa.
 */
class Principal {
    /**
     * Método principal para iniciar el programa.
     *
     * @param args los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();
        Random random = new Random();



        // Agregar medicamentos al inventario de la farmacia
        MedicamentoGenerico paracetamol = new MedicamentoGenerico("Paracetamol", 10.0);
        farmacia.agregarMedicamento(paracetamol, 100);

        // Agregar más medicamentos...

        MedicamentoEspecializado insulina = new MedicamentoEspecializado("Insulina", 50.0, TipoMedicamento.DIABETES);
        farmacia.agregarMedicamento(insulina, 20);

        // Agregar más medicamentos...

        // Imprimir el inventario de la farmacia
        System.out.println("Inventario de la farmacia:");
        for (Map.Entry<String, Integer> entry : farmacia.getInventario().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }
}

