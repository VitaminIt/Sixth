package newpackage;

public class Wheel {
private String brand;
private double size;

Wheel(String brand, double size ) {
	this.brand=brand;
	this.size=size;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}

public double getAnotherSize(int i) {
	return size*i;
}
@Override
public String toString() {
	return "Wheel [brand=" + brand + ", size=" + size + "]";
}


}
