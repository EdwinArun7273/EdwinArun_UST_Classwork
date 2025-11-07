package Day5Programs;

class testingLifeCycle extends Thread
{
	Thread t;
	String threadName;
	testingLifeCycle(String tName)
	{
		threadName = tName;
		System.out.println("Thread Name : " + threadName + " Status : New");
	}
	
	public void run()
	{
		int i;
		for(i=0; i<=50;i++)
		{
			System.out.println("Thread Name : " + threadName + " is Running");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread Name : " + threadName + " is Dead");
	}
	
	public void start()
	{
		t = new Thread(this, threadName);
		t.start();
	}
}

public class p3_threadLifeCycle {

	public static void main(String[] args) {
		testingLifeCycle t1 = new testingLifeCycle("P1");
		testingLifeCycle t2 = new testingLifeCycle("P2");
		t1.start();
		t2.start();
	}

}
