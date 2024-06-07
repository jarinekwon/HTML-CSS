package chaper03;

public class ForTest {
	public static void main(String[] args) {
		int i, sum;
		for (i = 0, sum = 0; i < 100; i+=2) {
			sum += i;
		}
		System.out.println(sum);
//		for문 밖에 적어야 최종 값만 나옴
	}

}
