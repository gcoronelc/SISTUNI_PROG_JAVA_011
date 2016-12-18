package pe.egcc.compraapp.controller;

import pe.egcc.compraapp.model.MedioPagoModel;
import pe.egcc.compraapp.service.MedPagFactory;

public class CompraController {
     public String[] getTipos() {
        return MedPagFactory.getTipos();
    }
    
    public MedioPagoModel[] procesar(String tipo,double total){
        return MedPagFactory.getComp(tipo).procesar(total);
    }
}
