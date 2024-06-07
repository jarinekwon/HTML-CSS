package chapter04;

public class Circle {
	
	int radius;
	String name;
//	필드(멤버변수)
	
	public Circle() {} // 클래스하고 이름이 똑같은 메소드 -> 생성자(기본)	
	public Circle(int a) {} // 원래는 메소드명이 같으면 쓸 수 없지만 이 경우 생성자(매개변수 1개)이기에 가능
	public Circle(int a, int b) {} // 원래는 메소드명이 같으면 쓸 수 없지만 이 경우 생성자(매개변수 2개)이기에 가능
//	오버로딩
	
	public double getArea() { // 메소드(멤버함수)
		
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		
		Circle pizza; // 참조변수(태명 비슷) 선언, Circle이 클래스(객체를 생성하는 틀/판)
//		new Circle(); // 객체만 생성(이름없는 Circle) -> 고아
		pizza = new Circle(); // 객체 생성, 이름이 pizza -> 부모 있
		pizza.radius = 10;
//		  객체.필드
		pizza.name = "자바피자";
		double area = pizza.getArea(); // 메소드(멤버함수 호출)
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(); // 객체 생성, 이름이 donut
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}	
}
