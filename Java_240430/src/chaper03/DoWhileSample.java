package chaper03;
/*
 * do while문
 * a~z 알파벳 소문자 출력
 */
public class DoWhileSample {
	public static void main(String[] args) {
		
		char c = 'a';
		
		do {
			System.out.print(c);
			c=(char)(c+1);
//			c += 1; 가능 -> 자동 변환
//			유니코드 변환해서 1 증가한 유니코드가 문자로 변환해서 변수 c에 저장
//			c+1 -> 문자 + 정수 = 정수
		} while (c <= 'z');
	}
}
