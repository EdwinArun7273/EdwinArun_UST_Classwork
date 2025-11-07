package Day2Programs;

class comparison
{
	void compare(int x, int y)
	{
		if (x==y)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}
	
	void compare(String x, String y)
	{
		if (x==y)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}
}

public class Exercise_3 {

	public static void main(String[] args) {
		int a=2, b=3;
		String c="hi", d="hi";
				
		comparison obj1 = new comparison();
		obj1.compare(a, b);
		obj1.compare(c, d);
	}

}
