package newpackage;

public class Car {
private String make;
private String model;
private int year;
private Body body;
private Wheel wheel;
private SteeringWheel sw;
public Car(String make, String model, int year, Body body, Wheel wheel, SteeringWheel sw) {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
	this.body = body;
	this.wheel = wheel;
	this.sw = sw;
}

public int getNewYear(int year ) {
	return year+1;
}
public void setAnotherMakeAndModel(String make, String model) {
	this.make = make;
	this.model = model;
}

public double getAnotherSize(int i) {
	return wheel.getAnotherSize(i);
}
public double getAnotherDiameter(int r) {
	return sw.getChangedDiameter(r);
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public Body getBody() {
	return body;
}
public void setBody(Body body) {
	this.body = body;
}
public Wheel getWheel() {
	return wheel;
}
public void setWheel(Wheel wheel) {
	this.wheel = wheel;
}
public SteeringWheel getSw() {
	return sw;
}
public void setSw(SteeringWheel sw) {
	this.sw = sw;
}
@Override
public String toString() {
	return "Car [make=" + make + ", model=" + model + ", year=" + year + ", body=" + body + ", wheel=" + wheel + ", sw="
			+ sw + "]";
}


}
