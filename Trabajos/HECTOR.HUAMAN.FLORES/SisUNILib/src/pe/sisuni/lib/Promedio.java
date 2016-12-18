/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sisuni.lib;

/**
 *
 * @author Héctor
 */
public final class Promedio {
    
    private Promedio(){
        
    }
    public static int promedio(int n1, int n2){
      int p;
      p = (n1+n2)/2;
      return p;
    }
    public static int promedio(int n1, int n2,int n3){
      int p;
      p = (n1+n2+n3)/3;
      return p;
    }
    public static int promedio(int n1, int n2,int n3, int n4){
      int p;
      p = (n1+n2+n3+n4)/4;
      return p;
    }
    
}
