package ch16_thread;

/**
 * Single Thread
 * 	working unit is one(only exists main thread)
 * 	be procedurally processed
 */
public class SingleThread {

	void print() {
		// thread name which is ongoing
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		SingleThread st = new SingleThread();
		st.print();
		st.print();
	}
	
}
