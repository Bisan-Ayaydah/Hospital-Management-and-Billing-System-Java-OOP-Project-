package proj;

public class Doctor implements Comparable<Doctor> {
	private String doctorId;
	private String name;
	private String specialty;
	private String degree;
	private double baseSalary;
	private double overtimeHours;
	private double overtimeRate;
	private Department department;

	public Doctor() {
		super();
		this.doctorId = "null";
		this.name = "null";
		this.specialty = "null";
		this.degree = "null";
		this.baseSalary = 0.0;
		this.overtimeHours = 0.0;
		this.overtimeRate = 0.0;
		this.department = null;
	}

	public Doctor(String doctorId, String name, String specialty, String degree, double baseSalary,
			double overtimeHours, double overtimeRate, Department department) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.specialty = specialty;
		this.degree = degree;
		this.baseSalary = baseSalary;
		this.overtimeHours = overtimeHours;
		this.overtimeRate = overtimeRate;
		this.department = department;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public double getOvertimeRate() {
		return overtimeRate;
	}

	public void setOvertimeRate(double overtimeRate) {
		this.overtimeRate = overtimeRate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public double calculateSalary() {
		if (degree == "Bachelor")
			return baseSalary + 0.1 * baseSalary;
		else if (degree == "Master")
			return baseSalary + 0.2 * baseSalary;
		else
			return baseSalary + 0.3 * baseSalary;
	}

	public double calculateOverTime() {
		return overtimeHours * overtimeRate;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", name=" + name + ", specialty=" + specialty + ", degree=" + degree
				+ ", baseSalary=" + baseSalary + ", overtimeHours=" + overtimeHours + ", overtimeRate=" + overtimeRate
				+ "]";
	}

	@Override
	public int compareTo(Doctor d) {
		return (int)(this.calculateSalary()-d.calculateSalary());
	}

}
