package chaper03;

public class TaxiFare {
	public static void main(String[] args) {
		
		int f, i;
		for (f=1, i=0 ; f <= 10; f++) {
			int z = f*1000;
			i += z;
			System.out.println("요금을 입력하세요: " + z);
			
		}
		System.out.println("총 수입: " + i);
		
	}
}
