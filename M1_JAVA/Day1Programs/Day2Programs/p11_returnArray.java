package Day2Programs;

public class p11_returnArray {

	public static void main(String[] args) {
		int nos[] = new int[5];
		nos[0] = 10;
		nos[1] = 100;
		nos[2] = 400;
		nos[3] = 450;
		nos[4] = 500;
		System.out.println("Initial Vales Are: ");
		int i;
		for (i=0; i<nos.length; i++)
		{
			System.out.println(nos[i]);
		}
		
		nos = incrementByHundred(nos);
		System.out.println("Final Vales Are: ");
		for (i=0; i<nos.length; i++)
		{
			System.out.println(nos[i]);
		}
	}
	
	static int[] incrementByHundred(int nos[])
	{
	    int tot = nos.length,i;
	    for (i=0; i<tot; i++)
	    {
		    nos[i]+=100;
	    }
	    return (nos); 
	}

}
