package newpackage;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibia frog = (Amphibia) new Frog(12,"Frog","Froggy");
		frog.eat();
		frog.sleep();
		frog.sweem();
		frog.walk();
		System.out.println(frog.getWeight());
		System.out.println(frog.getType());
		//System.out.println(frog);
	}

}
