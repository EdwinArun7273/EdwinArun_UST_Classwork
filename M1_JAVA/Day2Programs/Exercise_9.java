package Day2Programs;

class book
{
	String title, author;
	int price;
	
	book()
	{
		title = "nil";
		author = "Unknown";
		price = 0;
	}
	
	book(String title, String author)
	{
		this.title = title;
		this.author = author;
		price = 0;
	}
	
	book(String title, String author, int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void print()
	{
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}
}

public class Exercise_9 {

	public static void main(String[] args) {
		book obj1 = new book();
		obj1.print();
		book obj2 = new book("book1", "Akhil");
		obj2.print();
		book obj3 = new book("book2", "Sharon", 100);
		obj3.print();
	}

}
