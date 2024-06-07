package package21;

public class B {

	public B() {
		A a = new A();
		a.field1 = 2;
		a.field2 = 2;
//		a.field3 = 2; // private 멤버는 자기 클래스 안에서만 접근 가능
		
		a.method1();
		a.method2();
//		a.method3(); // private 멤버는 자기 클래스 안에서만 접근 가능
	}
}
