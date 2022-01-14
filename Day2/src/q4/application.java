package q4;

public class application {
	public static void main(String[] args) {
		Student student1=new Student(1500);
		student1.display();
		Student student2=new Student(1500, "amar");
		student2.display();
		Student student3=new Student(1500, "amar" , 90);
		student3.display();
		student3.display(1998);
	}
}
