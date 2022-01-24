package q1;

class Mythread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
	
}
public class Thread1 {
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
	}
}
