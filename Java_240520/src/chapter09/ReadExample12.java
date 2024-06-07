package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("D:\\dev\\work_java\\Java_240520\\test.txt");
//		Reader -> 문자 단위 입력을 위한 최상위 스트링 클래스
//		FileReader -> 문자 단위 입력을 위한 하위 스트링 클래스
		
		int readData;
		char[] cbuf = new char[2];
		String data = "";
		
		while (true) {
//			readData = reader.read(); // 한 개의 문자 단위로 읽음 ex> 호미
			readData = reader.read(cbuf); // 2개의 문자 단위로 읽음 ex> 삽
			if (readData == -1) {
				break;
			}
//			System.out.println(readData);
//			System.out.print((char)readData);
			data += new String(cbuf, 0 , readData);
		}
		System.out.println(data);
		reader.close();
	}
}
