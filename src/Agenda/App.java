package Agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class App {
	
	static Scanner input = new Scanner(System.in);
	static AbstractFactory factory = FactoryMaker.getFactory("España");
	static ArrayList<Contacto> contactos = new ArrayList<>();

    public static void main(String[] args) {
    	

        while (true) {
            // Mostrar opciones al usuario
           
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Ver contactos");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Salir");

            // Leer la opción del usuario
            int opcion = pedirInt("Seleccione una opción:");

            switch (opcion) {
                case 1:
                    addContacto();
                    break;
                case 2:
                    eliminarContacto();
                    break;
                case 3:
                    listaContactos();
                    break;
                case 4:
                	buscarContacto();
                    break;
                case 5:
                    // Salir del programa
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
    
    public static void addContacto() {
    	// Crear un nuevo contacto
        String nombre = pedirString("Introduzca el nombre del contacto:");

        // Crear objeto de dirección
        Direccion direccion = factory.crearDireccion(pedirString("Calle: "),pedirString("ciudad: "),pedirString("pais: "),pedirString("CodigoPostal: "));

        // Crear objeto de teléfono
        Telefono telefono = factory.crearTelefono(pedirString("Número de teléfono: "));

        // Crear objeto de contacto y añadirlo a la lista
        Contacto contacto = new Contacto(nombre, direccion, telefono);
        contactos.add(contacto);

        System.out.println("Contacto añadido correctamente.");
    }
    
    public static void eliminarContacto() {
    	// Eliminar un contacto
        
        String nombreEliminar = pedirString("Introduzca el nombre del contacto a eliminar:");

        for (Contacto c : contactos) {
            if (c.getNombre().equals(nombreEliminar)) {
                contactos.remove(c);
                System.out.println("Contacto eliminado correctamente.");
                break;
            }
        }

        System.out.println("Contacto no encontrado.");
    }
    
    public static void listaContactos() {
    	// Ver la lista de contactos
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            System.out.println("Contactos en la agenda:");

            for (Contacto c : contactos) {
                System.out.println("- " + c.getNombre());
            }
        }
    }
    
    public static void buscarContacto() {
    	String nombre = pedirString("Indica el nombre de la persona");
    	boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                System.out.println("Contacto encontrado:");
                System.out.println(contacto.toString());
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    	
    }
    
    static int pedirInt(String texto) {
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
	}
	static String pedirString(String texto) {
		System.out.println(texto);
		String nom = input.next();
		return nom;
	}
}

