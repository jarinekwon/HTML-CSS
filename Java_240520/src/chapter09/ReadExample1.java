package chapter09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
//	throws Exception -> 파일이 없을 경우 예외 발생
		InputStream is = new FileInputStream("D:\\dev\\work_java\\Java_240520\\test.txt"); // upcasting
//		InputStream -> 바이트 단위 입력을 위한 최상위 스트림 클래스
//		FileInputStream -> 바이트 단위 입력을 위한 하위 스트림 클래스
		int readByte;
		
		/*
		while (true) {
			readByte = is.read(); // byte 단위로 읽는다.(정수로 받음)
			if (readByte == -1) {
				break;
			}
//			파일의 끝에는 -1이 존재(프로그래밍 언어 동일) -> EOF(End Of File)
//			System.out.println(readByte);
//			a:97
//			b:98
//			c:99
//			엔터:13
//			첫번째 열:10
			System.out.print((char)readByte);
		}
		*/
		
		while ((readByte = is.read()) != -1) {
			System.out.print((char)readByte);
		}
		
		is.close();
	}
}
