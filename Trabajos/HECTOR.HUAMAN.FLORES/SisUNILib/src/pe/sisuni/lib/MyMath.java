/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sisuni.lib;

/**
 *
 * @author Alumno
 */
public final class MyMath {
    
    private MyMath(){
    
    }
    
    public static long factorial(int n){

     long f = 1;
     while(n>0){
       f *= n--;
     }
     return f;
    }
    public static int mcd(int n1, int n2){
      if(n2==0){
           return n1;
      }else{
           return mcd(n2, n1 % n2);
      }
    }
    public static int mcm(int n1, int n2){
       int mayor;
       int n;
       if(n1>n2){
         mayor= n1;
       }else{
         mayor= n2;
       }
        n=mayor;
       while((n%n1!=0) || (n%n2!=0)){
          n++;
       }
       return n;
        
    }
    public static int[] fibonacci(int n){
       int[] fibo = new int[n];
        int a = 1;
        int b = 1;
        int auxiliar = a;
        for (int i = 0; i < fibo.length; i++) { 
            
            a = auxiliar - a ;
            b = auxiliar;
            auxiliar = a + b;
           fibo[i] = auxiliar;
           //System.out.println(aux);
            
        }
        return fibo;
    }
    public static boolean esPrimo(int n){
        int a=0;
        int i;
        for(i=1;i<(n+1);i++){
         if(n%i==0){
             a++;
            }
         }
         if(a!=2){
              return false;
            }else{
              return true;  
         }
    }
    public static double promedio( double n1,double n2){
        return((n1+n2)/2);
    }
}
