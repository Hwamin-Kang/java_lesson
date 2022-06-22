package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {
		int n10 = 123;
		int n16 = 0xa41c; //16진수 표기, 0x
		int n2 = 0b1010010000011100; //2진수 표기, 0b
		
		System.out.println("\n1. 변수를 그대로 출력");
		System.out.println("10진수 literal 123 : " + n10);
		System.out.println("16진수 literal 0xa41c : " + n16); //정수값 출력은 format 지정 안하면 10진수 출력
		System.out.println("2진수 literal 0b1010010000011100 : " + n2);
		
		System.out.println("\n2. format 지정");
		System.out.println(String.format("16진수 literal 0xa41c : %x", n16));
		System.out.println(String.format("2진수 literal 0b1010010000011100 : %x", n2));
		System.out.println(String.format("10진수 literal 42012 : %x", 42012));
		//결론 : 10진수 42012, n16과 n2 변수 값이 메모리에 저장될 때는 모두 동일한 0,1 표현값이다.
		
		System.out.println("\n3. -1의 2진수, 16진수 표현 확인");
		n16 = 0xffffffff;
		System.out.println("16진수 0xffffffff : " + n16);
		System.out.printf("-1은 16진수 %x\n", -1);
		System.out.println("-1은 2진수 : " + Integer.toBinaryString(-1));
		
		System.out.println("\n4. 입력한 2진수, 16진수 값을 10진수로 바꾼다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 값 입력 : ");
		String t2 = sc.nextLine();
		System.out.print("16진수 값 입력 : ");
		String t16 = sc.nextLine();
		
		System.out.println(String.format("2진수 %s는 10진수 %d이다.", t2, Integer.parseInt(t2, 2))); //t2는 2진수, 결과는 정수값
		System.out.println(String.format("16진수 %s는 10진수 %d이다.", t16, Integer.parseInt(t16, 16))); //t16은 16진수, 결과는 정수값
		//음수는 -기호 써서 절대값 넘지 않는 범위에서 문자열 입력
		sc.close();
	}
	/*
	 * 요약
	 * n진법 문자열 : 10진법 정수값 변환 : Integer.parseInt(문자열, n진법)
 	 * 10진법 정수값 : n진법 문자열 Integer.toBinaryString, toHexString 메소드
	 * 
	 * format에서 %d는 10진수, %x는 16진수, %o는 8진수, 2진수는 포맷형식이 없다.
	 * 
	 * 2진수의 비트 연산 : &, |, ^, ~, >>, << 등등 간단히 테스트
	*/

}
