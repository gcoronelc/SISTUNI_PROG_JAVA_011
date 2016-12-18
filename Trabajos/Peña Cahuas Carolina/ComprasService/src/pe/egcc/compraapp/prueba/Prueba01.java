package pe.egcc.compraapp.prueba;

import pe.egcc.compraapp.model.MedioPagoModel;
import pe.egcc.compraapp.service.EfectivoService;
import pe.egcc.compraapp.service.MedPagAbstract;

public class Prueba01 {
    public static void main(String[] args) {
          //Dato
        double monto = 100d;
        //Proceso
        MedPagAbstract comp = new EfectivoService();
        MedioPagoModel[] repo = comp.procesar(monto);
        //Reporte
        for (MedioPagoModel r : repo) {
            System.out.println(r.getIndice()+ " ---> " + r.getValor());
        }
    }
}
