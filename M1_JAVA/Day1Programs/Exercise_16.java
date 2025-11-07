class stringUtility
{
	int stringLength(String s)
	{
		return (s.length());
	}
	
	int countVowels(String s)
	{
	    String v = "aeiou";
	    int i, j, vc = 0;
	    s = s.toLowerCase();
	    for (i=0; i<s.length(); i++)
	    {
	    	for (j=0; j<v.length();j++)
            {
            	if (s.charAt(i) == v.charAt(j))
            	{
            		vc += 1; 
            	}
          	}
	    }
	    return vc;
	}
}
public class Exercise_16 {

	public static void main(String[] args) {
		stringUtility obj1 = new stringUtility();
		System.out.println(obj1.stringLength("java"));
		System.out.println(obj1.countVowels("apple"));
	}

}
