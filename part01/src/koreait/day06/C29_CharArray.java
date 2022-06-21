package koreait.day06;

import java.util.Arrays;

public class C29_CharArray {

	public static void main(String[] args) {
		
		char[] carr1 = {'i', 'a', 'm', ' ', 'j', 'a', 'v', 'a'}; //7개의 문자형 배열을 참조하는 변수 carr1
		char[] carr2 = new char[20]; //초기값은 0
		System.out.println("[char 배열 테스트 - 1]");
		System.out.println("carr1: " + Arrays.toString(carr1));
		System.out.println("carr2: " + Arrays.toString(carr2)); //값 0에 대한 문자는 빈칸
		System.out.println("carr1 배열 길이(크기): " + carr1.length);
		System.out.println("carr2 배열 길이(크기): " + carr2.length);
		
		System.out.println("carr1 배열 3번째 데이터의 값(문자): " + carr1[2]);
		System.out.println("carr2 배열 3번째 데이터의 값(문자): " + carr2[2]);
		
		System.out.println("carr1 배열 3번째 데이터의 값(문자): " + (int)carr1[2]);
		System.out.println("carr2 배열 3번째 데이터의 값(문자): " + (int)carr2[2]);
		
		System.out.println("\n[char배열 테스트 - 2]");
		System.out.println("1. for문으로 출력");
		for(int i = 0; i < carr1.length; i++) {
			System.out.println("carr1[" + i + "] 의 데이터 값: " + carr1[i]);
		}
		
		for(int i = 0; i < carr1.length; i++) {
			System.out.print(carr1[i]);
		}
		
		System.out.println("\n3. 배열이름(참조형 변수)으로 출력");
		System.out.println(carr1);
		//위의 2번 
		
		System.out.println("\n[char배열 테스트 - 3]");
		System.out.println("4. 문자열을 배열로 변경");
		//carr2 = "hello hi goodbye"; //char배열에 바로 문자열 대입은 오류
		carr2 = "hello hi goodbye".toCharArray(); //String 문자열 객체를 char배열로 변환
		System.out.println(carr2);
		System.out.println(carr2[2]);
		System.out.println("carr2.length: " + carr2.length); //16
		
		carr2 = "hello hi goodbye hi goodbye".toCharArray(); //문자열이 선언된 배열크기보다 크다.
		System.out.println(carr2);
		System.out.println("carr2.length: " + carr2.length); //배열의 크기가 커진다.
		//method overloading
		String temp = String.valueOf(carr2); //char[]배열을 문자열로 변환, String 객체의 toCharArray()메소드와 반대
		//String.valueOf 메소드는 여러가지 매개변수 형식을 다룬다.(메소드 overloading)
		
		System.out.println("String.valueOf(carr2): " + String.valueOf(carr2));
		System.out.println("String.valueOf(carr2): " + temp);
	
	}

}
