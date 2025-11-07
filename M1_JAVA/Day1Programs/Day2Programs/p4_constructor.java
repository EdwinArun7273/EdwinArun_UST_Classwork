package Day2Programs;

class student1
{
	int roll;
	String name, course;
	
	student1()
	{
		roll = 101;
		name = "user1";
		course = "bca";
		System.out.println("Constructor is working here");
	}
	void print()
	{
		System.out.println("Roll no.: " + roll);
		System.out.println("Name: " + name);
		System.out.println("Course Enrolled: " + course);
	}
}

public class p4_constructor {

	public static void main(String[] args) {
		student1 obj1 = new student1();
		obj1.print();
	}

}
