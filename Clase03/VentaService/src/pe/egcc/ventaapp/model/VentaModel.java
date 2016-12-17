package pe.egcc.ventaapp.model;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaModel {

  private String concepto;
  private double valor;

  public VentaModel() {
  }

  public VentaModel(String concepto, double valor) {
    this.concepto = concepto;
    this.valor = valor;
  }

  public String getConcepto() {
    return concepto;
  }

  public void setConcepto(String concepto) {
    this.concepto = concepto;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

}
