package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.dto.PagoDTO;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @site www.desarrollasoftware.com
 */
public class PagoService {
  
  public void procesar(PagoDTO dto){
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = dto.getHorasDia() 
            * dto.getDias() * dto.getPagoHora();
    if(ingresos > 1500.00){
      renta = ingresos * 0.08;
    } else {
      renta = 0.0;
    }
    neto = ingresos - renta;
    // Salida
    dto.setIngresos(ingresos);
    dto.setRenta(renta);
    dto.setNeto(neto);
  }
  
  
}
