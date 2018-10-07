package ua.it.i_f.avia;

public class FlyDirections {
void Up() {
	//for (int i=1;i<20;i++)
	System.out.println("Злетіти вверх на "+Math.round(Math.random()*100)+ " метрів"); 
}
void Down() {
	System.out.println("Опуститись вниз на "+Math.round(Math.random()*100)+ " метрів"); 
	}
void Left() {
	System.out.println("Повернути вліво на "+Math.round(Math.random()*100)+ " метрів");
}
void Right() {
	System.out.println("Повернути вправо на "+Math.round(Math.random()*100)+ " метрів");
}



 
}
