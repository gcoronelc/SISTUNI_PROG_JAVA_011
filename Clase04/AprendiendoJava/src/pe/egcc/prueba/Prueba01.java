package pe.egcc.prueba;

import pe.egcc.model.impl.VentaImpl;
import pe.egcc.model.spec.VentaSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
    
  public static void main(String[] args) {
    VentaSpec venta = new VentaImpl();
    System.out.println("ID: 60  ==>   PRECIO: " + venta.getPrecio(60));
  }

}
