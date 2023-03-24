package Agenda;

public class Contacto {
    private String nombre;
    private Direccion direccion;
    private Telefono telefono;

    public Contacto(String nombre, Direccion direccion, Telefono telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
    	return "Nombre :"+nombre+" Direccion: "+ direccion.getDireccionCompleta() + " Telefono: "+ telefono.getNumeroCompleto();
    }
}

