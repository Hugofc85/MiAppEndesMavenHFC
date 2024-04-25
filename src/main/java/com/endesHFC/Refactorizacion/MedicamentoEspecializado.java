package com.endesHFC.Refactorizacion;

/**
 * La clase MedicamentoEspecializado representa un medicamento especializado.
 */
class MedicamentoEspecializado extends Medicamento {
    private TipoMedicamento tipo;

    /**
     * Constructor de la clase MedicamentoEspecializado.
     *
     * @param nombre el nombre del medicamento especializado.
     * @param precio el precio del medicamento especializado.
     * @param tipo   el tipo de enfermedad que trata el medicamento.
     */
    public MedicamentoEspecializado(String nombre, double precio, TipoMedicamento tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    /**
     * Obtiene el tipo de enfermedad que trata el medicamento.
     *
     * @return el tipo de enfermedad del medicamento.
     */
    public TipoMedicamento getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de enfermedad que trata el medicamento.
     *
     * @param tipo el tipo de enfermedad del medicamento.
     */
    public void setTipo(TipoMedicamento tipo) {
        this.tipo = tipo;
    }
}
