class Book{
	String author;
	String name;
	double price;
	Book(String a, String n, double p){
		name = a;
		author = n;
		price = p;
	}
}
class BookDemo{
	public static void main(String args[]){
		Book b1 = new Book("Developing Java Software", "Russel Winderand", 79.75f);
		System.out.println("The name of the book is: " + b1.name);
		System.out.println("The author is: " + b1.author);
		System.out.println("The book costs $" + b1.price); 
	}
}
