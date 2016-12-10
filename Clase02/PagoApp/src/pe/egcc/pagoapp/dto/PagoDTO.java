package pe.egcc.pagoapp.dto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @site www.desarrollasoftware.com
 */
public class PagoDTO {

  // Datos
  private int horasDia;
  private int dias;
  private double pagoHora;
  // Calculos
  private double ingresos;
  private double renta;
  private double neto;

  /**
   * Constructor por defecto.
   */
  public PagoDTO() {
  }

  /**
   * Constructor adicional.
   *
   * @param horasDia Horas trabajadas por día.
   * @param dias Los días trabajados.
   * @param pagoHora Pago por hora.
   */
  public PagoDTO(int horasDia, int dias, double pagoHora) {
    this.horasDia = horasDia;
    this.dias = dias;
    this.pagoHora = pagoHora;
  }

  /**
   * Constructor adicional.
   *
   * @param horasDia Horas trabajadas por día.
   * @param dias Los días trabajados.
   * @param pagoHora Pago por hora.
   * @param ingresos Ingresos totales del trabajador.
   * @param renta Importe de la renta.
   * @param neto Importe neto que recibe el tranajador.
   */
  public PagoDTO(int horasDia, int dias, double pagoHora, double ingresos, double renta, double neto) {
    this.horasDia = horasDia;
    this.dias = dias;
    this.pagoHora = pagoHora;
    this.ingresos = ingresos;
    this.renta = renta;
    this.neto = neto;
  }

  public int getHorasDia() {
    return horasDia;
  }

  public void setHorasDia(int horasDia) {
    this.horasDia = horasDia;
  }

  public int getDias() {
    return dias;
  }

  public void setDias(int dias) {
    this.dias = dias;
  }

  public double getPagoHora() {
    return pagoHora;
  }

  public void setPagoHora(double pagoHora) {
    this.pagoHora = pagoHora;
  }

  public double getIngresos() {
    return ingresos;
  }

  public void setIngresos(double ingresos) {
    this.ingresos = ingresos;
  }

  public double getRenta() {
    return renta;
  }

  public void setRenta(double renta) {
    this.renta = renta;
  }

  public double getNeto() {
    return neto;
  }

  public void setNeto(double neto) {
    this.neto = neto;
  }

}
