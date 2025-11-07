package Day4Programs;

public class p2_arithmeticException {

	public static void main(String[] args) {
		int a = 10, b = 5, c = 5;
		try {
			int d = (a/(b-c));
			System.out.println("Result is: " + d);
		}
		catch (Exception e)
		{
			System.out.println("Division by zero error.");
		}
		System.out.println("Rest of the code");
	}

}
