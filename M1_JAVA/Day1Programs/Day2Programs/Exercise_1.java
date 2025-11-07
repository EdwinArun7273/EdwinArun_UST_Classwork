package Day2Programs;
import java.util.Scanner;

class student
{
	int roll;
	String name, course;
	
	void assignValues()
	{
		roll = 101;
		name = "test";
		course = "Perl Programming";
	}
	
	void printValues()
	{
		System.out.println("Roll no.: " + roll);
		System.out.println("Name: " + name);
		System.out.println("Course Enrolled: " + course);
	}
}

public class Exercise_1 {

	public static void main(String[] args) {
		student obj1 = new student();
		obj1.assignValues();
		obj1.printValues();
	}

}
