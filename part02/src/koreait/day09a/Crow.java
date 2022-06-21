package koreait.day09a;

public class Crow extends Animal{
	
	protected int wings; //디폴트 접근한정자 + 다른패키지 자식클래스에서 사용가능
	
	public Crow() {
		System.out.println("새로운 동물가족은 crow");
	}
	
	public void fly() {
		setName("까마귀");
		setColor("검정색");
		System.out.println("특징 : 날기");
	}

}
