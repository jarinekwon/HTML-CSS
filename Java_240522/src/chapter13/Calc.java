package chapter13;

import java.util.Scanner;

class Add {
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate(int a, int b) {
		return a+b;
	}
}
class Sub {
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate(int a, int b) {
		return a-b;
	}
}
class Mul {
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate(int a, int b) {
		return a*b;
	}
}
class Div {
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate(int a, int b) {
		int res = 0;
		try {
			res = a/b;
		} catch (Exception e) {
			System.out.print("0으로 나눌 수 없습니다.");
			return 0;
		}
		return a/b;
	}
}

public class Calc {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		char operator = scan.next().charAt(0);
		
		switch (operator) {
		case '+':
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate(a, b));
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate(a, b)); 
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate(a, b));
			break;
		case '/':
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate(a, b));
			break;

		default:
			break;
		}
		
		
//		String s = scan.next();
//		
//		if(s.equals("+")) {
//			Add add = new Add();
//			add.setValue(a, b);
//			System.out.println(add.calculate(a, b));
//		}
//		else if (s.equals("-")) {
//			Sub sub = new Sub();
//			sub.setValue(a, b);
//			System.out.println(sub.calculate(a, b)); 
//		}
//		else if (s.equals("*")) {
//			Mul mul = new Mul();
//			mul.setValue(a, b);
//			System.out.println(mul.calculate(a, b));
//		}
//		else if (s.equals("/")) {
//			if (b != 0) {
//				Div div = new Div();
//				div.setValue(a, b);
//				System.out.println(div.calculate(a, b));
//			}
//			else {
//				System.out.print("0으로 나눌 수 없습니다.");
//			}	
//		}
		scan.close();
	}
}
