package eni.doc.app;

public class Main {
	public static void main(String[] args) {
		
		Address address = new Address("Hunted palace", 50, "Rue du nideck", 670000, "Strasbourg");
		//address.show();
		
		GeneralDoctor Doc = new GeneralDoctor("Kleber","da Cunha","0102030400",50, address);
		
		
		
		Doc.show();
		
		//Address address = new Address("Hunted palace", 50, "Rue du nideck", 670000, "Strasbourg");
		
		
		
		//Patient patient = new Patient("john","wick",0102030405,'M',"21355465135","1996-01-15","YES THIS ONE", address);
		

		//patient.show();
		
		
		//GeneralDoctor doc = new GeneralDoctor("john","wick",0102031523, address);
		
		

	}

}
