package imp;

import Agenda.Telefono;

public class TelefonoFR extends Telefono {
    public TelefonoFR(String numero) {
        super(numero);
    }

    @Override
    public String getNumeroCompleto() {
        return "+33 " + numero;
    }
}