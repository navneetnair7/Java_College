import java.util.*;
class Cricketer{
	String player_name;
	int run_hit;
	int innings_count;
	int not_out_count;
	double batting_avg;
	
	static void get_avg(Cricketer c){
		c.batting_avg = c.run_hit / c.innings_count;
		System.out.println("The average is- " + c.batting_avg);
	}
	
	static void asc(Cricketer [] c){
		for(int i = 0; i < 10; i ++){
			for(int j = i; j < 11; j ++){
				if(c[i].batting_avg > c[j].batting_avg){
					Cricketer temp = new Cricketer();
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		
		System.out.println("The Stats in the ascending order are- ");
		for(int j = 0; j < 11; j ++){
			System.out.println("Name- " + c[j].player_name);
			System.out.println("Run hit- " + c[j].run_hit);
			System.out.println("Innings count- " + c[j].innings_count);
			System.out.println("Not out count- " + c[j].not_out_count);
			System.out.println("Batting average- " + c[j].batting_avg);
		}
	}
	
	static class Zero extends Exception{
		Zero(String s){
			System.out.println(s);
		}
	}
	
	static class LowAverage extends Exception{
		LowAverage(String s){
			System.out.println(s);
		}
	}
	
	public static void main(String args[]) throws LowAverage, Zero{
		Scanner sc = new Scanner(System.in);
		Cricketer c[] = new Cricketer[11];
		for(int i = 0; i < 11; i ++){
			c[i] = new Cricketer();
			System.out.println("Enter the player name of the " + (i + 1) + "th player: ");
			c[i].player_name = sc.nextLine();
			System.out.println("Enter the run hit by the " + (i + 1) + "th player: ");
			try{
				c[i].run_hit = sc.nextInt();
			}
			catch(NumberFormatException e){
				e.getMessage();
				System.out.println("Default value is 1");
				c[i].run_hit = 1;
			}
			System.out.println("Enter the innings played by the " + (i + 1) + "th player: ");
			try{
				c[i].innings_count = sc.nextInt();
				if(c[i].innings_count == 0){
					throw new Zero("Cannot be 0");
				}
			}
			catch(NumberFormatException e){
				e.getMessage();
				System.out.println("Default value is 1");
				c[i].innings_count = 1;
			}
			System.out.println("Enter the not out count of the " + (i + 1) + "th player: ");
			try{
				c[i].not_out_count = sc.nextInt();
			}
			catch(NumberFormatException e){
				e.getMessage();
				System.out.println("Defaule value is 1");
				c[i].not_out_count = 1;
			}
			sc.nextLine();
		}
		for(int i = 0; i < 11; i ++){
			System.out.println("For the " + (i + 1) + "th player-");
			get_avg(c[i]);
		}
		int sum = 0;
		for(int i = 0; i < 11; i ++){
			sum += c[i].batting_avg;
		}
		int avg = sum / 11;
		if(avg < 20){
			throw new LowAverage("The average is lower than 20!");
		}
		
		asc(c);
	}
}
