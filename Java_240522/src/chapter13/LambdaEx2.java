package chapter13;

interface Myfuction2{
	int calc(int x);
}

public class LambdaEx2 {
	public static void main(String[] args) {
		Myfuction2 square = x -> x*x;
		System.out.println(square.calc(3));
	}
}
