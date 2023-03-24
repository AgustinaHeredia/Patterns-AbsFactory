package imp;

import Agenda.Telefono;

public class TelefonoIT extends Telefono {
    public TelefonoIT(String numero) {
        super(numero);
    }

    @Override
    public String getNumeroCompleto() {
        return "+39 " + numero;
    }
}
