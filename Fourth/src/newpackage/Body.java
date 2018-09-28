package newpackage;

public class Body {
private String type;
private String color;
private int numberOfDoor;

Body(String type, String color, int numberOfDoor) {
	this.type=type;
	this.color=color;
	this.numberOfDoor=numberOfDoor;
	
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getNumberOfDoor() {
	return numberOfDoor;
}
public void setNumberOfDoor(int numberOfDoor) {
	this.numberOfDoor = numberOfDoor;
}

public void setAnotherType(int numberOfDoor) {
	if (numberOfDoor==2) {this.type="Coupe";
	this.numberOfDoor=2;
	}
	else if (numberOfDoor==4)  {this.type="Sedan";
	this.numberOfDoor=4;
	}
	else if (numberOfDoor==5) {this.type="Caravan";
	this.numberOfDoor=5;
	}
	
}

@Override
public String toString() {
	return "Body [type=" + type + ", color=" + color + ", numberOfDoor=" + numberOfDoor + "]";
}


}
