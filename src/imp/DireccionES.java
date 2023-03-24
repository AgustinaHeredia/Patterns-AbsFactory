package imp;

import Agenda.Direccion;

public class DireccionES extends Direccion {
    private String pais;

    public DireccionES(String calle, String ciudad, String codigoPostal, String pais) {
        super(calle, ciudad, codigoPostal);
        this.pais = "España";
    }

    @Override
    public String getDireccionCompleta() {
        return calle + ", " + codigoPostal + " " + ciudad + ", " + pais;
    }
}