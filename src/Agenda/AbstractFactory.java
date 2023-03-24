package Agenda;

public abstract class AbstractFactory {

	public abstract Direccion crearDireccion(String calle, String ciudad, String pais, String codigoPostal);
    public abstract Telefono crearTelefono(String numero);
}
