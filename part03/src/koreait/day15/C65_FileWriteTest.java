package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {

	public static void main(String[] args) {
		
		String filename = "C:\\Users\\Hwamin Kang\\자바테스트.txt";
		
		File file = new File(filename);
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			pw.println("모모 90 89 82 ");
			pw.println("다현 89 90 82 ");
			pw.println("나연 82 89 90 ");
			System.out.println("파일 출력이 완료되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("사용자 오류 발생 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			pw.close();
		}
		

	}

}
