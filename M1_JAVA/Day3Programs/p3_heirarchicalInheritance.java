package Day3Programs;

class b1
{
	int a = 10;
}

class b2 extends b1
{
	int b = 20;
	void display()
	{
		System.out.println(a+b);
	}
}

class b3 extends b1
{
	int c = 30;
	void display()
	{
		System.out.println(a+c);
	}
}

public class p3_heirarchicalInheritance {

	public static void main(String[] args) {
		b2 obj1 = new b2();
		obj1.display();
		b3 obj2 = new b3();
		obj2.display();
	}

}
