package chapter06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		
		int n = 10;
		Integer intObject = Integer.valueOf(n); // boxing
//		n을 값으로 가지는 객체 생성(intObject -> 참조변수)
		Integer intObject2 = n; // auto boxing
		
		System.out.println("intObject = " + intObject);
		System.out.println("intObject2 = " + intObject2);
		
		int m = intObject.intValue() + intObject.intValue(); // unboxing
		int m2 = intObject + intObject; // auto unboxing
		System.out.println("m = " + m);
		System.out.println("m2 = " + m2);
	}
}
