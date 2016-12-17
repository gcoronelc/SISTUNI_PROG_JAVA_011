package pe.egcc.ventaapp.controller;

import pe.egcc.ventaapp.model.VentaModel;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaController {

  public String[] getTipos() {
    return CompFactory.getTipos();
  }

  public VentaModel[] procesar(String tipo, double total) {
    return CompFactory
            .getComp(tipo).procesar(total);
  }
  
}
