package eni.doc.app;

public class Main {

	public static void main(String[] args) {
		//GeneralDoctor Doc = new GeneralDoctor("Kleber","da Cunha",654651511);
		
		Address address = new Address("Hunted palace", 50, "Rue du nideck", 670000, "Strasbourg");
		
		address.show();
		
		Patient patient = new Patient("Lea","da Cunha","0608502212",'F',"01020304","2023-03-05","This is a comment");
		

	
		patient.show();
		
		

	}

}
