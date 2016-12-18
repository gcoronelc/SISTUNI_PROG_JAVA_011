package pe.sistuni.lib;

public class MyMath {
    
    private MyMath() {
    }
    
    public static long factorial(int n) {
        long f = 1;
        
        while (n > 0) {
            f *= n--;
        }
        return f;
    }
    
    public static int mcd(int n1, int n2) {
        int mcd = 1;
        for (int i = 2; i <= n1 && i <= n2; i++) {
            while (n1 % i == 0 && n2 % i == 0) {
                
                mcd *= i;
                n1 /= i;
                n2 /= i;
            }
        }
        return mcd;
        
    }
    
    public static int mcm(int n1, int n2) {
        int mcm = 1;
        for (int i = 2; i <= n1 || i <= n2; i++) {
            while (n1 % i == 0 || n2 % i == 0) {
                
                mcm *= i;
                if (n1 % i == 0) {
                    n1 /= i;
                }
                if (n2 % i == 0) {
                    n2 /= i;
                }
                
            }
        }
        
        return mcm;
    }
    
    public static int[] fibonacci(int n) {
        int[] f = new int[n];
        int a = 1;
        int b = 1;
        int aux = a;
        for (int i = 0; i < f.length; i++) { 
            
            a = aux - a ;
            b = aux;
            aux = a + b;
           f[i] = aux;
            
        }
        return f;
    }
    
    public static boolean esPrimo(int n) {
        boolean primo = true;
        
        if (n < 2) {
            primo = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        return primo;
    }
    
}
