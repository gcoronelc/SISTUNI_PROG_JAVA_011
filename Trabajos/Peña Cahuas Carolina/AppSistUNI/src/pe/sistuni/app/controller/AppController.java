package pe.sistuni.app.controller;

import java.util.Arrays;
import pe.sistuni.lib.MyMath;
import pe.sistuni.lib.Promedio;

public class AppController {

    public long factorial(int n) {
        return MyMath.factorial(n);
    }

    public String esPrimo(int n) {
        String msg = "no es primo";
        boolean result = MyMath.esPrimo(n);
        if (result) {
            msg = "si es primo";
        }
        return msg;
    }

    public int mcm(int n1, int n2) {
        return MyMath.mcm(n1, n2);
    }

    public int mcd(int n1, int n2) {
        return MyMath.mcd(n1, n2);
    }

    public String fibonacci(int n) {

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

    public int promedio(int n1, int n2) {
        return Promedio.promedio(n1, n2);
    }

    public int promedio(int n1, int n2, int n3) {
        return Promedio.promedio(n1, n2, n3);
    }

    public int promedio(int n1, int n2, int n3, int n4) {
        return Promedio.promedio(n1, n2, n3, n4);
    }

    public int promedio(int n1, int n2, int n3, int n4, int n5) {
        return Promedio.promedio(n1, n2, n3, n4, n5);
    }
}
