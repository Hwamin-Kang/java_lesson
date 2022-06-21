package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatchTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//try 형식 
		try {
			//Exception 가능성이 있는 명령을 작성. -> 오류가 생기면 catch로 간다.
			//이 위치에서 변수 선언하면 try{}의 지역변수
		} catch (NullPointerException e) { //오류 원인을 Exception 종류를 검사합니다.
			// NullPointerException 일때만 아리 명령들 처리한다.
			e.printStackTrace(); //오류를 추적하기 위해 원인을 출력(기존 Exception 출력 내용)
		} catch (InputMismatchException e) {
			// catch는 여러번 작성 가능하다.
		} finally { //마지막으로, 최종적으로 : 오류 발생 상관없이 실행되는 부분이다.
			//주로 자원을 해제하는 부분
			
			sc.close();
		}
		
		//try 블럭의 명령 또는 catch 블럭의 명령이 끝나면 실행이 계속된다.
	}

}
