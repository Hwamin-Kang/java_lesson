package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //sc는 변수명 기본형 변수가 아닌 클래스 타입의 변수. -> 참조형 변수
		//키보드 입력을 위한 변수 선언. 표준입력으로 Scanner 객체를 만들고 변수 sc가 참조한다.
		
		int data;
		
		System.out.println("정수값 입력하세요. -> ");
		
		data = sc.nextInt(); //사용자로부터 키보드 입력을 받아 그 값을 정수로 변환하여 data 변수에 저장
		System.out.println("입력된 값은" + data + "입니다.");
		
		double point;
		System.out.println("실수값 입력하세요. -> ");
		
		point = sc.nextDouble(); //사용자로부터 키보드 입력을 받아 그 값을 실수로 변환하여 point 변수에 저장
		System.out.println("입력된 값은 " + point + " 입니다.");
		

	}

}
/*
 * 	표준 출력 : System.out (out, in은 System 클래스의 정적인 필드이고 메소드를 갖는다.)
 *  표준 입력 : System.in     -> Scanner 클래스를 이용해서 입력값을 특정 기본형식으로 변환시켜는 기능 사용.
 * 						   -> 기본 패키지의 클래스가  아니므로 import 가 필요합니다.	
 * 
 */