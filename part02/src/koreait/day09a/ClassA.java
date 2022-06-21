package koreait.day09a;

/*
 * 클래스의 상속
 * 클래스 간의 부모(상위클래스, super), 자식(하위클래스)관계가 만들어진다.
 * 부모의 클래스 구성요소를 자식이 사용할 수 있다. 상속되는 요소는 필드(변수), 메소드
 * extends 키워드 사용하여 부모클래스를 지정
 * private 접근한정자는 상속 안된다.
 * protected는 다른 패키지의 자식클래스가 상속받을 수 있게 한다.
 * 
 */
public class ClassA {//parent class
	int ab;
	String name;
	protected String title;
	//protected는 디폴트 접근한정자이나 자식클래스만 예외로 허용.
	
	void print() {
		System.out.println("ab = " + ab);
		System.out.println("name = " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
