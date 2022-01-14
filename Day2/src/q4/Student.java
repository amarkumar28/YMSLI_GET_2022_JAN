package q4;

public class Student {
	private int id;
	private String name;
	private int grade;
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	
	public void display() {
		System.out.println("Id :" + id + " , Name : " + name + " , Grade : "+grade);
	}
	public void display(int year) {
		this.display();
		System.out.println("Year" + year);
	}
}
