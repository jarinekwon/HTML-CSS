package chaper03;
/*
 * do whil문 사용
 * 변화되는 i 값 출력
 */
public class LoopExample3 {
	public static void main(String[] args) {
		
		int i = 10;
		
		do {
//			i의 값 -> 10 => 한번만 출력
//			do while문 => 최소 한번 실행은 보장
			System.out.println("i의 값 : " + i);
			i--;
//			9<3 => 거짓으로 종료
		} while (i<3);
	}
}
