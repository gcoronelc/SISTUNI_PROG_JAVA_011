package pe.egcc.compraapp.prueba;

import pe.egcc.compraapp.model.MedioPagoModel;
import pe.egcc.compraapp.service.MedPagAbstract;
import pe.egcc.compraapp.service.MedPagFactory;

public class Prueba02 {
    public static void main(String[] args) {
          //Dato
        double total = 100d;
        //Proceso
        MedPagAbstract med;
        med = MedPagFactory.getComp(MedPagFactory.EFECTIVO);
        MedioPagoModel[] repo = med.procesar(total);
        //Reporte
        for (MedioPagoModel r : repo) {
            System.out.println(r.getIndice()+ " ---> " + r.getValor());
        }
    }
}
