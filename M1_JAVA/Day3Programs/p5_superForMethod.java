package Day3Programs;

class testing
{
	void display()
	{
		System.out.println("Base Class Method");
	}
}

class sampleTesting extends testing
{
	void display()
	{
		super.display();
		System.out.println("Extended Class Method");
	}
}

public class p5_superForMethod {

	public static void main(String[] args) {
		sampleTesting obj1 = new sampleTesting();
		obj1.display();
	}

}
