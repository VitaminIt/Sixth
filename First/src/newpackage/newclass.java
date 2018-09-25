package newpackage;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class newclass {
public static void main(String[] args) {
	int a=1;
	byte b=2;
	short c=3;
	long d=4L;
	double e=5.0;
	float f=6L;
	char g=7;
	boolean h=true;
	Integer a1=a;
	Byte b1=b;
	Short c1=c;
	Long d1=d;
	Double e1=e;
	Float f1=f;
	Character g1=g;
	Boolean h1=h;
	System.out.println(a1.MIN_VALUE);
	System.out.println(a1.MAX_VALUE);
	System.out.println(b1.MIN_VALUE);
	System.out.println(b1.MAX_VALUE);
	System.out.println(c1.MIN_VALUE);
	System.out.println(c1.MAX_VALUE);
	System.out.println(d1.MIN_VALUE);
	System.out.println(d1.MAX_VALUE);
	System.out.println(e1.MIN_VALUE);
	System.out.println(e1.MAX_VALUE);
	System.out.println(f1.MIN_VALUE);
	System.out.println(f1.MAX_VALUE);
	System.out.println(g1.MIN_VALUE);
	System.out.println(g1.MAX_VALUE);
	
		int[] arr = new int[10];
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++)
			arr[i] = -i;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("MAX= " + max);
		System.out.println("MIN= " + min);

}
}
