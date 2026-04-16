package proj;

public class HospitalService {

private	String serviceName;
private	double serviceCost;
private	PatientBase patient;




public HospitalService() {
	super();
	this.serviceName = "null";
	this.serviceCost = 0.0;
	this.patient = null;
}
public HospitalService(String serviceName, double serviceCost, PatientBase patient) {
	super();
	this.serviceName = serviceName;
	this.serviceCost = serviceCost;
	this.patient = patient;
}




public String getServiceName() {
	return serviceName;
}




public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}




public double getServiceCost() {
	return serviceCost;
}




public void setSrviceCost(double srviceCost) {
	this.serviceCost = srviceCost;
}




public PatientBase getPatient() {
	return patient;
}




public void setPatient(PatientBase patient) {
	this.patient = patient;
}




@Override
public String toString() {
	return "HospitalService [serviceName=" + serviceName + ", serviceCost=" + serviceCost + ", patient=" + patient + "]";
}
	

}
