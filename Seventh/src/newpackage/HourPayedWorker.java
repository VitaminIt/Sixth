package newpackage;

public class HourPayedWorker implements Salary{
	private int moneyPerHour;
	private int workDays;
	
	
	public HourPayedWorker(int moneyPerHour, int workDays) {
		super();
		this.moneyPerHour = moneyPerHour;
		this.workDays = workDays;
	}


	public int getMoneyPerHour() {
		return moneyPerHour;
	}


	public void setMoneyPerHour(int moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}


	public int getWorkDays() {
		return workDays;
	}


	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}


	@Override
	public void salary() {
		int salary=getMoneyPerHour()*8*getWorkDays();
		System.out.println("Зарплата працівника в місяць становить "+ salary);
		
	}

}
