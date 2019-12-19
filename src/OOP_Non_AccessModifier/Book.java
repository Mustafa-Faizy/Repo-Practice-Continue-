package OOP_Non_AccessModifier;

public class Book {
	
	private String title;//cannot be static, bcz each book have different title
	private String author;//not static
	private int numberOfPages;
	private String publisher;
	private String edition;
	//what value can be a static
	private  static  int count=0;

	public Book (String title, String author, int numberOfpages, String publisher, String edition){
	this.title = title;
	this.author = author;
	this.numberOfPages =numberOfPages;
	this.publisher=publisher;
	this.edition=edition;
	count ++;//when i'm calling this method it's gonna be encriase by one
	
	
}
	public static void numberOfbooksIntheSystem () {
		System.out.println("Number of books created this system is "+ count);
	}
}
