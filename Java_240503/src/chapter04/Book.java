package chapter04;

public class Book {
	
//	4-1. 멤버 저장
//	4-2. 멤버 저장
	String title; 
	String author;
	// 필드(멤버변수)
	
	//생성자
//	2-1. "어린왕자", "생떽쥐베리" 2개를 매개변수로 받음
	public Book(String t, String a) {
//		3-1. 매개변수를 멤버로 저장
		title = t;
		author = a;
//		매개변수를 멤버변수(필드)로 저장		
	}
	
//	2-2. "춘향전"을 매개변수로 받음
	public Book(String t) {
//		3-2. 매개변수를 맴버변수(필드)로 저장
		title = t;
		author = "작자미상";
	}
	
	public static void main(String[] args) {

//		new Book();
//		생성자가 하나라도 존재하면 자동으로 기본 생성자를 만들지 못해서 오류

//		1-1. 매개변수 가지고 생성자 호출
		Book littlePrince = new Book("어린왕자", "생떽쥐베리");
//		1-2. 매개변수 가지고 생성자 호출
		Book lovestory = new Book("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(lovestory.title + " " + lovestory.author);
	}
}
