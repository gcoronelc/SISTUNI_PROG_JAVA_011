
package pe.sistuni.lib;




public final class MyMath {
    
    private MyMath(){
        
    }
    
    public static double promedio(int[] cad){
        double prom;
        
        int size = cad.length;
        int i = 0;
        double sum = 0;
        while(i < size){
            sum = sum + cad[i];
            i = i + 1;
        }
        prom = sum / size;
        
        return prom;
    }
    
    public static long factorial(int n){
        long f = 1;
        while(n > 0){
            f *= n--;
        }
        return f;
    }
    
    public static int mcd(int n1, int n2){
        
        while( n1 != n2){
            if (n1 > n2){
                n1 = n1 - n2;
            } else{
                n2 = n2 - n1;
            }
        }
        return n1;
    }
    
    public static int mcm(int n1, int n2){
        int mcm = 1;
        int i = 2;
        
        while(i <= n1 || i <= n2){
            if( n1%i == 0 || n2%i == 0){
                mcm = mcm*i;
                if( n1%i == 0){
                    n1 = n1 / i;
                }
                if( n2%i == 0){
                    n2 = n2/i;
                }
            } else{
                i = i + 1;
            }
        }
        return mcm;
    }
    
    public static int[] fibonacci(int n){
        int a=0, b=1, c, i;
        int k;
        k = n;
        int[] fibArr;
        fibArr = new int[k];
        fibArr[0] = 0;
        fibArr[1] = 1;
        i = 2;
        while(i<k){
            c = a + b;
            fibArr[i] = c;
            a = b;
            b = c;
            i = i + 1;
        }
        return fibArr;
    }
    
    public static String esPrimo(int n){
        int i=n/2; //EMPIEZO DE LA MITAD PARA ABAJO
        int band=1; //VARIABLE BANDERA, indicamos que n es primo
        String ans = " no es primo";
        while(i>1){
            if(n%i==0){
                band = 0; //NO ES PRIMO
                break;
            } else{
                i = i - 1;
            }
            
        }
        
        if( band == 0 ){
        } else {
            ans = " es primo. ";
        }
        return ans;
    }
}
