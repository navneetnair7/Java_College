import java.util.*;
class Production{
	String title;
	String director;
	String writer;
	Production(){
		
	}
	String getTitle(){
		return title;
	}
	String getDirector(){
		return director;
	}
	String getWriter(){
		return writer;
	}
	void setTitle(String title){
		this.title = title;
	}
	void setDirector(String director){
		this.director = director;
	}
	void setWriter(String writer){
		this.writer = writer;
	}
	public String toString(){
		return ("Title of the movie is " + title + ", the director of the movie is " + director + ",the writer of the movie is " + writer);
	}
}

class Play extends Production{
	static int performance;
	int seats;
	int playprice;
	void setSeats(int n){
		seats = n;
	}
	int getSeats(){
		return seats;
	}
	void setPrice(){
		playprice = 500 * seats;
	}
	public String toString(){
		return ("The number of performances is " + performance);
	}
}

class Musical extends Play{
	String composer;
	String lyricist;
	int musicprice;
	String getComposer(){
		return composer;
	}
	String getLyricist(){
		return lyricist;
	}
	void setComposer(String composer){
		this.composer = composer;
	}
	void setLyricist(String lyricist){
		this.lyricist = lyricist;
	}
	void setSeats(int n){
		seats = n;
	}
	int getSeats(){
		return seats;
	}
	void setPrice(){
		musicprice = 800 * seats;
	}
	int getPrice(){
		return musicprice;
	}
	public String toString(){
		return ("The composer of the song is " + composer + ", the lyricist of the movie is " + lyricist);
	}
}

class Tester_Production{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of plays: ");
		int p = sc.nextInt();
		System.out.println("Enter the number of musicals: ");
		int m = sc.nextInt();
		int totalprice = 0;
		for(int i = 0; i < p; i ++){
			System.out.println("Enter the number of seats in play " + (i + 1) + ":");
			int n = sc.nextInt();
			totalprice += 500 * n;
		}
		for(int j = 0; j < m; j ++){
			System.out.println("Enter the number of seats in musicals " + (j + 1) + ":");
			int n = sc.nextInt();
			totalprice += 800 * n;
		}
		System.out.println("The total collection is " + totalprice);
	}
}
