package q1;

public class SalariedEmployee extends Employee{
	private double weeklyRate;
	private int numberOfWeek;

	public SalariedEmployee(int employeeId, String empname, double weeklyRate,int numberOfWeek) {
		super(employeeId, empname);
		this.weeklyRate=weeklyRate;
		this.numberOfWeek=numberOfWeek;
	}

	public double getWeeklyRate() {
		return weeklyRate;
	}

	public void setWeeklyRate(double weeklyRate) {
		this.weeklyRate = weeklyRate;
	}

	public void setEmployeeRate(double incrementInterest)
	{
		this.weeklyRate=this.weeklyRate+((this.getWeeklyRate()*incrementInterest)/100);
	}

	public double getEmployeeRate()
	{
		return weeklyRate*numberOfWeek;
	}
}
