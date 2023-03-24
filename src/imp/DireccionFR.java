package imp;

import Agenda.Direccion;

public class DireccionFR extends Direccion {
    private String pais;

    public DireccionFR(String calle, String ciudad, String codigoPostal, String pais) {
        super(calle, ciudad, codigoPostal);
        this.pais = "Francia";
    }

    @Override
    public String getDireccionCompleta() {
        return calle + ", " + codigoPostal + " " + ciudad + ", " + pais;
    }
}