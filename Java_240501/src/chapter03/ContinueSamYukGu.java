package chapter03;

public class ContinueSamYukGu {
	public static void main(String[] args) {
	
		for (int i = 1; i < 11; i++) {
//			int t = i%3;
//			int s = i%6;
//			int n = i%9;
//			
//			if (t==0 || s==0 || n==0) {
//				System.out.print("짝 ");
//			}
//			else {
//				System.out.print(i + " ");
//			}
			if (i%3 == 0) {
				System.out.print("짝 ");
				continue;
			}
			
			System.out.print(i + " ");
			
		}
	}
}
