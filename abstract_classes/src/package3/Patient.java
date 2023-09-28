package package3;

import java.util.Objects;

public class Patient {
	
	private String patientID;
	
	private String patientName;
	
	private String dateOfBirth;

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public void displayInfo() {
		System.out.println("\nPatient info:");
		System.out.println("Patient name: " + this.patientName);
		System.out.println("Patient ID: " + this.patientID);
		System.out.println("Date of birth: " + this.dateOfBirth);
	}

	@Override
	public int hashCode() {
		return Objects.hash(patientID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(patientID, other.patientID);
	}
}
