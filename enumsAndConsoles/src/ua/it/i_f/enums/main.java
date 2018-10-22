package ua.it.i_f.enums;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
Months [] M=Months.values();
Scanner S=new Scanner(System.in);
boolean b=true;
while(b) {
	app.menu();
	switch (S.next()) {
	case "1": {
		System.out.println("Enter the month");
		Scanner S1=new Scanner(System.in);
		for (Months m:M) {
			if (m.name().equals(S1.next().toUpperCase())) {
				System.out.println("owrait"); break;
				} else	System.out.println("no!"); break;
			
		}
		
	}
	case "2": {
		System.out.println("Enter the month");
		Scanner S1=new Scanner(System.in);
		String same =S1.next().toUpperCase();
		for (Months m:M) {	
			Months m1 = m.valueOf(same);
			if(m1.season.name()==m.season.name())
			System.out.println(m.name());
			}
		break;
	}
	case "3": {
			for (Months m:M) {	
			if(m.Days<31)
			System.out.println(m.name());
			}
		break;
	}
	case "4": {
		for (Months m:M) {	
		if(m.Days==31)
		System.out.println(m.name());
		}
	break;
}
	case "5": {
		System.out.println("Enter the month");
		Scanner S1=new Scanner(System.in);
		String same =S1.next().toUpperCase();
		Months m=Months.valueOf(same);
		int numb=m.ordinal();
		if (numb==(M.length-1)) {
			numb=0;
			System.out.println(M[numb]);
		} else
		System.out.println(M[numb+1]);
		} break;
	case "6": {
		System.out.println("Enter the month");
		Scanner S1=new Scanner(System.in);
		String same =S1.next().toUpperCase();
		Months m=Months.valueOf(same);
		int numb=m.ordinal();
		if (numb==0) {
			numb=M.length-1;
			System.out.println(M[numb]);
		} else
		System.out.println(M[numb-1]);
		} break;
	case "7": {
		for (Months m:M) {	
		if(m.Days%2==0)
		System.out.println(m.name());
		}break;
	}
	case "8": {
		for (Months m:M) {	
		if(m.Days%2==1)
		System.out.println(m.name());
		}
	break;
}
	case "9": {
		System.out.println("Enter the month");
		Scanner S1=new Scanner(System.in);
		String same =S1.next().toUpperCase();
			
			Months m1 = Months.valueOf(same);
			if(m1.Days%2==0)
			System.out.println("ODD"); else System.out.println("EVEN");
			
		break;
	}
	case "0": { 
			b=false;
	}break;
	
	case "10" : {
		System.out.println("Enter the integer number");
		Scanner S1=new Scanner(System.in);
		double I=S1.nextDouble();
		if (I%1==0) {
			if (I%2==0) System.out.println("ODD"); else System.out.println("EVEN");
			} else System.out.println("Your number is not an integer"); 
	}break;
	case "11" : {
		System.out.println("Enter the integer number ¹1");
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter the integer number ¹2");
		Scanner S2=new Scanner(System.in);
		double I1=S1.nextDouble();
		double I2=S2.nextDouble();

		if (I1%1==0||I2%1==0) {
			System.out.println("Sum of "+I1+ " and "+I2+" is "+ (I1+I2)); 
			} else System.out.println("Your number is not an integer"); 
	}break;
	}
}
	}	
}


	
	

