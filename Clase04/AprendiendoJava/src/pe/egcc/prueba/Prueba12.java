/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba12 {
  
  public static void main(String[] args) {
    Map<String, Object> rec = new HashMap<>();
    
    rec.put("codigo", "P3456");
    rec.put("nombre", "Televior de 50 pulgadas");
    rec.put("precio", 5678.89);
    rec.put("stock", 300);
    rec.put("activo", true);
    rec.put("nombre", "Refrigaradora");
    
    for(String key: rec.keySet()){
      System.out.println(key + " -> " + rec.get(key));
    }
  }
  
}
