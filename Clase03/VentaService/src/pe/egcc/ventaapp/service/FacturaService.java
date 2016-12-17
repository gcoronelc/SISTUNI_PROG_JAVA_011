package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.VentaModel;

/**
 *
 * @author Gustavo Coronel
 */
public class FacturaService extends CompAbstract{

  @Override
  public VentaModel[] procesar(double total) {
    // Variables
    double importe, impuesto, 
           servicio, totalGeneral;
    // Proceso
    importe = total / (1 + IGV);
    impuesto = total - importe;
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Retorno
    VentaModel[] repo = {
      new VentaModel("Importe: ", importe),
      new VentaModel("Impuesto: ", impuesto),
      new VentaModel("Total: ", total),
      new VentaModel("Servicio: ", servicio),
      new VentaModel("Total General: ", totalGeneral)
    };
    return repo;
  }
  
}
