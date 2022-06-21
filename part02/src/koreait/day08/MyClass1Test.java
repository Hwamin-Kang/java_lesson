package koreait.day08;

public class MyClass1Test {
	
	public static void main(String[] args) {
		
		MyClass1 my = new MyClass1(); //객체 생성, 기본생성자 사용
		
		my.name = "momo"; //default : 같은 패키지에서는 사용가능
		my.point = 1.234; //public 접근 한정자 : 
//		my.age = 23; 오류 : private 한정자 필드, 다른 클래스에서 사용하지 못한다.
		my.setAge(23); //private 필드값 대입(변경)하는 메소드 : setter
//		System.out.println("age = " + my.age); 오류 : private 한정자 필드
		System.out.println("age = " + my.getAge()); //private 필드값 읽어오는 메소드 : getter
		my.setAge(-100);
		System.out.println("age = " + my.getAge());
		System.out.println("point = " + my.point); //point 필드는 public 접근한정자, 어디서나 사용가능
		System.out.println("point = " + my.name); //name은 default 한정자 필드, 같은 패키지 내에서만 사용가능
	}
//접근 한정자 테스트는 자바에서 제공되는 클래스들을 이해하고 우리가 만들 클래스에도 사용
}
