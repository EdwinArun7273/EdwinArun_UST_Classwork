package Day4Programs;

import java.util.Scanner;
import java.util.HashMap;

public class BookManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch, id;
		int amt;
		String bName, aName;
		HashMap<Integer, String> book = new HashMap<Integer, String>();
		HashMap<Integer, String> author = new HashMap<Integer, String>();
		HashMap<Integer, Integer> price = new HashMap<>();
		do {
			System.out.println("\n\nMain Menu\n");
			System.out.println("1. Add Book");
			System.out.println("2. View Books");
			System.out.println("3. Remove Book");
			System.out.println("4. Verify Book Exists Or Not");
			System.out.println("5. Exit\n");
			System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();
			switch(ch)
			{
			case 1: System.out.println("\n\nAdd New Book\n");
				    System.out.print("Enter ID of book: ");
				    id = sc.nextInt();
				    sc.nextLine();
				    System.out.print("Enter name of book: ");
				    bName = sc.nextLine();
				    System.out.print("Enter name of author: ");
				    aName = sc.nextLine();
				    System.out.print("Enter price of book: ");
				    amt = sc.nextInt();
				    
				    book.put(id, bName);
				    author.put(id, aName);
				    price.put(id, amt);
			        break;
			        
			case 2: System.out.println("\n\nBook Details\n");					
					System.out.printf("%-5s %-25s %-20s %-10s%n", "\nID", "Book Name", "Author Name", "Price");
					for (Integer Id : book.keySet())
					{
						String BookName = book.get(Id);
						String AName = author.get(Id);
						int Amt = price.get(Id);
						
					    System.out.printf("%-5s %-25s %-20s %-10s%n", Id, BookName, AName, Amt);
					}
			        break;
			        
			case 3: System.out.println("\n\nDelete Book\n");
					System.out.print("Enter ID of book: ");
					id = sc.nextInt();
					String BName = book.get(id);
					if (BName != null)
					{
						book.remove(id);
						author.remove(id);
						price.remove(id);
						System.out.println("Book Deleted Successfully");
					}
					else
					{
						System.out.print("Book Information Not Found");	
					}
			        break;
			        
			case 4: System.out.println("\n\nSearch Book\n");
					System.out.print("Enter ID of book: ");
					id = sc.nextInt();
					try
					{					
						String BoName = book.get(id);
						String AName = author.get(id);
						int Amt = price.get(id);
						System.out.printf("%-5s %-25s %-20s %-10s%n", "\nID", "Book Name", "Author Name", "Price");
						System.out.printf("%-5s %-25s %-20s %-10f%n", id, BoName, AName, Amt);
					}
					catch (Exception e)
					{
						System.out.println("Book Unvailable");
					}
			        break;
			        
			case 5: sc.close();
					System.exit(0);
					break;
			default: System.out.println("Invalid Input");
			         break;
			}
		} while (ch!=5);
	}
}
