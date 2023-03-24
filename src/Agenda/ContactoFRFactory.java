package Agenda;

import imp.DireccionFR;
import imp.TelefonoFR;

public class ContactoFRFactory extends AbstractFactory {
    @Override
    public Direccion crearDireccion(String calle, String ciudad, String pais, String codigoPostal) {
        return new DireccionFR(calle, ciudad, pais, codigoPostal);
    }

    @Override
    public Telefono crearTelefono(String numero) {
        return new TelefonoFR(numero);
    }
}