package pe.sistuni.lib;


public final class MyMath {

  private MyMath() {
  }
  /**
   * Calcula el factorial de un numero
   * @param n numero del cual vamos a calcular el factorial
   * @return factorial de n
   */
  public static long factorial(int n){
    long f = 1;
    while(n > 0){
      f *= n--;
    }
    return f;
  }
  
  /**
   * Calcula el Minimo Comun Divisor de dos unmeros
   * @param n1 primer numero
   * @param n2 segundo numero
   * @return valos del Minimo Comun Divisor
   */
  public static int mcd(int n1, int n2){
    if(n2==0)   return n1;
    else        return mcd(n2, n1 % n2);
  }
  
  /**
   * Calcula el Minimo Comun Multiplo
   * @param n1
   * @param n2
   * @return 
   */
  public static int mcm(int n1, int n2){
    return (n1*n2)/mcd(n1,n2);
  }
  
  public static int[] fibonacci(int n){
      
    int anterior = 1;
    int actual = 0;
    int resultado[] = new int[n];

    resultado[0] = 0;

    for(int i=1; i<n; i++){
        resultado[i] = anterior + actual;
        anterior = actual;
        actual = resultado[i];
    }

    return resultado;
  }
  
  public static boolean esPrimo(int n){
    int a = 0;
    for(int i=1;i<=n/2;i++){
        if(n%i==0) a++;
    }
    if(a!=1)    return false;
    else        return true;
  }
}
