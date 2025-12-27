//name Bisan Ismael Ayayda
//ID 1231232
//lecture sec 3
//lab sec 4
package proj;

import java.util.*;

public abstract class PatientBase implements Billable, Comparable<PatientBase>{
	
private String patientId;
private String name;
private int age;
private String medicalHistory;
private Department department;
private ArrayList <HospitalService> service ;



public PatientBase() {
	super();
	patientId = "null";
	this.name ="null";
	this.age = 0;
	this.medicalHistory = "null";
	this.department=null ;
	this.service =null;
}



public PatientBase(String patientId, String name, int age, String medicalHistory, Department department,
		ArrayList<HospitalService> service) {
	super();
	this.patientId = patientId;
	this.name = name;
	this.age = age;
	this.medicalHistory = medicalHistory;
	this.department = department;
	this.service = service;
}




public String getPatientId() {
	return patientId;
}
public void setPatientId(String patientId) {
	this.patientId = patientId;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getMedicalHistory() {
	return medicalHistory;
}

public void setMedicalHistory(String medicalHistory) {
	this.medicalHistory = medicalHistory;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

public ArrayList<HospitalService> getService() {
	return service;
}

public void setService(ArrayList<HospitalService> service) {
	this.service = service;
}


@Override
public  abstract double calculateBill();//no implementation since it's 

@Override
public String toString() {
	return "PatientBase [PatientId=" + patientId + ", name=" + name + ", age=" + age + ", medicalHistory="
			+ medicalHistory + "]";
}
@Override
public  int compareTo(PatientBase p)
{
	return this.patientId.compareTo(p.patientId);
}

}
