//name Bisan Ismael Ayayda
//ID 1231232
//lecture sec 3
//lab sec 4

package proj;

import java.util.*;

public class Department {
	private String departmentId;
	private String name;
	private ArrayList<Doctor> doctors;
	private ArrayList<PatientBase> patients;

	public Department() {
		super();
		this.departmentId = "null";
		this.name = "null";
		this.doctors = new ArrayList<>();
		this.patients = new ArrayList<>();
	}

	public Department(String departmentId, String name, ArrayList<Doctor> doctors, ArrayList<PatientBase> patients) {
		super();
		this.departmentId = departmentId;
		this.name = name;
		this.doctors = doctors;
		this.patients = patients;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public ArrayList<PatientBase> getPatients() {
		return patients;
	}

	public void setP(ArrayList<PatientBase> patients) {
		this.patients = patients;
	}

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public void addPatient(PatientBase patient) {
		patients.add(patient);
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", name=" + name + ", doctors=" + doctors + ", patients="
				+ patients + "]";
	}

}
