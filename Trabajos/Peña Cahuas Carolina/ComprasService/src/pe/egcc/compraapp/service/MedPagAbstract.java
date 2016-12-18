package pe.egcc.compraapp.service;

import pe.egcc.compraapp.model.MedioPagoModel;

public abstract class MedPagAbstract {

    public static final double IGV = 0.18;

    public abstract MedioPagoModel[] procesar(double monto);
}
