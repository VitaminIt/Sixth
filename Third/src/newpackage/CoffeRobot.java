package newpackage;

public class CoffeRobot extends Robot {

	CoffeRobot() {

		this.name = "CoffeRobot";

	}

	@Override
	public String work() {
		return "я " + CoffeRobot.this.name + " Ц € варю каву";
	}

}
