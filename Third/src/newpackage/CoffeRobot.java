package newpackage;

public class CoffeRobot extends Robot {

	CoffeRobot() {

		this.name = "CoffeRobot";

	}

	@Override
	public String work() {
		return "� " + CoffeRobot.this.name + " � � ���� ����";
	}

}
