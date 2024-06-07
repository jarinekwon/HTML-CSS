package chapter04;

class Circle3{
//	4. 멤버 저장됨
	int radius;
	public double getArea() {
		return 3.14*radius*radius;
	}
//	2. i를 radius=0
	public Circle3(int radius) {
//		3. 매개변수를 멤버에 저장
		this.radius = radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		
		Circle3[] c; // 객체배열 Circle을 참조변수 c로 선언
		c = new Circle3[5]; // 객체배열 생성 -> 참조변수 4개 크기(c[0]~c[4])
		
		for (int i = 0; i < c.length; i++) {
//		c.length -> 5
//			1. i=0 -> 객체생성 -> 생성자 호출
			c[i] = new Circle3(i); // 객체 생성(c[0]~c[4] 참조변수가 객체를 가리킴)
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getArea());
		}
	}
}
