package newpackage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Robot r=new Robot();
System.out.println(r.work());

CoffeRobot cf=new CoffeRobot();
System.out.println(cf.work());

RobotDancer rd=new RobotDancer();
System.out.println(rd.work());

RobotCoocker rc=new RobotCoocker();
System.out.println(rc.work());

Robot[] r1= new Robot[4];
r1[0]=r;
r1[1]=cf;
r1[2]=rd;
r1[3]=rc;

for (int i=0; i< r1.length;i++) {
	System.out.println(r1[i].work());
}

	}

}
