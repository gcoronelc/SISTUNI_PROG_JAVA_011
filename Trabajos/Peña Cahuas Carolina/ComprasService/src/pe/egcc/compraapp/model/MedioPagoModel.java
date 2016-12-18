package pe.egcc.compraapp.model;

public class MedioPagoModel {
    private String indice;
    private double valor;

    public MedioPagoModel() {
    }

    public MedioPagoModel(String indice, double valor) {
        this.indice = indice;
        this.valor = valor;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
