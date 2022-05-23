class Time{
	int hour;
	int min;
	int sec;
	int total;
	void init(int x, int y, int z){
		hour = x;
		min = y;
		sec = z;
	}
	void calc(){
		total = (hour * 3600 + min * 60 + sec);
	}
	void display(){
		System.out.println("The total seconds are: " + total);
	}
}

class TimeRev{
	int totalRev;
	int hourRev;
	int minRev;
	int secRev;
	void initRev(int x){
		totalRev = x;
	}
	void calcRev(){
		hourRev = totalRev / 3600;
		totalRev = totalRev % 3600;
		minRev = totalRev / 60;
		secRev = totalRev % 60;
	}
	void displayRev(){
		System.out.println(hourRev + " Hours " + minRev + " Minutes " + secRev + " Seconds");
	}
	public static void main(String args[]){
		Time t1 = new Time();
		t1.init(2, 3, 4);
		t1.calc();
		t1.display();
		TimeRev t2 = new TimeRev();
		t2.initRev(7384);
		t2.calcRev();
		t2.displayRev();
	}
}
