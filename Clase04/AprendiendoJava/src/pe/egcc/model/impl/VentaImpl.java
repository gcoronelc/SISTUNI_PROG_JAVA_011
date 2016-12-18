package pe.egcc.model.impl;

import java.util.Random;
import pe.egcc.model.spec.VentaSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaImpl implements VentaSpec{

  @Override
  public double getPrecio(int id) {
    Random rnd = new Random();
    double precio = rnd.nextDouble() * 2000 + 1;
    return precio;
  }
  
}
