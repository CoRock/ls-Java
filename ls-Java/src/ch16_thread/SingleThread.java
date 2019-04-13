package ch16_thread;

/**
 * Single Thread: 작업단위가 1개; 순차적으로 처리됨
 */
public class SingleThread {

	void print() {
		// 현재 실행중인 스레드의 이름
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
