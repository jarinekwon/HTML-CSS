package chapter03;

public class DoWhileTest {
	public static void main(String[] args) {
		
		int i = 0, sum =0;
		do {
			
			sum += i;
			i += 2;
		} while (i<=99);
		
		System.out.println(sum);
	}
}
