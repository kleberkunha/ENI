package eni.doc.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Appointment {
	private Availability availability;
	private Patient patient;
	private LocalDate date;
	/**
	 * @param availability
	 * @param patient
	 * @param date
	 */
	public Appointment(Availability availability, Patient patient, LocalDate date) {
		this.availability = availability;
		this.patient = patient;
		this.date = date;
	}
	
	
	public void afficher() {
		System.out.printf("Rendez-vous du %s ",
		this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		this.availability.show();
		System.out.printf("avec le Dr %s%npour ",
		this.availability.getGeneralDoctor());
		this.patient.show();
		}
	
}
