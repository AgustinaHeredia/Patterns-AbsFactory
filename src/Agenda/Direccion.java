package Agenda;

public abstract class Direccion {

	protected String calle;
    protected String ciudad;
    protected String codigoPostal;

    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public abstract String getDireccionCompleta();
}

