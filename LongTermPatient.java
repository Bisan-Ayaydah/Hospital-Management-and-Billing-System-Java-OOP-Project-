package proj;

import java.util.*;

public class LongTermPatient extends PatientBase {
	private int daysAdmitted;
	private double dailyRate;

	public LongTermPatient() {
		super();
		this.daysAdmitted = 0;
		this.dailyRate = 0.0;
	}

	public LongTermPatient(int daysAdmitted, double dailyRate, String patientId, String name, int age,
			String medicalHistory, Department department, ArrayList<HospitalService> service) {
		super(patientId, name, age, medicalHistory, department, service);
		this.daysAdmitted = daysAdmitted;
		this.dailyRate = dailyRate;
	}

	public int getDaysAdmitted() {
		return daysAdmitted;
	}

	public void setDaysAdmitted(int daysAdmitted) {
		this.daysAdmitted = daysAdmitted;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	@Override
	public double calculateBill() {
		double totalServiceCost = 0.0;

		ArrayList<HospitalService> services = getService();
		for (int i = 0; i < services.size(); i++) {
			HospitalService Hservice = services.get(i);
			totalServiceCost += Hservice.getServiceCost();
		}
		return daysAdmitted * dailyRate + totalServiceCost * (1 + TAX_RATE);
	}

}
