package package11;

public class A {

	A a1 = new A(true); // 객체 생성
	A a2 = new A(1); // 객체 생성
	A a3 = new A("문자열"); // 객체 생성

	// 오버로딩
	public A(boolean b) {} // 생성자, public 접근지정자
	A(int b) {} // 생성자, default 접근지정자
	private A(String b) {} // 생성자, private 접근지정자
//	A(String b) {}
//	public A(String b) {}
}
