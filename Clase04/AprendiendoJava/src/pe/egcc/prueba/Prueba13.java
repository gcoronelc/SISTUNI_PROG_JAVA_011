package pe.egcc.prueba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba13 {
  
  public static void main(String[] args) {
    List<Map<String, Object>> lista = new ArrayList<>();
    
    // Registro 1
    Map<String,Object> rec = new HashMap<>();
    rec.put("codigo", "P3456");
    rec.put("nombre", "Televior de 50 pulgadas");
    rec.put("precio", 5678.89);
    rec.put("stock", 300);
    rec.put("activo", true);
    rec.put("nombre", "Refrigaradora");
    lista.add(rec);
    
    // Registro 2
    rec = new HashMap<>();
    rec.put("codigo", "P34500");
    rec.put("nombre", "Televior de 50 pulgadas");
    rec.put("precio", 5678.89);
    rec.put("stock", 300);
    rec.put("activo", true);
    lista.add(rec);
    // Registro 3
    rec = new HashMap<>();
    rec.put("codigo", "P34512");
    rec.put("nombre", "Coimputadora");
    rec.put("precio", 3890.89);
    rec.put("stock", 200);
    rec.put("activo", true);
    rec.put("nombre", "Refrigaradora");
    lista.add(rec);
    
    
    for(Map<String,Object> r: lista){
      System.out.println("--------------------\r");
      for(String key: r.keySet()){
        System.out.println(key + " -> " + r.get(key));
      }
    }
  }
  
}
