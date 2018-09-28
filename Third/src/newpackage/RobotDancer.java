package newpackage;

public class RobotDancer extends Robot{
	RobotDancer() {

		this.name = "RobotDancer";

	}

	@Override
	public String work() {
		return "я " + RobotDancer.this.name + " Ц € просто танцюю";
	}
}
