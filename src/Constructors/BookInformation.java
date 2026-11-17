package Constructors;

public class BookInformation {

	int bookId;
	String title;
	String author;
	int price;
	public BookInformation() {
		bookId= 101;
		title="Java Programming";
		author= "James Gosling";
		price= 650;
	}
	public void display()
	{
	System.out.println("Book ID :" +bookId);
	System.out.println("Title :" +title);
	System.out.println("Author :" +author);
	System.out.println("Price :" +price);
	}
	public static void main(String[] args) {
		BookInformation b1 = new BookInformation();
		BookInformation b2 = new BookInformation();
		b2.display();
		

	}

}
