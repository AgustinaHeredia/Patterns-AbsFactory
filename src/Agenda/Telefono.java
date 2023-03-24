package Agenda;

public abstract class Telefono {
	
	protected String numero;

    public Telefono(String numero) {
        this.numero = numero;
    }

    public abstract String getNumeroCompleto();

}
