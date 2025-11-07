package Day3Programs;

class c1
{
	int a = 10;
}

class c2 extends c1
{
	int b = 20;
}

class c3 extends c2
{
	int c = b + a;
	void display()
	{
		System.out.println(c);
	}
}

public class p2_multiLevelInheritance {

	public static void main(String[] args) {
		c3 obj1 = new c3();
		obj1.display();
	}

}
