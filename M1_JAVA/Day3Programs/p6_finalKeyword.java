package Day3Programs;

class base
{
	final void display()
	{
		System.out.println("Base class");
	}
}

class extended extends base
{
	void display_()         //cannot add method display as it was mentioned final from parent class. So no method overriding is not possible.
	{
		System.out.println("Extended class");
	}
}

public class p6_finalKeyword {

	public static void main(String[] args) {
		base obj = new base();
		obj.display();
		extended obj1 = new extended();
		obj1.display_();
	}

}
