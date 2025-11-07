package Day2Programs;

class person
{
	String name;
	int age;
	
	person()
	{
		name = "Unknown";
		age = 0;
	}
	
	void print()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class Exercise_5 {

	public static void main(String[] args) {
		person obj1 = new person();
		obj1.print();
	}

}
