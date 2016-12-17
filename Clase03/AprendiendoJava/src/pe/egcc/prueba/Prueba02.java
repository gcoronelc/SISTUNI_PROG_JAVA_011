package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;
import pe.egcc.model.Clase4;
import pe.egcc.model.Clase5;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {
    
    Clase2 obj = new Clase3();
    
    System.out.println("COMPATIBILIDAD");
    System.out.println("Object: " + ((obj instanceof Object)?"SI":"NO"));
    System.out.println("Clase1: " + ((obj instanceof Clase1)?"SI":"NO"));
    System.out.println("Clase2: " + ((obj instanceof Clase2)?"SI":"NO"));
    System.out.println("Clase3: " + ((obj instanceof Clase3)?"SI":"NO"));
    System.out.println("Clase4: " + ((obj instanceof Clase4)?"SI":"NO"));
    System.out.println("Clase5: " + ((obj instanceof Clase5)?"SI":"NO"));
    
    
  }
  
}
