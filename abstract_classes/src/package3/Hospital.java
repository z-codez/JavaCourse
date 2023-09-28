package package3;

import java.util.ArrayList;
import java.util.HashSet;

public class Hospital {
	
	private HashSet<Patient> patientSet = new HashSet<>();
	
	private HashSet<Doctor> doctorSet = new HashSet<>();
	
	private ArrayList<Appointment> appointmentList = new ArrayList<>();
	
	
	public void addPatient(Patient patient) {
		
		patientSet.add(patient);
		
	}
	
	public void addDoctor(Doctor doctor) {

		doctorSet.add(doctor);
		
	}
	
	public void scheduleAppointment(Appointment appointment) {
		appointmentList.add(appointment);
	}
	
	public void displayInfo() {
		
		System.out.println("\nHospital info:");
		System.out.println("List of doctors:");
		for (Doctor doctor: doctorSet) {
			doctor.displayInfo();
		}
		System.out.println("List of patients:");
		for (Patient patient: patientSet) {
			patient.displayInfo();
		}
		System.out.println("List of appointments:");
		for (Appointment appointment : appointmentList) {
			appointment.displayInfo();
		}
	}
}
