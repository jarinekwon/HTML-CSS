package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		
		System.out.println("번호\t이름\t직업");
//		\\t -> 탭만큼 띄움
		System.out.println("번호\t이름\t직업");
		System.out.print("번호\t이름\t직업\n");
		System.out.print("번호\t이름\t직업");
//		println -> 엔터 적용O, print -> 엔터 적용X
//		\\n -> 줄 바꿈
		System.out.println(); // 엔터랑 같은 효과
		System.out.println("우리는 개발자 입니다.");
		System.out.println("우리는 \"개발자\" 입니다.");
//		\\" -> 문자열 안에 큰 따옴표 넣기
		System.out.println("봄여름가을겨울");
		System.out.println("봄\\여름\\가을\\겨울");
//		\\ -> 백슬레쉬 넣기
	}
}
