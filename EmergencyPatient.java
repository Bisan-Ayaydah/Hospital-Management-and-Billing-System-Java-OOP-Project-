package proj;

import java.util.*;

public class EmergencyPatient extends PatientBase{
	private double emergencyFees;
	
	
	public EmergencyPatient() {
		super();
		this.emergencyFees = 0.0;
	}
	
	public EmergencyPatient(double emergencyFees, String patientId, String name, int age, String medicalHistory,
			Department department, ArrayList<HospitalService> service) {
		super(patientId, name, age, medicalHistory,department,service);
		this.emergencyFees = emergencyFees;
	}

public double getEmergencyFees() {
		return emergencyFees;
	}

	public void setEmergencyFees(double emergencyFees) {
		this.emergencyFees = emergencyFees;
	}

public  double calculateBill()
{
	double totalServiceCost=0.0;
	ArrayList<HospitalService> services = getService();
	for (int i = 0; i < services.size(); i++) 
	{ 
	HospitalService Hservice = services.get(i);
	totalServiceCost += Hservice.getServiceCost();
	}
	return emergencyFees + totalServiceCost * (1 + TAX_RATE);}

}
