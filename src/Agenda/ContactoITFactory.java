package Agenda;

import imp.DireccionIT;
import imp.TelefonoIT;

public class ContactoITFactory extends AbstractFactory {
    @Override
    public Direccion crearDireccion(String calle, String ciudad, String pais, String codigoPostal) {
        return new DireccionIT(calle, ciudad, pais, codigoPostal);
    }

    @Override
    public Telefono crearTelefono(String numero) {
        return new TelefonoIT(numero);
    }
}