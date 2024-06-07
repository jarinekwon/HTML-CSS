package chapter08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String str = scan.next();
			array.add(str);
		}
		
		for (int i = 0; i < array.size(); i++) {
			String name = array.get(i);
			System.out.print(name + " ");
		}
		
		int longest = 0;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(longest).length() < array.get(i).length()) {
				longest = i;
			}
		}
		System.out.println("\n가장 긴 이름은 : " + array.get(longest));
	}
}
