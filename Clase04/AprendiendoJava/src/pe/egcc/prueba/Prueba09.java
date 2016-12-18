package pe.egcc.prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba09 {

  // Lista generica: Lista de tipo Object
  public static void main(String[] args) {
    
    List lista = new ArrayList();
    
    lista.add(345);
    lista.add(345.67);
    lista.add("Aaaaaaa");
    lista.add(new Random());
    
    // Recorrido tipo colección: for each
    for (Object o : lista) {
      System.out.println(o);
    }
    
  }
  
}
