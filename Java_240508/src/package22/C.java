package package22;

import package21.A;

public class C {

	public C() {
		A a = new A();
		a.field1 = 2;
//		a.field2 = 2;
//		a.field3 = 2;
//		default, private 둘 다 다른 패키지에서 접근 불가
		
		a.method1();
//		a.method2();
//		a.method3();
//		default, private 둘 다 다른 패키지에서 접근 불가
	}
}
