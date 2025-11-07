package Day2Programs;

class person2
{
	String name;
	int age;
	
	person2()
	{
		name = "Unknown";
		age = 0;
	}
	
	person2(String name)
	{
		this.name = name;
		age = -1;
	}
	
	person2(String name, int age)
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

public class Exercise_7 {

	public static void main(String[] args) {
		person2 obj1 = new person2();
		person2 obj2 = new person2("Akhil");
		person2 obj3 = new person2("Akhil", 22);
		obj1.print();
		obj2.print();
		obj3.print();
	}

}
