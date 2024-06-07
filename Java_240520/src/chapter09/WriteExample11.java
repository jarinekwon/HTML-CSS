package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample11 {
	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("D:\\dev\\work_java\\Java_240520\\output11.txt");
//		Writer -> 문자 단위 출력을 위한 최상위 스트링 클래스
//		FileWriter -> 문자 단위 출력을 위한 하위 스트링 클래스
		char[] data = "홍길동".toCharArray();
		
		for (int i = 0; i < data.length; i++) {
			writer.write(data[i]);
//			writer 객체에 write 메소드로 "홍길동"을 하나씩 받아서 파일로 저장
		}
		
		writer.close();
	}
}
