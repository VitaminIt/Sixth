package newpackage;

public class RobotCoocker extends Robot {
	RobotCoocker() {

		this.name = "RobotCoocker";

	}

	@Override
	public String work() {
		return "� " + RobotCoocker.this.name + " � � ������ �����";
	}
}
