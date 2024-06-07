package chapter05_2;


interface PhoneInterface2{ 
	int TIMEOUT=100; 
	void sendCall(); 
	void receiveCall(); 
	default void printlogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone2 implements PhoneInterface2{ 
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() { 
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
interface MobilePhoneInterface extends PhoneInterface2{
// PCS(ex> 016, 018, 019)
// 인터페이스 간의 상속 -> extends 사용
	void senSMS();
	void receiveSMS();
//	문자를 보내고 받는 기능을 추상메소드로 선언
}
interface MP3Interface{
	void play();
	void stop();
//	MP3 -> 음악재생, 정지 기능을 추상메소드로 선언
}
class PDA{
	public int calculate(int x, int y) {
		return x+y;
//	PDA -> 계산기능을 메소드로 구현
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{ 
// 스마트폰 -> 계산기능, 문자전송, 음악기능을 상속 받음
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() { 
		System.out.println("전화기에 불이 켜졌습니다.");
	}

	@Override
	public void play() {
		System.out.println("음악을 연주합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악을 중단합니다.");
	}
	public void schedule() {
		System.out.println("일정 관리 합니다.");
	}

	@Override
	public void senSMS() {
		System.out.println("문자 갑니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요.");
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		phone.printlogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash(); 
		phone.play();
		System.out.println(phone.calculate(3, 5));
		phone.schedule();
	}
}
