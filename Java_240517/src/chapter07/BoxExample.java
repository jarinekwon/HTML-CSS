package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box1 = new Box();
		Object box2 = new Box(); // upcasting
		box1.set("홍길동");
		String name = (String) box1.get(); // downcasting
		System.out.println(name);
		
		box1.set(777);
		int number = (int) box1.get(); // downcasting
		System.out.println(number);
		
		box1.set(new Apple());
		Apple apple = (Apple) box1.get(); // downcasting
		System.out.println(apple); // 해시코드 출력
	}
}
