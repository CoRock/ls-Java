package ch16_thread;

/**
 * Runnable interface
 * run() method를 반드시 구현해야 함
 */
public class RunnableExam implements Runnable {

	@Override
	public void run() {
		// 현재 실행중인 스레드의 이름
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
		// CPU의 실행을 강제로 멈춤
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		RunnableExam re = new RunnableExam();

		// new Thread(스레드구현객체, "스레드이름")
		Thread t1 = new Thread(re, "thread1");
		Thread t2 = new Thread(re, "thread2");

		// run()을 직접 호출 -> main method()가 실행됨
		// t1.run();
		// t2.run();

		// 스레드의 시작을 요청 -> run method()가 실행됨
		t1.start(); // call run()
		t2.start();
	}

}
