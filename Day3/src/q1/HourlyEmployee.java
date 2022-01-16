package q1;

public class HourlyEmployee extends Employee{
	private double hourlyRate;
	private int numberOfHoursWeek;
	
	public HourlyEmployee(int employeeId, String empname,double hourlyRate,int numberOfHoursWeek) {
		super(employeeId, empname);
		this.hourlyRate=hourlyRate;
		this.numberOfHoursWeek=numberOfHoursWeek;
	}
	
	public double getEmployeeRate()
	{
		return hourlyRate*numberOfHoursWeek;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public void setEmployeeRate(double incrementInterest)
	{
		this.hourlyRate=this.hourlyRate+((this.getHourlyRate()*incrementInterest)/100);
	}
}
