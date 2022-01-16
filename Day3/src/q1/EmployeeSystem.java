package q1;

import java.util.ArrayList;
import java.util.Scanner;

class EmployeeSystem {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int empId;
		String name;
		
		ArrayList<Employee> employee= new ArrayList<Employee>(3);
	 
	
		SalariedEmployee se=new SalariedEmployee(1234,"Abhijeet",8000.00,4);
		HourlyEmployee he=new HourlyEmployee(1235,"Amar",600.00,50);
		CommissionEmployee ce=new CommissionEmployee(1236,"Rohit",6.0,12000);
				
        employee.add(se);
        
        employee.add(he);
        
        employee.add(ce);
        
        for(Employee temp:employee)
        {
        	System.out.println("Employee id: "+temp.getEmployeeId());
        	System.out.println("Employee name "+temp.getEmpname());
        	System.out.println("Employee Salary "+temp.getEmployeeRate());
        	
        	System.out.println("Want to increase the Weekly rate? y for yes");
        	char ch=scanner.next().charAt(0);
        	if(ch=='y') {
        		temp.setEmployeeRate(5);
        	}
        }  
	}
}