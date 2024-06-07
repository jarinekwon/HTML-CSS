package chapter06;

class Point{
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}	
}

public class ObjectPropertyEx {
	public static void print(Object obj) { // Object obj = new Point(2, 3) -> upcasting
		System.out.println(obj.getClass()); // 실행중인 클래스 출력(class chapter06. point)
		System.out.println(obj.getClass().getName()); // getName() -> 클래스 이름
		System.out.println(obj.hashCode()); // 객체의 서명(10진수 헤시코드)
		System.out.println(obj.toString()); // 패키지.클래스@16진수 헤시코드
		System.out.println(obj); // toString() 생략(문자열로 변환해서 출력) -> 위랑 값 같음 
	}
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);
	}
}
