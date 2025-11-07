package Day3Programs;

class baseClass
{
	int x = 10;
}

class subClass extends baseClass
{
	int x = 100;
	void display()
	{
		System.out.println("Base Class: " + super.x);
		System.out.println("Sub Class: " + x);
	}
}

public class p4_superKeyword {

	public static void main(String[] args) {
		subClass obj1 = new subClass();
		obj1.display();
	}

}
