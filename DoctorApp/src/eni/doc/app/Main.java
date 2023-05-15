package eni.doc.app;

public class Main {
	public static void main(String[] args) {
		
		Address address = new Address("Hunted palace", 50, "Rue du nideck", 670000, "Strasbourg");
		//GeneralDoctor doc = new GeneralDoctor("teste", "teste", "teste",25,address);
		Patient patient = new Patient("Kleber","cunha","0102030405",'M',"0908070605","THIS COMMENT", address);		
		patient.show();
			}
}
