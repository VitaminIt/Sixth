package newpackage;

public class rect {
private int lenght;
private int width;


rect () {
this.lenght=30;
this.width=40;
}
rect (int lenght, int width) {
	this.lenght=lenght;
	this.width=width;
}
public int getSquare() {
	return lenght*width;
}
public int getPerimeter() {
	return 2*(lenght+width);
}
}