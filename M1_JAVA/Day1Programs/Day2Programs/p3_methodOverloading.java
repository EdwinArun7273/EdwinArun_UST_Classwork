package Day2Programs;

class utility
{
	void add(String x, String y)
	{
		System.out.println(x+y);
	}
	
	void add(int x, int y)
	{
		System.out.println(x+y);
	}
}

public class p3_methodOverloading {

	public static void main(String[] args) {
		int a=2, b=3;
		String c="Hello ", d="World";
		
		utility obj1 = new utility();
		obj1.add(a, b);
		obj1.add(c, d);
		
	}

}
