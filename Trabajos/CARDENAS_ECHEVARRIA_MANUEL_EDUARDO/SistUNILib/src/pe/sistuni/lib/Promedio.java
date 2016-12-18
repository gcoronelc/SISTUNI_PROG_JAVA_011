package pe.sistuni.lib;

/**
 * @author alumno
 */
public final class Promedio {

  
  private Promedio() {
  }
  
  public static float promedio(int[] num){
        
    float prom = 0;
    float n = num.length;
    
    for(int i=0; i<n; i++) prom+=num[i];

    return prom/n;
  }

}
