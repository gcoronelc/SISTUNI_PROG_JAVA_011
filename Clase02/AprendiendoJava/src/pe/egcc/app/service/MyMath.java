package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @site www.desarrollasoftware.com
 */
public final class MyMath {
  
  public static final double PI;
  
  // Inicializador estático
  static {
    PI = 3.1416;
  }
  
  // Para que no se pueda instanciar
  private MyMath() {
  }
  
  public static int sumar(int n1, int n2){
    System.out.println("int");
    return (n1 + n2);
  }
  
  public static long sumar(long n1, long n2){
    System.out.println("long");
    return (n1 + n2);
  }
  
  public static double sumar(double n1, double n2){
    return (n1 + n2);
  }
  
  public static float sumar(float n1, float n2){
    return (n1 + n2);
  }
  
}
