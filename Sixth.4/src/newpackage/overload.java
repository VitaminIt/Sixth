package newpackage;

public class overload {
private int x;
private int y;
public overload(int x1) {
	this.x = x1;
}
public overload(int x1, int y2 ) {
	this(x1);
	this.y=y2*10;
	
}
@Override
public String toString() {
	return "overload [x=" + x + ", y=" + y + "]";
}

}
