package chapter04;

import java.util.Scanner;

class Book3{
	String title;
	String author;
	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
public class BookArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Book3[] book = new Book3[2];
//		book 참조변수가 참조변수 2개를 가리킴
		
		for (int i = 0; i < book.length; i++) {
//		book.length -> 2
			System.out.print("제목>>");
//			String title = scan.next();
			String title = scan.nextLine();
			System.out.print("저자>>");
//			String author = scan.next();
			String author = scan.nextLine();
			book[i] = new Book3(title, author);
//			            참조변수: book[0], 참조변수: book[1]
//			객체를 2번 생성(참조변수:2개)
		}
		for (int i = 0; i < book.length; i++) {
			System.out.print("(" + book[i].title + "," + book[i].author + ")");
		}
		scan.close();
	}
}
