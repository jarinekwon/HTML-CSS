package chapter04;

public class ArrayParameterEx {
	static void replaceSpace(char a[]) {
//	공백을 콤마로 바꿈
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i]=',';
			}
		}
	}
	
	static void printCharArray(char a[]) {
//	파라미터로 받은 배열원소를 출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
}
