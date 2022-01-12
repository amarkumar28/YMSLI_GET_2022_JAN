package q1;

//Q1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where 
//F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
//The first 20 Fibonacci numbers are:
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//The average is 885.5

public class Fibonacci {
	public static void main(String[] args) {
		int sum=fibo(20);
		System.out.println("\nAverage is : " + (double)sum/20);
	}
	public static int fibo(int n) {
		int i=2,sum=2;
		int a=1,b=1;
		System.out.print(a + " " + b + " ");
		while(i<n) {
			int c=a+b;
			sum+=c;
			System.out.print(c + " ");
			a=b;
			b=c;
			i++;
		}
		return sum;
	}
}
