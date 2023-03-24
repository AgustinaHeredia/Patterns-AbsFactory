package Agenda;

public class FactoryMaker {

	public static AbstractFactory getFactory(String pais) {
        
		if (pais.equalsIgnoreCase("España")) {
                return new ContactoESFactory();
		
		}else if (pais.equalsIgnoreCase("Francia")) {

                return new ContactoFRFactory();
            
		} else if (pais.equalsIgnoreCase("Italia")) {
                return new ContactoITFactory();
            
		}        
                
        return null;
    }
}
