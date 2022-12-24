package multiThreading;

public class CreateThreadByExtendingThread extends Thread {
	    public void run()
	    {
	        System.out.print("Thread started");
	    }
	    
	    public static void main(String[] args)
	    {
	    	CreateThreadByExtendingThread g = new CreateThreadByExtendingThread(); // creating thread
	        g.start(); // starting thread
	    }
	}

