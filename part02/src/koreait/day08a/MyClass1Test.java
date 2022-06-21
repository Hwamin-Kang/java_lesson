
package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClass1Test {
	
	public static void main(String[] args) {
		
		MyClass1 my = new MyClass1(); //public 클래스 이지만 import 필요
		
		//패키지가 다른 MyClass1 클래스의 필드 중 사용할 수 있는 것은?
//		my.name = "momo"; 오류! default(package) : 다른 패키지에서 사용 못합니다.
		my.point = 1.234; //public 접근 한정자 : 어디서나 사용합니다.
//		my.age = 23; 오류 : private 한정자 필드
//		my.setAge(23); //default 접근 한정자 이므로 다른 패키지에서 사용 불가능
//		System.out.println("age = " + my.age); 오류 : private 한정자 필드
//		System.out.println("age = " + my.getAge()); //default 접근 한정자 이므로 다른 패키지에서 사용 불가능
//		my.setAge(-100);//default 접근 한정자 이므로 다른 패키지에서 사용 불가
//		System.out.println("age = " + my.getAge());
		System.out.println("point = " + my.point); //public 접근한정자
//		System.out.println("point = " + my.name); //package default 한정자 필드
		
		//Score 클래스 필드, 메소드의 한정자가 모두 default 이다.
		//new 객체생성 될까? 답 : class는 public 한정자이므로 생성된다.
		
		Score score = new Score();
//		score.setScience(); default 한정자인 메소드이므로 다른 패키지에서 사용하지 못한다.
	}
}
