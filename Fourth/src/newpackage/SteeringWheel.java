package newpackage;

public class SteeringWheel {
private String brand;
private double diameter;



public SteeringWheel(String brand, double diameter) {
	super();
	this.brand = brand;
	this.diameter = diameter;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getDiameter() {
	return diameter;
}
public void setDiameter(double diameter) {
	this.diameter = diameter;
}

public double getChangedDiameter(double r) {
	return diameter*r;
}
@Override
public String toString() {
	return "SteeringWheel [brand=" + brand + ", diameter=" + diameter + "]";
}


}
