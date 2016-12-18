package pe.sistuni.app.controller;

import pe.sistuni.lib.MyMath;
import pe.sistuni.lib.Promedio;

/**
 *
 * @author USER
 */
public class AppController {

    public long factorial(int n) {
       return MyMath.factorial(n);
    }
    
    public long promedio(int n1, int n2, int n3, int n4, int n5){
        return Promedio.promedio(n1, n2, n3, n4, n5);
    }
    
    
    public long mcd( int n1, int n2 ){
        return MyMath.mcd(n1, n2);
    }
    
    public long mcm( int n1, int n2 ){
        return MyMath.mcm(n1, n2);
    }
    
    public int[] fibonacci(int n){
        return MyMath.fibonacci(n);
    }
    
    public boolean esPrimo(int n){
        return MyMath.esPrimo(n);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
