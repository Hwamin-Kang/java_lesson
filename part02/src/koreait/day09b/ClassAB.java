package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA{
	//이 클래스가 필드, 메소드를 상속받았는지 확인, ClassA의 private, default 접근한정자 요소는 상속받지 못한다.
	public void test() {
//		System.out.println("name = " + name); //name필드 접근 한정자는 디폴트, 다른 패키지에서 사용하지 못한다.
		title = "momo"; //상속받은 title필드 : 다른 패키지이지만 protected 접근 한정자로 자식클래스는 허용.
		System.out.println("title = " + title);
		setName("신비");
		System.out.println("name = " + getName());
	}
	

}
