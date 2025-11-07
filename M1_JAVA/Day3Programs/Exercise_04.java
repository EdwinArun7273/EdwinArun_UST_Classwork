package Day3Programs;

class employee
{
	int empid;
	String empName, empCity;
	employee(int id, String name, String city)
	{
		empid = id;
		empName = name;
		empCity = city;
	}
	void display()
	{
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Name: " + empName);
		System.out.println("City: " + empCity);
	}
}

class salary extends employee
{
	double basic;
	double da, hra, pf, gross, netpay;
	
	salary(int id, String name, String city)
	{
		super(id, name, city);
	}
	void calculateSalary(double basic)
	{
		da = basic*0.3;
		hra = basic*0.2;
		pf = basic*0.08;
		gross = basic+da+hra+pf;
		netpay = gross-pf;
	}
	void display(double basic)
	{
		super.display();
		calculateSalary(basic);
		System.out.println("Gross Pay : " + gross);
		System.out.println("Net Pay : " + netpay);
	}
}

public class Exercise_04 {

	public static void main(String[] args) {
		salary obj1 = new salary(30000, "Akhil", "Ernakulam");
		obj1.display(10000);
	}

}
