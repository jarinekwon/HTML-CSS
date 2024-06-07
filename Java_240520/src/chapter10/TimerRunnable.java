package chapter10;

public class TimerRunnable implements Runnable{
//Runnable 인터페이스 상속 받아서 스레드 구현
	
		int n = 0;
		@Override
		public void run() {
			while (true) {
				System.out.println(n);
				n++;
				try {
					Thread.sleep(1000); // 1초마다 실행
				} catch (InterruptedException e) {
//				에외발생 할 때 e로 catch해서
					e.printStackTrace();
//					printStackTrace 메소드로 에외처리 기본 메시지를 출력
				}
			}
		
		
	}

}
