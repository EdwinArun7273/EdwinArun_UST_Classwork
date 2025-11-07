package Day3Programs;

abstract class employee1
{
	abstract void calculateSalary();
	abstract void displayInfo();
}

class manager extends employee1
{
	int sal;
    @Override
	void calculateSalary()
	{
		sal = 1000;
	}
    @Override
	void displayInfo()
	{
		System.out.println("Salary for manager is : " + sal);
	}
}

class programmer extends employee1
{
	int sal;

	void calculateSalary()
	{
		sal = 100;
	}
    
	void displayInfo()
	{
		System.out.println("Salary for programmer is : " + sal);
	}
}

public class Exercise_05 {

	public static void main(String[] args) {
		manager obj1 = new manager();
		obj1.calculateSalary();
		obj1.displayInfo();
		programmer obj2 = new programmer();
		obj2.calculateSalary();
		obj2.displayInfo();
	}

}
