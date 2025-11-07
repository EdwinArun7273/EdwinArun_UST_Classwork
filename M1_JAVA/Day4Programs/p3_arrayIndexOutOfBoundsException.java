package Day4Programs;

public class p3_arrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		int arr[] = new int[4];
		try
		{
			arr[10] = 10;
			System.out.println("Values of arr[10] = " + arr[10]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Wrong array index mentioned in the program.");
		}
		System.out.println("Rest of the code");
	}

}
