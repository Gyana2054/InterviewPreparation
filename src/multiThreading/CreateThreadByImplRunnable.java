package multiThreading;

public class CreateThreadByImplRunnable {

	public static void main(String[] args) throws InterruptedException {
		T1 obj1 = new T1(); 
        Thread t = new Thread(obj1); 
        t.start();
        
        Thread.sleep(1000);
        
        t.stop();
        System.out.println("Thread stopped");
	}

}

class T1 implements Runnable{
    @Override
    public void run(){
    System.out.println("Thread is running");
       }
}
