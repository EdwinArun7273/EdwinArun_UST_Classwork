class methodReturn
{
	void m1()
	{
		System.out.println("M1 runs here");
		int a = m2(10);
		System.out.println(a);
	}
	
	int m2(int n)
	{
		System.out.println("M2 runs here");
		return (n*n);
	}
}
public class p18_returnValue {

	public static void main(String[] args) {
		methodReturn obj1 = new methodReturn();
		obj1.m1();
	}

}
