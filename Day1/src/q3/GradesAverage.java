package q3;
import java.util.Scanner;
public class GradesAverage {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents=scanner.nextInt();
		int grades[]=new int[numStudents];
		int i=0,sum=0;
		while(i<numStudents) {
			System.out.print("Enter the grade for student " + (i+1) +": ");
			grades[i]=scanner.nextInt();
			if(grades[i]>0 && grades[i]<100) {
				sum+=grades[i];
			}else {
				System.out.println("Invalid grade, try again..");
			}
		}
		System.out.println("The average is :" + (double)sum/numStudents);
	}
}
