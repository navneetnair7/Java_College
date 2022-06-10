import java.util.*;

class Line{
	static double m;
	static int y;
	static int x1, x2, y1, y2;
	Line(double m, int c){
		this.m = m;
		y = c;
		System.out.println("The equation of the line is y = " + m + "x" + " + " + y);
	}
	Line(double m, int x1, int y1){
		this.m = m;
		this.x1 = x1;
		this.y1 = y1;
		System.out.println("The equation of the line is y - " + y1 + " = " + m + "( x - " + x1 + ")");
	}
	Line(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		m = (y2 - y1) / (x2 - x1);
		System.out.println("The equation of the line is y - " + y1 + " / " + (y2 - y1) + " = (x - " + x1 + ")/" + (x1 - x2));
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("What form of line equation do you want?\n 1. Slope-Intercept form \n 2. Slope point form\n 3. Two point form");
		int n = sc.nextInt();
		if(n == 1){
			System.out.println("Enter slope and intercept: ");
			m = sc.nextDouble();
			y = sc.nextInt();
			Line f1 = new Line(m, y);
		}
		else if(n == 2){
			System.out.println("Enter slope and coordinates of the point: ");
			m = sc.nextDouble();
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			Line f2 = new Line(m, x1, y1);
		}
		else if(n == 3){
			System.out.println("Enter coordinates of the two points: ");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			Line f3 = new Line(x1, y1, x2, y2);
		}
		else{
			System.out.println("No such option.");
		}
	}
}
