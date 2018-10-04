package newpackage;

public class FixedWorker implements Salary{
private int workDays;

public FixedWorker(int workDays) {
	super();
	this.workDays = workDays;
}

public int getWorkDays() {
	return workDays;
}

@Override
public void salary() {
	int salary = getWorkDays()*50;
	System.out.println("Зарплата працівника в місяць становить "+salary);
	
}

}
