package Day4Programs;

import java.util.Stack;

public class p9_stack {

	public static void main(String[] args) {
		Stack<String> stk =new Stack<>();
		
		System.out.println("Adding Itm1");
		stk.push("itm1");
		System.out.println(stk);
		
		System.out.println("Adding Itm2");
		stk.push("itm2");
		System.out.println(stk);
		
		System.out.println("Popping element from stack");
		stk.pop();
		System.out.println(stk);
		
		System.out.println("Adding Itm3");
		stk.push("itm3");
		System.out.println(stk);
	}

}
