package q2;

import java.util.ArrayList;
import java.util.Random;

class Mythread implements Runnable{
	private ArrayList<Integer> num=new ArrayList<Integer>();
	
	public ArrayList<Integer> getNum() {
		return num;
	}

	@Override
	public void run() {
		Random random = new Random();  
		int x=random.nextInt(10)+1;
		num.add(x);
		System.out.println(Thread.currentThread().getName() + " number : " + x);
		
	}
	
}
public class Thread2 {
	public static void main(String[] args) {
		Mythread mythread=new Mythread();
		Thread thread1=new Thread(mythread,"thread1");
		Thread thread2=new Thread(mythread,"thread2");
		Thread thread3=new Thread(mythread,"thread3");
		Thread thread4=new Thread(mythread,"thread4");
		Thread thread5=new Thread(mythread,"thread5");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();	
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		ArrayList<Integer> numbers=mythread.getNum();
		printSum(numbers);
	}

	private static void printSum(ArrayList<Integer> numbers) {
		int sum=0;
		for(Integer tempInt:numbers) {
			sum+=tempInt;
		}
		System.out.println("Sum = " + sum);
	}
}
