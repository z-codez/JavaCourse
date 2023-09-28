package package3;

public class Main {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		Patient patient1 = new Patient();
		Doctor doctor1 = new Doctor();
		Appointment appointment1 = new Appointment();
		
		// Set patient details
		patient1.setPatientID("PA101");
		patient1.setPatientName("Emma");
		patient1.setDateOfBirth("25.05.1997");
		
		// Set doctor details
		doctor1.setDoctorID("DO101");
		doctor1.setDoctorName("Dr. Vitaliia");
		doctor1.setSpecialization("Urology");
		
		// Set appointment details
		appointment1.setDate("08.09.2023");
		appointment1.setDoctor(doctor1);
		appointment1.setPatient(patient1);
		appointment1.setTime("16.00");
		
		hospital.addDoctor(doctor1);
		hospital.addDoctor(doctor1);
		hospital.addPatient(patient1);
		hospital.addPatient(patient1);
		hospital.scheduleAppointment(appointment1);
		
		hospital.displayInfo();
	}
}
