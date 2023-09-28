package package3;

public class Appointment {
	
	
	private Doctor doctor;
	
	private Patient patient;
	
	private String date;
	
	private String time;

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public void displayInfo() {
		System.out.println("\nAppointment details: ");
		System.out.println("Patient name: " + patient.getPatientName());
		System.out.println("Doctor's name: " + doctor.getDoctorName());
		System.out.println("Appointment date: " + date);
		System.out.println("Time: " + time);
	}

}
