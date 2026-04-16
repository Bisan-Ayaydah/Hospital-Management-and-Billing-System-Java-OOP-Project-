package proj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {
	//method of sorting doctor array list based on doctor salary
    public static void sortDoctorsBySalary(ArrayList<Doctor> doctors) {
    	Collections.sort(doctors);
    	
    }

   // calculate sum of all patient's bills
    public static double calculateTotalPatientsBill(ArrayList<PatientBase> patients) {
        double totalBill = 0.0;
        for (int i = 0; i < patients.size(); i++) {
            totalBill += patients.get(i).calculateBill();
        }
        return totalBill;
    }
    //such printing patient's Info...
    public static void generateBill(PatientBase patient) {
        System.out.printf("Patient ID: %s, Name: %s, Total Bill: %.2f%n", patient.getPatientId(), patient.getName(), patient.calculateBill());
    }

    public static void main(String[] args) {

    	
    	Department cardiology = new Department("Q1", "Cardiology", null, null);
		Department internal = new Department("Q9", "Internal", new ArrayList<>(), new ArrayList<>());
		Department operations = new Department("Q2", "Operations", new ArrayList<>(), new ArrayList<>());


        EmergencyPatient ep1 = new EmergencyPatient(500.0, "123", "Sameer", 30, "Blood pressure", cardiology, new ArrayList<>());
        EmergencyPatient ep2 = new EmergencyPatient(150.0, "124", "Hamed", 40, "Diabetes", operations, new ArrayList<>());
        LongTermPatient lp = new LongTermPatient(3, 200.0, "125", "Hanadi", 50, "", internal, new ArrayList<>());

        ArrayList<PatientBase> p = new ArrayList<>();
        p.add(ep1);
        p.add(ep2);
        p.add(lp);

       
        ArrayList<Doctor> doctor = new ArrayList<>();
        doctor.add(new Doctor("441", "Motaz", "Cardiologist", "Master", 10000, 4, 20, cardiology));
        doctor.add(new Doctor("580", "Leen", "Internist", "Bachelor", 7000, 3, 15, internal));
   

        ArrayList<HospitalService> h1 = new ArrayList<>();
        h1.add(new HospitalService("X_ray", 400.0, ep1));
        
        ArrayList<HospitalService> h2 = new ArrayList<>();
        h2.add(new HospitalService("Lab Tests", 200.0, ep2));
        
        ArrayList<HospitalService> h3 = new ArrayList<>();
        h3.add(new HospitalService("CT_scan", 350.0, lp));

        ep1.setService(h1);
        ep2.setService(h2);
        lp.setService(h3);

        generateBill(lp);

        p.sort(Comparator.comparingDouble(PatientBase::calculateBill));

        sortDoctorsBySalary(doctor);

        System.out.println("Sorted Doctors by Salary:");
        for (Doctor d : doctor) {
            System.out.println(d.getDepartment().getName() + ": " + d.calculateSalary());
        }

        System.out.println("Sorted Patients by Bill Amount:");
        for (PatientBase patient : p) {
            System.out.println("Name : "+patient.getName() + "/ Age: " + patient.getAge());
        }

        double totalBill = calculateTotalPatientsBill(p);
        System.out.println("Total sum of all patients'bills: " + totalBill);
    }
}
