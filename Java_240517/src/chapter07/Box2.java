package chapter07;

public class Box2<T> {
//대문자 알파벳 T를 타입파라미터로 받은 제네릭
	private T t; // 타입 파라미터를 t의 타입으로 사용
//	3. hello
//	T가 스트링
//	3. 777
	public T get() {
//	타입파라미터를 메소드의 리턴타입으로 사용
//	T가 스트링
		return t;
	}
	public void set(T t) {
//	타입파라미터를 메소드의 매개변수 타입으로 사용
//	1. hello
//	1. 777
//	T가 스트링
		this.t = t; 
//		2. hello
//		2. 777
	}
}
