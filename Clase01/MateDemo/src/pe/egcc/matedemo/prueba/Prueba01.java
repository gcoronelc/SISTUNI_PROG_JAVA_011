package pe.egcc.matedemo.prueba;

import pe.egcc.matedemo.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
  
    // Datos
    int n1 = 50;
    int n2 = 20;
    
    // Proceso
    MateService mateService;
    mateService = new MateService();
    int suma = mateService.sumar(n1, n2);
    
    // Reporte
    System.out.println("Número 1: " + n1);
    System.out.println("Número 2: " + n2);
    System.out.println("Suma: " + suma);
  
  }
  
}
