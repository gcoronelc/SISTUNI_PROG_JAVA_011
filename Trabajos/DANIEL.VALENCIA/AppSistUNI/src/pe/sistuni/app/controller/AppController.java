
package pe.sistuni.app.controller;

import pe.sistuni.lib.MyMath;


public class AppController {
    
    public double promedio(int[] n){
        return MyMath.promedio(n);
    }
    
    public long factorial(int n){
        return MyMath.factorial(n);
    }
    
    public int[] fibonacci(int n){
        return MyMath.fibonacci(n);
    }
    
    public static int mcd(int n1, int n2){
        return MyMath.mcd(n1, n2);
    }
    
    public static int mcm(int n1, int n2){
        return MyMath.mcm(n1, n2);
    }
    
    public static String esPrimo(int n){
        return MyMath.esPrimo(n);
    }
    
}
