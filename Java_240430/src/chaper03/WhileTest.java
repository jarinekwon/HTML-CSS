package chaper03;

public class WhileTest {
	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		while(i<100) {
				sum += i;
				i += 2;
	      //확인용//System.out.println("@# i ===>" + i);
				//System.out.println("@# sum ===>" + sum);
		}
		System.out.println(sum); 
//		while문 밖에 적어야 최종 값만 나옴
		
	}
}
