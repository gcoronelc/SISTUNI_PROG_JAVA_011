package pe.egcc.compraapp.service;

public class MedPagFactory {

    public MedPagFactory() {
    }
    public final static String VISA = "VISA";
    public final static String EFECTIVO = "Efectivo";

    public static String[] getTipos() {
        String[] tipos = {VISA, EFECTIVO};
        return tipos;
    }

    public static MedPagAbstract getComp(String tipo) {
        MedPagAbstract bean = null;
        switch (tipo) {
            case VISA:
                bean = new VisaService();
                break;
            case EFECTIVO:
                bean = new EfectivoService();
                break;
        }

        return bean;
    }
}
