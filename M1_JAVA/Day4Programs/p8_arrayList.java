package Day4Programs;

import java.util.ArrayList;
import java.util.List;

public class p8_arrayList {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		mylist.add("item4");
		mylist.add("item5");
		
		System.out.println(mylist);
		
		boolean res = mylist.contains("item4");
		System.out.println("Item 4 exists => " + res);
		
		mylist.remove(3);
		System.out.println("Removed 4th item ...updated list");
		System.out.println(mylist);
		System.out.println(mylist.size());
		
		mylist.remove("item3");
		System.out.println("Removed 'item3' ...updated list");
		System.out.println(mylist);
		System.out.println(mylist.size());
	}

}
