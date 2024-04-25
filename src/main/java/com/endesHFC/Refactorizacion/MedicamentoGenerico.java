package com.endesHFC.Refactorizacion;

/**
 * La clase MedicamentoGenerico representa un medicamento genérico.
 */
class MedicamentoGenerico extends Medicamento {
    /**
     * Constructor de la clase MedicamentoGenerico.
     *
     * @param nombre el nombre del medicamento genérico.
     * @param precio el precio del medicamento genérico.
     */
    public MedicamentoGenerico(String nombre, double precio) {
        super(nombre, precio);
    }
}
