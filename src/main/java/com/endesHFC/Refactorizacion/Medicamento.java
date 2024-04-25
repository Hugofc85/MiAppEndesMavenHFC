package com.endesHFC.Refactorizacion;

/**
 * La clase Medicamento es la superclase para todos los medicamentos.
 */
class Medicamento {
    private String nombre;
    private double precio;

    /**
     * Constructor de la clase Medicamento.
     *
     * @param nombre el nombre del medicamento.
     * @param precio el precio del medicamento.
     */
    public Medicamento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del medicamento.
     *
     * @return el nombre del medicamento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del medicamento.
     *
     * @return el precio del medicamento.
     */
    public double getPrecio() {
        return precio;
    }
}
