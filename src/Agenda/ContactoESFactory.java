package Agenda;

import imp.DireccionES;
import imp.TelefonoES;

public class ContactoESFactory extends AbstractFactory {
    @Override
    public Direccion crearDireccion(String calle, String ciudad, String pais, String codigoPostal) {
        return new DireccionES(calle, ciudad, pais, codigoPostal);
    }

    @Override
    public Telefono crearTelefono(String numero) {
        return new TelefonoES(numero);
    }
}