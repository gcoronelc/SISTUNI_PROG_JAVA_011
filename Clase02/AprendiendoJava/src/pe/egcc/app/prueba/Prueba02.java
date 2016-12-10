package pe.egcc.app.prueba;

import java.math.MathContext;
import pe.egcc.app.service.MateService;
import pe.egcc.app.service.MyMath;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @site www.desarrollasoftware.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    
    System.out.println("PI: " + MyMath.PI);
    
    System.out.println("Suma: " 
              + MyMath.sumar(15, 20));
    
  }
  
}
