package ua.it.i_f.avia;

public class Su27 extends  Fly implements SpecialPower {

private int MaxSpeed;
private String Color;

public Su27(int length, int width, int weight, int MaxSpeed, String Color) {
	super(length, width, weight);
	this.MaxSpeed=MaxSpeed;
	this.Color=Color;
}

	@Override
	public void TurboAcceleration() {
		System.out.println("����������� �� �������� "+(MaxSpeed+Math.round(100+Math.random()*200))+" ��/���");
		
	}

	@Override
	public void Stealth() {
	System.out.println("˳���� �� ���� ����� �� ������ "+Math.round(Math.random()*20)+" ������");	
		
	}

	@Override
	public void NuclearStrike() {
		System.out.println("���� ������� "+Math.round(1+Math.random()*9)+" ���������");

		
	}

}
