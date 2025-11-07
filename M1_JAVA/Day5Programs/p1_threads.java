package Day5Programs;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Welcome to java");
	}
}

public class p1_threads {
	


	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}

}
