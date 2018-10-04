package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
private double x;
private double y;
private double result;
public MyCalculator(double x, double y) {
	super();
	this.x = x;
	this.y = y;
}


public void setResult(double result) {
	this.result = result;
}


public double getResult() {
	return result;
}


public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
@Override
public void divide() {
	Numerable.super.divide();
	if (y==0) {
		System.out.println("На нуль ділити ніззя"); 
	} else {
		double result=x/y;
		setResult(result);
		System.out.printf("Частка чисел " + getX()+" та "+ getY()+ " дорівнює "+ "%.2f%n", getResult());

	}
	}
@Override
public void multiply() {
	Numerable.super.multiply();
	double result=x*y;
	setResult(result);
	System.out.printf("Добуток чисел " + getX()+" та "+ getY()+ " дорівнює "+ "%.2f%n", getResult());
}
@Override
public void minus() {
	Numerable.super.minus();
	double result=x-y;
	setResult(result);
	System.out.printf("Різниця чисел " + getX()+" та "+ getY()+ " дорівнює "+ "%.2f%n", getResult());
}
@Override
public void plus() {
	Numerable.super.plus();
	double result=x+y;
	setResult(result);
	System.out.printf("Сума чисел " + getX()+" та "+ getY()+ " дорівнює "+ "%.2f%n", getResult());
}

public static void main(String[] args) {
	MyCalculator calc=new MyCalculator(2, 0);
	calc.plus();
	calc.minus();
	calc.multiply();
	calc.divide();
}
}
