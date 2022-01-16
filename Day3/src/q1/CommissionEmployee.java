package q1;

public class CommissionEmployee extends Employee{
	private double percentageOfSales;
	private int weeklySale;
	
	public CommissionEmployee(int employeeId, String empname,double percentageOfSales,int weeklySale) {
		super(employeeId, empname);
		this.percentageOfSales=percentageOfSales;
		this.weeklySale=weeklySale;
		
	}
	
	public double getEmployeeRate()
	{
		return percentageOfSales*weeklySale;
	}

	
	public double getPercentageOfSales() {
		return percentageOfSales;
	}

	public void setPercentageOfSales(double percentageOfSales) {
		this.percentageOfSales = percentageOfSales;
	}

	public void setEmployeeRate(double percentageOfSales)
	{
		this.weeklySale=(int) ((this.weeklySale*percentageOfSales)/100);
	}

	public double getPayment()
	{
		return this.getEmployeeRate();
	}
}
