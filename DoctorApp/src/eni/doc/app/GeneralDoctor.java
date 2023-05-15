package eni.doc.app;

public class GeneralDoctor {

	public static final int MAX_APPOINTMENTS = 15;

	private String first_name;
	private String last_name;
	private String phoneNumber;
	private static int price = 30;
	private Address address;
	private Availability[] appointment = new Availability[MAX_APPOINTMENTS];

	public GeneralDoctor(String first_name, String last_name, String phoneNumber, int price, Address address) {
		this.first_name = first_name.toUpperCase();
		this.last_name = last_name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public void show() {
		System.out.printf("%s %s%nPhone Number : %s%nPrice : %d%n", this.first_name, this.last_name, this.first_name,
				this.last_name, this.first_name, this.last_name, this.phoneNumber, GeneralDoctor.price);
		this.address.show();

		System.out.println("Appointment : ");

		for (int i = 0; i < this.appointment.length; i++)
			if (this.appointment[i] != null)
				this.appointment[i].show();
	}

	/**
	 * @param creneauAAjouter
	 */
	void ajouterCreneau(Availability creneauAAjouter) {
		if (this != creneauAAjouter.getGeneralDoctor()) {
			System.err.println("Ce créneau ne peut être associé à ce médecin " + "car il est déjà associé à un autre");
		} else {
			int pos = 0;
			while (pos < this.appointment.length && this.appointment[pos] != null)
				pos++;
			if (pos == this.appointment.length)
				System.err.println("Trop de créneaux sont affectés à ce médecin");
			else
				this.appointment[pos] = creneauAAjouter;
		}
	}

}
