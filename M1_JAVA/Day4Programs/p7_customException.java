package Day4Programs;

public class p7_customException {

	public static void main(String[] args) throws myException{
		int a = -10;
		if (a<0)
		{
			throw new myException("A can't be negative");
		}
		else
		{
			System.out.println("A is valid");
		}
		System.out.println("Rest of code");
	}

}
