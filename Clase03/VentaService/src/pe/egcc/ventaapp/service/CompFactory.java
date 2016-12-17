package pe.egcc.ventaapp.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class CompFactory {

  private CompFactory() {
  }

  // Constantes
  public final static String FACTURA = "Factura";
  public final static String BOLETA = "Boleta";
  
  public static String[] getTipos(){
    String[] tipos = {FACTURA, BOLETA};
    return tipos;
  }
  
  public static CompAbstract getComp(String tipo){
    CompAbstract bean = null;
    switch(tipo){
      case FACTURA:
        bean = new FacturaService();
        break;
      case BOLETA:
        bean = new BoletaService();
        break;
    }
    return bean;
  }

}
