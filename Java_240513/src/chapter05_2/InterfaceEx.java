package chapter05_2;


interface PhoneInterface{ // 기본폰, 전화를 걸어서 100초 동안 응답없으면 타임아웃
//	public static final int TIMEOUT=100;
	int TIMEOUT=100; // public static final 생략
//	public abstract void senCall(); // 추상메소드
	void sendCall(); // public abstract 생략
	void receiveCall(); // public abstract 생략
	default void printlogo() { // default(일반메소드)는 구현해야 됨
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface{ // 삼성폰을 만들 때 기본폰 기능을 사용(전화 걸고, 받는 것)
	// 추상메소드 오버라이딩 2개
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() { // 삼성폰의 고유의 기능
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		
		SamsungPhone phone = new SamsungPhone();
		phone.printlogo(); // 인터페이스 상속 받아서 사용
		phone.sendCall(); // 추상메소드 구현에서 사용
		phone.receiveCall(); // 추상메소드 구현에서 사용
		phone.flash(); // 삼성폰의 고유의 기능
		
	}
}
