package Day3Programs;

final class base1
{
	void display()
	{
		System.out.println("Base class");
	}
}

class extended1             //cannot extend from a parent class as parent class is mentioned final.
{
	void display()         
	{
		System.out.println("Extended class");
	}
}

public class p7_finalWithMethod {

	public static void main(String[] args) {
		base1 obj = new base1();
		obj.display();
		extended1 obj1 = new extended1();
		obj1.display();

	}

}
