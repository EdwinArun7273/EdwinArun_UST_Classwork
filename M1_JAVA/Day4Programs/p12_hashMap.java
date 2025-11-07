package Day4Programs;

import java.util.HashMap;

public class p12_hashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> myHash = new HashMap<Integer, String>();
		myHash.put(1, "Item1");
		myHash.put(2, "Item2");
		myHash.put(3, "Item2");
		myHash.put(4, "Item3");
		myHash.put(5, "Item4");
		myHash.put(6, "Item5");
		myHash.put(7, "Item6");
		
		System.out.println(myHash);
		System.out.println("Size = " + myHash.size());
		
		myHash.remove(4);
		
		System.out.println(myHash);
		System.out.println("Size = " + myHash.size());
	}

}
