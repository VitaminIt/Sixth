package newpackage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HourPayedWorker hpw=new HourPayedWorker(10, 22);
FixedWorker fw=new FixedWorker(22);
fw.salary();
hpw.salary();
	}

}
