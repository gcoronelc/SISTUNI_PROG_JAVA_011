package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.VentaModel;
import pe.egcc.ventaapp.service.BoletaService;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {


  public static void main(String[] args) {
    // Dato
    double total = 5000.0;
    // Proceso
    CompAbstract comp = new BoletaService();
    VentaModel[] repo = comp.procesar(total);
    // Reporte
    for (VentaModel r : repo) {
      System.out.println(r.getConcepto() 
              + " --> "+ r.getValor());
    }
  }
  
}
