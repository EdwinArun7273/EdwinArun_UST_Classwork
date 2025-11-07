package Day5Programs;

class testInGeneric <T>
{
	T value;
	
	void setValue(T value)
	{
		this.value = value;
	}
	
	T getValue()
	{
		return value;
	}
}

public class p4_genericClasses {

	public static void main(String[] args) {
		testInGeneric obj = new testInGeneric();
		obj.setValue("Edwin");
		System.out.println("Name : " + obj.getValue());
		obj.setValue(40);
		System.out.println("Age : " + obj.getValue());
	}

}
