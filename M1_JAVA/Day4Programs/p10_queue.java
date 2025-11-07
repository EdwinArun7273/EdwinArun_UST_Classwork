package Day4Programs;

import java.util.PriorityQueue;

public class p10_queue {

	public static void main(String[] args) {
		PriorityQueue<String> myQueue = new PriorityQueue();
		
		System.out.println("\nAdding itm1");
		myQueue.add("itm1");
		System.out.println("Queue elements");
		System.out.println(myQueue);
		
		System.out.println("\nAdding itm3");
		myQueue.add("itm3");
		System.out.println("Queue elements");
		System.out.println(myQueue);
		
		System.out.println("\nAdding itm3");
		myQueue.add("itm3");
		System.out.println("Queue elements");
		System.out.println(myQueue);
		
		System.out.println("\nAdding itm2");
		myQueue.add("itm2");
		System.out.println("Queue elements");
		System.out.println(myQueue);
		
		System.out.println("\nTop element");
		System.out.println(myQueue.peek());
		System.out.println("Queue elements");
		System.out.println(myQueue);
		
		System.out.println("\nAdding itm4");
		myQueue.add("itm4");
		System.out.println("Queue elements");
		System.out.println(myQueue);
		
		System.out.println("\nRemove");
		myQueue.remove();
		System.out.println("Queue elements");
		System.out.println(myQueue);
		
		System.out.println("\nRemove");
		myQueue.remove();
		System.out.println("Queue elements");
		System.out.println(myQueue);
		
		System.out.println("\nRemove");
		myQueue.remove();
		System.out.println("Queue elements");
		System.out.println(myQueue);
		
		System.out.println("\nRemove");
		myQueue.remove();
		System.out.println("Queue elements");
		System.out.println(myQueue);
		
		System.out.println("\nClear all elements");
		myQueue.clear();
		System.out.println("Queue elements");
		System.out.println(myQueue);
	}

}
