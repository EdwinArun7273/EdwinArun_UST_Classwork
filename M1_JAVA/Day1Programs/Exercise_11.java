import java.util.Scanner;
public class Exercise_11 {

	public static void main(String[] args) {
		String txt;
		
		int i, j, vc = 0;
		String v ="aeiou";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
        txt = sc.next();
        txt = txt.toLowerCase();
        for (i=0; i<txt.length(); i++)
        	for (j=0; j<v.length(); j++)
        	{
        		if (txt.charAt(i) == v.charAt(j))
        		{
        			vc += 1;
        		}
        	}
        System.out.println(vc);
	}

}
