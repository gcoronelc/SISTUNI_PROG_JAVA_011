package pe.egcc.prueba;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {
    
    int[] notas = {56,43,56,12,89,65,23};
    
    // Recorrido indexado de un arreglo
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println(i + ".- " + notas[i]);
    }
  }

  
}
