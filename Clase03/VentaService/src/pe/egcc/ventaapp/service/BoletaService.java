package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.VentaModel;

/**
 *
 * @author Gustavo Coronel
 */
public class BoletaService extends CompAbstract{

  @Override
  public VentaModel[] procesar(double total) {
    // Variables
    double servicio, totalGeneral;
    // Proceso
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Retorno
    VentaModel[] repo = {
      new VentaModel("Total: ", total),
      new VentaModel("Servicio: ", servicio),
      new VentaModel("Total General: ", totalGeneral)
    };
    return repo;
  }
  
}
