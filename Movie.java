import java.util.*;
class Movie{
	String name;
	String type;
	String hero;
	String heroin;
	int budget;
	static int t;
	Movie(String m, String t, String h, String he, int b){
		name = m;
		type = t;
		hero = h;
		heroin = he;
		budget = b;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many movies do you want to enter- ");
		t = sc.nextInt();
		Movie m[] = new Movie[t];
		for(int i = 0; i < t; i ++){
			m[i] = new Movie("", "", "", "", 0);
			sc.nextLine();
			System.out.println("Enter the name of the movie-  ");
			m[i].name = sc.nextLine();
			System.out.println("Enter the type of the movie-  ");
			m[i].type = sc.nextLine();
			System.out.println("Enter the hero in the movie-  ");
			m[i].hero = sc.nextLine();
			System.out.println("Enter the heroin in the movie-  ");
			m[i].heroin = sc.nextLine();
			System.out.println("Enter the budget of the movie-  ");
			m[i].budget = sc.nextInt();
		}
		sort(m);
		System.out.println("Sorted movies- ");
		for(int i = 0; i < t; i ++){
			System.out.println(m[i].name + " Rs. " + m[i].budget);
		}
	}
	static void sort(Movie m[]){
		int max = 0;
		Movie temp = new Movie("", "", "", "", 0);
		for(int i = 0; i < t - 1; i ++){
			for(int j = i; j < t; j ++){
				if(m[i].budget > m[j].budget){
					max = i;
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			} 
		}
	}
}
