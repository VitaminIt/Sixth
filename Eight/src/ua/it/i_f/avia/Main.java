package ua.it.i_f.avia;

public class Main {

	public static void main(String[] args) {
		Su27 s=new Su27(15,10,15,2500,"Gray");
		s.StartEngine();
		s.StartFly();
		s.Up();
		s.Down();
		s.Left();
		s.Right();
		s.Stealth();
		s.NuclearStrike();
		s.TurboAcceleration();
		s.FinishFly();

	}

}
