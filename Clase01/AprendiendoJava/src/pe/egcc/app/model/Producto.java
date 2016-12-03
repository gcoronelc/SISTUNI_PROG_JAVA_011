package pe.egcc.app.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Producto {

  private String nombre;
  private double precio;
  private int stock;
  private boolean disponible;

  // Constructor por defecto
  public Producto() {
    this.nombre = "Manzana";
    this.precio = 6.70;
    this.stock = 100;
    this.disponible = true;
    System.out.println("Objeto creado.");
  }

  // Constructor adicional
  public Producto(String nombre, double precio, int stock, boolean disponible) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
    this.disponible = disponible;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isDisponible() {
    return disponible;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }
  
  

} // Fin de la clase
