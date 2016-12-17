package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.VentaModel;

/**
 *
 * @author Gustavo Coronel
 */
public abstract class CompAbstract {
  
  public static final double IGV = 0.18;
  public static final double SERVICIO = 0.10;
  
  
  public abstract VentaModel[] procesar(double total);
  
  
}
