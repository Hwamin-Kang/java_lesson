package koreait.day08;

import java.util.Scanner;

public class MyClass2Test {
//MyClass2의 객체 생성
	public static void main(String[] args) {
		
		//기본생성자(constructor)로 객체 생성하기
		MyClass2 my2 = new MyClass2();
		//오류 : 커스텀 생성자를 정의하면 기본으로 쓸 수 있는 기본생성자가 사용할 수 없게 된다.
		//직접 정의해야한다.
		
		//커스텀생성자로 객체 생성하기
		MyClass2 my22 = new MyClass2("모모");
		
		System.out.println("my2 name : " + my2.getName());
		System.out.println("my22 name : " + my22.getName());
		
		//my2객체에 기본생성자를 허용하면 name 필드값 초기화를 못한다.(예시 적용)
		
		//기본생성자를 허용하지 않는 예시
		Scanner sc = new Scanner(System.in);

	}

}
