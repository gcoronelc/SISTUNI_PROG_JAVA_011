
package pe.sistuni.app.controller;

import pe.sisuni.lib.MyMath;
import pe.sisuni.lib.Promedio;

/**
 *
 * @author Héctor
 */
public class AppController {

    public long factorial(int n) {
        return MyMath.factorial(n);
    }
    
    public int MCD(int n1, int n2){
        return MyMath.mcd(n1, n2);
    }
    public int MCM(int n1, int n2){
        return MyMath.mcm(n1, n2);
    }
    public String fibonacci(int n){
        int[] f = MyMath.fibonacci(n);
        int numSerie;
        String serie = "0, ";
        numSerie = f.length - 1;

        if (n > 1) {
            serie = "0, 1, ";
            numSerie = f.length - 2;
        }
        for (int i = 0; i < numSerie; i++) {

            serie += f[i] + ", ";

        }

        return serie.substring(0, serie.length() - 2);
    }
    public boolean primo( int n){
       return MyMath.esPrimo(n);
    }
    public double promedio(double n1 , double n2){
       return MyMath.promedio(n1, n2);
    }
    
}
