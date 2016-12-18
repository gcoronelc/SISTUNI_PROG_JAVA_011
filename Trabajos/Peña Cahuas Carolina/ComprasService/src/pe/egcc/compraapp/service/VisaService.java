package pe.egcc.compraapp.service;

import pe.egcc.compraapp.model.MedioPagoModel;

public class VisaService extends MedPagAbstract {
    
     public static final double DSCTO = 0.30d;

    @Override
    public MedioPagoModel[] procesar(double monto) {
         //variables
        double imp_igv,imp_dscto,importe;
        //proceso
         imp_igv = (monto * ( 1 + IGV ));
         imp_dscto = imp_igv * DSCTO;
         importe =  imp_igv - imp_dscto;
        //Retorno
        MedioPagoModel[] repo = {
            new MedioPagoModel("Monto", monto),
            new MedioPagoModel("IGV", IGV),
            new MedioPagoModel("Descuento", -imp_dscto),
            new MedioPagoModel("Importe", importe),
            
        };
        
        return repo;
    }
    
}
