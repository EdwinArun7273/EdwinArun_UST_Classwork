package Day5Programs;

class parallelThread extends Thread
{
	Thread t;
	String threadName;
	
	parallelThread(String tName)
	{
		threadName = tName;
		System.out.println("Thread Name : " + threadName + " Started......");
	}
	
	public void run()
	{
		int i;
		for (i=0; i<=50; i++)
		{
			System.out.println("Thread Name : " + threadName);
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Thread Name : " + threadName + "Dead....");
	}
	public void start()
	{
		t = new Thread(this, threadName);
		t.start();
	}
}

public class p2_parallelThread {

	public static void main(String[] args) {
		parallelThread t1 = new parallelThread("P1");
		parallelThread t2 = new parallelThread("P2");
		t1.start();
		t2.start();
	}

}
