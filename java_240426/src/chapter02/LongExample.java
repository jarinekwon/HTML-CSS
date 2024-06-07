package chapter02;

public class LongExample {
	public static void main(String[] args) {
		long var1=10;
		long var2=20L;
//		20L의 L은 명시적으로 long 타입 리터럴(값)임을 알리기 위해 붙임
		long var3=1000000000000000000L;
//		L을 붙여줘야 long으로 인식하고 안붙이면 기본적으로 int로 인식
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		
	}
}
