package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDTO;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @site www.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    PagoDTO dto = new PagoDTO(6, 20, 80.0);
    // Proceso
    PagoService service = new PagoService();
    service.procesar(dto);
    // Reporte
    String repo = "";
    repo += "Ingresos: " + dto.getIngresos() + "\n";
    repo += "Renta: " + dto.getRenta()+ "\n";
    repo += "Neto: " + dto.getNeto()+ "\n";
    System.out.println(repo);
  }
  
}
