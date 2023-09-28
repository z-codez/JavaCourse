package package3;

import java.util.Objects;

public class Doctor {
	
	private String doctorID;
	
	private String doctorName;
	
	private String specialization;

	public String getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public void displayInfo() {
		System.out.println("\nDoctor info:");
		System.out.println("Doctor name: " + this.doctorName);
		System.out.println("Doctor ID: " + this.doctorID);
		System.out.println("Specialization: " + this.specialization);
	}

	@Override
	public int hashCode() {
		return Objects.hash(doctorID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return Objects.equals(doctorID, other.doctorID);
	}
	
}
