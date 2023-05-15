package eni.doc.app;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Availability {
	private LocalTime heureDebut;
	private int duree;
	private GeneralDoctor doctor;
	/**
	 * @param heureDebut
	 * @param duree
	 * @param medecin
	 */
	public Availability(LocalTime heureDebut, int duree, GeneralDoctor doctor) {
		this.heureDebut = heureDebut;
		this.duree = duree;
		this.doctor = doctor;
	}
	
	public void show() {
		System.out.printf("%s - %s (%d minutes)%n",
		this.heureDebut.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)),
		this.heureDebut.plusMinutes(this.duree).format(
		DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), this.duree);
		}
	
	public GeneralDoctor getGeneralDoctor() {
		return doctor;
		}
}
