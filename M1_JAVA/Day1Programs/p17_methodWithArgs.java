class methodWithArgs
{
	void m1()
	{
		System.out.println("M1 runs here");
		m2(10);
	}
	
	void m2(int n)
	{
		System.out.println("M2 runs here");
		System.out.println(n);
	}
}
public class p17_methodWithArgs {

	public static void main(String[] args) {
		methodWithArgs obj1 = new methodWithArgs();
		obj1.m1();
        obj1.m2(10);	
	}

}
