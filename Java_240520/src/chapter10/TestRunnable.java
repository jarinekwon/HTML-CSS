package chapter10;

public class TestRunnable {
	public static void main(String[] args) {
		Thread th = new Thread(new TimerRunnable());
//		Runnable로 만든 스레드는 Thread 객체의 생성자로 호출
		
		th.start();
	}
}
