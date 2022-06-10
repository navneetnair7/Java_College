import java.util.*;

class Date{
	int year, month, date, hrs, min, sec;
	Date(){
		year = 2000;
		month = 1;
		date = 1;
		hrs = 00;
		min = 00;
		sec = 00;
	}
	void setDate(int year, int month, int min){
		this.year = year;
		this.month = month;
		this.date = date;
	}
	void setDate(int year, int month, int date, int hrs, int min){
		this.year = year;
		this.month = month;
		this.date = date;
		this.hrs = hrs;
		this.month = month;
		
	}
	void setDate(int year, int month, int date, int hrs, int min, int sec){
		this.year = year;
		this.month = month;
		this.date = date;
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	void displayDate(){
		System.out.println(this.month + " " + this.date + ", " + this.year + ", " + this.hrs + ":" + this.min + ":" + this.sec);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date type(1, 2, 3)- ");
		int n = sc.nextInt();
		Date d = new Date();
		if(n == 1){
			System.out.println("Enter year, month and date: ");
			int y = sc.nextInt();
			int m = sc.nextInt();
			int da = sc.nextInt();
			d.setDate(y, m, da);
			d.displayDate();
		}
		else if(n == 2){
			System.out.println("Enter year, month and date: ");
			int y = sc.nextInt();
			int m = sc.nextInt();
			int da = sc.nextInt();
			int h = sc.nextInt();
			int mi = sc.nextInt();
			d.setDate(y, m, da, h, mi);
			d.displayDate();
		}		
		else if(n == 3){
			System.out.println("Enter year, month and date: ");
			int y = sc.nextInt();
			int m = sc.nextInt();
			int da = sc.nextInt();
			int h = sc.nextInt();
			int mi = sc.nextInt();
			int s = sc.nextInt();
			d.setDate(y, m, da, h, mi, s);
			d.displayDate();
		}
	}
}
