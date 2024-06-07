package chapter03;

/*
 * 열거형 이용(+values() 메소드 이용)
 * foreach 사용
 */
public class foreachEx {
	public static void main(String[] args) {
		
		enum Week {월, 화, 수, 목, 금, 토, 일};
//		열거형 -> inner class(내부 클래스) 형태
		int n[] = {1, 2, 3, 4, 5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		int sum = 0;
		
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은 " + sum);
		
		for (String s : names) {
			System.out.print(s + " ");
		}
		System.out.println(" ");
		
		for (Week day : Week.values()) {
			Week str = day;
//			String str = day;
//			열거형 값을 String 타입으로 받을 수 없음
			System.out.print(str + "요일 ");
		}
	}
}
