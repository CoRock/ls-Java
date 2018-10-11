package ch16_thread;

/**
 * Multi Thread
 * 	working unit is more than 2
 * 
 * Multi Thread Implementation
 *  1. inherit Thread
 *  2. implement Runnable
 */
public class ThreadExam extends Thread {
	
	public ThreadExam(String name) {
		// call a constructor of class Thread
		// set title of thread
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			// thread name which is ongoing
			System.out.println(Thread.currentThread().getName());
			
			// stop CPU during 1 second(required exception handling)
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadExam te1 = new ThreadExam("thread1");
		ThreadExam te2 = new ThreadExam("thread2");
		ThreadExam te3 = new ThreadExam("thread3");
		
		te1.start();	// call run()
		te2.start();
		te3.start();
	}
	
}