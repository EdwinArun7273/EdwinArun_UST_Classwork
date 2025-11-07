package Day2Programs;

class testDisplay
{
	void display()
	{
		System.out.println("No Argument");
	}
	
	void display(int x)
	{
		System.out.println("Integer Argument: " + x);
	}
	
	void display(String x)
	{
		System.out.println("String Argument: " + x);
	}
	
	void display(int x, String y)
	{
		System.out.println("Integer and String Argument: " + x + " " + y);
	}
}

public class Exercise_4 {

	public static void main(String[] args) {
		int a=2;
		String b="Hi";
		testDisplay obj1 = new testDisplay();
		obj1.display();
		obj1.display(a);
		obj1.display(b);
		obj1.display(a, b);
	}

}
