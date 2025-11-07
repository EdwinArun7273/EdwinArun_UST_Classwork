package Day2Programs;

class rectangle
{
	int a, b;
	rectangle(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	rectangle(rectangle q)
	{
		a=q.a;
		b=q.b;
	}
	
	void print()
	{
		System.out.println("Side 1: " + a);
		System.out.println("Side 2: " + b);
	}
}

public class Exercise_8 {

	public static void main(String[] args) {
		rectangle obj1 = new rectangle(2, 3);
		obj1.print();
		rectangle obj2 = new rectangle(obj1);
		obj2.print();
	}

}
