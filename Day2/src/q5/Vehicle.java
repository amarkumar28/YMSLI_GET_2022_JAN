package q5;

public class Vehicle {
	private int noOfWheel;
	private int noOfPassenger;
	private int model;
	private String make;
	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}
	Vehicle(){}
	public int getNoOfWheel() {
		return noOfWheel;
	}
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
	public int getModel() {
		return model;
	}
	public String getMake() {
		return make;
	}
	public void display() {
		System.out.println("Make :" + make + " , Model : " + model + " , No, of wheels : " + noOfWheel + " , Number of passengers : " + noOfPassenger);
	}
}
