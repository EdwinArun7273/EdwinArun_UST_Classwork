package Day4Programs;

import java.util.Set;
import java.util.HashSet;

public class p11_sets {

	public static void main(String[] args) {
		Set<String> mySet = new HashSet<String>();
		mySet.add("Item1");
		mySet.add("Item2");
		mySet.add("Item2");
		mySet.add("Item3");
		mySet.add("Item4");
		mySet.add("Item5");
		mySet.add("Item6");
		
		System.out.println(mySet);
		System.out.println("Size = " + mySet.size());
	}

}
