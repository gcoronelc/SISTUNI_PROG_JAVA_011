package pe.egcc.prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba11 {

  // Lista tipificada
  public static void main(String[] args) {
    
    List<String> lista = new ArrayList<>();
    
    lista.add("345");
    lista.add("345.67");
    lista.add("Casa");
    lista.add("Televisor");
    
    // Recorrido tipo colección: for each
    lista.stream()
            .filter(o -> o.toString().length() < 7)
            .forEach(o -> System.out.println(o));
    
  }
  
}
