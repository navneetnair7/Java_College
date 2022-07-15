class Cricketer{
	String player_name;
	int run_hit;
	int innings_count;
	int not_out_count;
	double batting_avg;
	void get_avg(Cricketer c){
		c.batting_avg = c.run_hit / c.innings_count;
		System.out.println("The average is- " + c.batting_avg);
	}
	void asc(Cricketer [] c){
		for(int i = 0; i < 10; i ++){
			for(int j = i; j < 11; j ++){
				if(c[i].batting_avg > c[j].batting_avg){
					int temp = c[i].batting_avg;
					c[i].batting_avg = c[j].batting_avg;
					c[j].batting_avg = temp;
				}
			}
		}
		System.out.println("The Stats in the ascending order is- ");
		for(int j = 0; j < 11; j ++){
			System.out.println("Name- " + c[i].player_name);
			System.out.println("Run hit- " + c[i].run_hit);
			System.out.println("Innings count- " + c[i].innings_count);
			System.out.println("Not out count- " + c[i].not_out_count);
			System.out.println("Batting average- " + c[i].batting_avg);
		}
	}
	
}
