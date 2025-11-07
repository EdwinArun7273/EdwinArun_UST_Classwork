package Day2Programs;

class person1
{
	String name;
	int age;
	
	person1()
	{
		name = "Unknown";
		age = 0;
	}

	
	person1(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void print()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class Exercise_6 {

	public static void main(String[] args) {
		person1 obj1 = new person1();
		person1 obj2 = new person1("Akhil", 22);
		obj1.print();
		obj2.print();

	}

}
