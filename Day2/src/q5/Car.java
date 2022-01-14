package q5;

public class Car extends Vehicle{
	private int noOfDoor;
	public Car(int noOfWheel, int noOfPassenger, int model, String make,int noOfDoor) {
		super(noOfWheel,noOfPassenger,model,make);
		this.noOfDoor = noOfDoor;
	}
	Car(){}
	public int getNoOfDoor() {
		return noOfDoor;
	}
	
	public void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}
	public void display() {
		System.out.println("Make :" + this.getMake() + " , Model : " + this.getModel() + " , No. of doors : " + noOfDoor);
	}
}
