package pe.sistuni.lib;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @site www.desarrollasoftware.com
 */
public final class MyMath {

  private MyMath() {
  }
  
  public static long factorial(int n){
    long f = 1;
    while(n > 0){
      f *= n--;
    }
    return f;
  }
  
  public static int mcd(int n1, int n2){
    return 0;
  }
  
  public static int mcm(int n1, int n2){
    return 0;
  }
  
  public static int[] fibonacci(int n){
    return null;
  }
  
  public static boolean esPrimo(int n){
    return false;
  }
  
  
}
