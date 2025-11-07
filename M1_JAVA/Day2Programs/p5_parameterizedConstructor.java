package Day2Programs;

class demoPara
{
	int n;
	String s1;
	demoPara(int n, String s1)
	{
		this.n=n;
		this.s1=s1;
	}
	
	void print()
	{
		System.out.println("Number: " + n);
		System.out.println("String: " + s1);
	}
}

public class p5_parameterizedConstructor {

	public static void main(String[] args) {
		demoPara obj1 = new demoPara(2, "Hai");
		obj1.print();
	}

}
