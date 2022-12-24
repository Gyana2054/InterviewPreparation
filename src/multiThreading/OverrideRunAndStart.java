package multiThreading;

public class OverrideRunAndStart {
	public static void main(String[] args) {
		
		MyThread mt1 = new MyThread("Gyana_1");
		mt1.start();
		
		MyThread mt2 = new MyThread("Gyana_2");
		mt2.start();
	}
}

class MyThread implements Runnable {
	
	Thread t1;
	private String myName;

	MyThread(String name) {
		myName = name;
	}

	@Override
	public void run() {
		System.out.println("Thread running " + myName);
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
			System.out.println(myName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread has been interrupted");
			}
		}
	}

	public void start() {
		System.out.println("Thread started");
		if (t1 == null) {
			t1 = new Thread(this, myName);
			t1.start();
		}
	}
}