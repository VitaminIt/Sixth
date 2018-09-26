package newpackage;

public class round {
private double radius;
private double diameter;
round (double radius) {
	this.radius=radius;
	this.diameter=2*radius;
}
public double getLenght() {
	return 2*3.14*radius;
}
public double getRadius () {
	return radius;
}
public double getDiameter () {
	return diameter;
}
public double getSquare () {
	return 3.14*diameter*diameter/4;
}
}
