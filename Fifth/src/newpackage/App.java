package newpackage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal("Lion", 50.8, 10);
		System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини=" + a.getSpeed()
				+ " км/год, Вік тварини=" + a.getAge() + " років");
		a.setAge(14);
		a.setName("Bull");
		a.setSpeed(2);
		System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини=" + a.getSpeed()
				+ " км/год, Вік тварини=" + a.getAge() + " років");
	}

}
