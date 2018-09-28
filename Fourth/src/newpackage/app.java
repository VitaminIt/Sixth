package newpackage;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wheel w=new Wheel("Toto",17);
		Body b=new Body("Sedan", "Yellow", 4);
		Car c=new Car("BMW","X5",2010,b, 
				w, new SteeringWheel("Sport",10.5));
		
		System.out.println(c);
			
	b.setAnotherType(2);
	System.out.println(c);
	System.out.println(c.getAnotherSize(2));
	System.out.println(c.getAnotherDiameter(2));
	System.out.println(c.getNewYear(c.getYear()));
	c.setAnotherMakeAndModel("Audi", "Q7");
	System.out.println(c);
	}

}
