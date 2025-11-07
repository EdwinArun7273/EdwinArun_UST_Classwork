class testing
{
	void m1()
	{
		System.out.println("M1 runs here");
		m2();
	}
	
	void m2()
	{
		System.out.println("M2 runs here");
		m3();
	}
	
	void m3()
	{
		System.out.println("M3 runs here");
	}
}


public class Exercise_17 {

	public static void main(String[] args) {
		testing obj1 = new testing();
		obj1.m1();

	}

}
