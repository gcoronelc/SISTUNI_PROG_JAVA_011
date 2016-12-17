package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.VentaModel;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {


  public static void main(String[] args) {
    // Dato
    double total = 5000.0;
    // Proceso
    CompAbstract comp;
    comp = CompFactory.getComp(CompFactory.BOLETA);
    VentaModel[] repo = comp.procesar(total);
    // Reporte
    for (VentaModel r : repo) {
      System.out.println(r.getConcepto() 
              + " --> "+ r.getValor());
    }
  }
  
}
