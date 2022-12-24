package multiThreading;

public class ThreadToSetAndGetPriority implements Runnable {
    
	@Override
    public void run() {
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();
        try {
            t1.sleep(1000);
        } catch (InterruptedException e) {    
            e.printStackTrace();
        }
        
        t1.setPriority(1);
        int priorityOfThread1 = t1.getPriority();
        
        System.out.println(priorityOfThread1);
        System.out.println("Thread Running");
  }
}