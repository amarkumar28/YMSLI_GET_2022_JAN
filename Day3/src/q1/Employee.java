package q1;

abstract class Employee {
	private int employeeId;
	private String empname;

	public abstract double getEmployeeRate();
	public abstract void setEmployeeRate(double incrementInterest);
	public Employee(int employeeId, String empname) {

		this.employeeId = employeeId;
		this.empname = empname;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmpname() {
		return empname;
	}
}