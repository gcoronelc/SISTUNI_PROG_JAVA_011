package pe.egcc.prueba;

import java.util.Arrays;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba07 {

  public static void main(String[] args) {
    
    int[] notas = {56,43,56,12,89,65,23};
    
    // Usando Programación Funcional
    Arrays.stream(notas)
      .filter(n -> n > 50)
      .forEach(n -> System.out.println("Nota: " + n) );
     
  }

  
}
