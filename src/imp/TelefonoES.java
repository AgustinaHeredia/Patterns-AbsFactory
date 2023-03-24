package imp;

import Agenda.Telefono;

public class TelefonoES extends Telefono {
    public TelefonoES(String numero) {
        super(numero);
    }
    
    @Override
    public String getNumeroCompleto() {
        return "+34 " + numero;
    }
}


