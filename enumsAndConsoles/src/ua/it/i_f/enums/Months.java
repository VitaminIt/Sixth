package ua.it.i_f.enums;

enum Months {
JAN(Seasons.WINTER,31), FEB(Seasons.WINTER,28), MAR(Seasons.SPRING,31), 
APR(Seasons.SPRING,30), MAY(Seasons.SPRING,31), JUN(Seasons.SUMMER,30), 
JUL(Seasons.SUMMER,31), AUG(Seasons.SUMMER,31), SEP(Seasons.AUTUMN,30),
OCT(Seasons.AUTUMN,31), NOV(Seasons.AUTUMN,30), DEC(Seasons.WINTER,31);
	Seasons season;
	int Days;
	
	Months(Seasons season, int day) {
		this.season=season;
		this.Days=day;
		
	}

	public Seasons getSeason() {
		return season;
	}

	public int getDays() {
		return Days;
	}
	
}
