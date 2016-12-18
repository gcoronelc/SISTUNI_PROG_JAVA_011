package pe.sistuni.lib;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public final class MyMath {
    
    private MyMath() {
    }
    
    public static long factorial( int n ){
        long f = 1;
        while(n > 0){
            f *= n--;
        }
      return f;
    }
    
    public static long mcd( int n1, int n2 ){
        long mcd = 0;
        long a = Math.max(n1,n2);
        long b = Math.min(n1,n2);
        while ( b != 0 ){
            mcd = b;
            b = a % b;
            a = mcd;
        }
      return mcd;
    }
    
    public static long mcm( int n1, int n2 ){
        long mcm = 0;
        int a = Math.max(n1,n2);
        int b = Math.min(n1,n2);
        mcm = ((a/mcd(a, b))* b);
        return mcm;
    }
    
    
    
    public static int[] fibonacci( int n ){
       // Scanner sc = new Scanner(System.in);
        int fibo[] = new int[n];
        fibo[1] = 1;
        fibo[2] = 1;
        for( int i = 3; i < n; i++ ){
          fibo[i] = fibo[i-1] + fibo[i-2] ;   
        }
      return fibo;
    }
    
    public static boolean esPrimo( int n ){
        int contador = 0;
        boolean primo = false;
        for(int i = 1 ; i <= n ; i++  ){
            if ( n % i == 0 ){
                contador ++;
            }
            System.out.println("contador " + contador);
        }
        if (contador != 2 ){
            primo = false;
            System.out.println(" No es primo");
        }
        else {
             primo = true;
             System.out.println(" Si es primo");
        }
      return primo;
    }
    
    
}
