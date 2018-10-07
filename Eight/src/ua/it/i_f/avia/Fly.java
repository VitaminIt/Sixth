package ua.it.i_f.avia;

public abstract class Fly extends FlyDirections {
private int length;
private int width;
private int weight;

	public Fly(int length, int width, int weight) {
	super();
	this.length = length;
	this.width = width;
	this.weight = weight;
}
	void StartEngine() {
		System.out.println("До готовності залишилось "+Math.round(20+Math.random()*68)+" секунд");
	}
	void StartFly() {
		System.out.println("Палива вистачить на "+Math.round(Math.random()*1000)+" кілометрів польоту");

	}
	void FinishFly() {
		System.out.println("Літак іде на посадку");

	}
}
