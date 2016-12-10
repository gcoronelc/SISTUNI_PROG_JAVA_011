package pe.egcc.app.prueba;

import javax.swing.JOptionPane;
import pe.egcc.app.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @site www.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    MateService service = new MateService();
    System.out.println("Suma: " 
      + service.sumar(1999999999, 1999999999));
    
  }
  
}
