package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C66_FileReadTest {

	public static void main(String[] args) {
		
		String filename = "C:\\Users\\Hwamin Kang\\자바테스트9.txt";
		
		File file = new File(filename);
		Scanner sc = null;
		try {
			sc = new Scanner(file);

			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("파일 읽기가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("사용자 오류 발생 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			if(sc!=null) sc.close();
		}
		
	}

}