package com.endesHFC.Refactorizacion;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * La clase Farmacia representa una farmacia que contiene un inventario de medicamentos.
 */
public class Farmacia {
    private Map<String, Integer> inventario;

    /**
     * Constructor de la clase Farmacia.
     */
    public Farmacia() {
        this.inventario = new HashMap<>();
    }

    /**
     * Agrega un medicamento al inventario de la farmacia.
     *
     * @param medicamento el medicamento a agregar.
     * @param cantidad    la cantidad del medicamento a agregar.
     */
    public void agregarMedicamento(Medicamento medicamento, int cantidad) {
        String nombre = medicamento.getNombre();
        if (inventario.containsKey(nombre)) {
            int cantidadExistente = inventario.get(nombre);
            inventario.put(nombre, cantidadExistente + cantidad);
        } else {
            inventario.put(nombre, cantidad);
        }
    }

    /**
     * Obtiene el inventario de la farmacia.
     *
     * @return un mapa que contiene el inventario de la farmacia.
     */
    public Map<String, Integer> getInventario() {
        return inventario;
    }
}