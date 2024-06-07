package chapter10;

import java.util.Scanner;

public class PersonDriver {
	public static void main(String[] args) {
		
		String fname;
		String lname;
		Person person1, person2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성을 입력하세요: ");
		lname = scan.next();
		System.out.print("이름을 입력하세요: ");
		fname = scan.next();
		
		person1 = new Person();
		person1.lastName = lname;
		person1.firstName = fname;
		
		System.out.println("성: " + person1.getLastName() + " 이름: " + person1.getFirstName() + " 성명의 길이: " + person1.getlength());

		System.out.print("성을 입력하세요: ");
		lname = scan.next();
		System.out.print("이름을 입력하세요: ");
		fname = scan.next();
		
		person2 = new Person();
		person2.lastName = lname;
		person2.firstName = fname;
		
		System.out.println("성: " + person2.getLastName() + " 이름: " + person2.getFirstName() + " 성명의 길이: " + person2.getlength());
		
		scan.close();
		
		
	}
}
