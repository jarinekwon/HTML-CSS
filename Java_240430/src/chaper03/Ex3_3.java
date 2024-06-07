package chaper03;

/*
 * for문 사용해서 1~10까지 합게 출력
 */
public class Ex3_3 {
	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i = 0; i <= 10; i++) {
			sum+=i;
				
		}
		System.out.println("총합 : " + sum);
	}
}
