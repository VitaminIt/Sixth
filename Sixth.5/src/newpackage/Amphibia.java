package newpackage;

public class Amphibia {
private int weight;
private String type;


public Amphibia(int weight, String type) {
	super();
	this.weight = weight;
	this.type = type;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}


@Override
public String toString() {
	return "Amphibia [weight=" + weight + ", type=" + type + "]";
}
void eat() {
	System.out.println("i'm eating");
}
void sleep() {
	System.out.println("i'm sleeping");
}
void sweem() {
	System.out.println("i'm sweeming");
}
void walk() {
	System.out.println("i'm walking");
}

}
