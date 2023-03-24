package imp;

import Agenda.Direccion;

public class DireccionIT extends Direccion {
    private String pais;

    public DireccionIT(String calle, String ciudad, String codigoPostal, String pais) {
        super(calle, ciudad, codigoPostal);
        this.pais = "Italia";
    }

    @Override
    public String getDireccionCompleta() {
        return calle + ", " + codigoPostal + " " + ciudad + ", " + pais;
    }
}