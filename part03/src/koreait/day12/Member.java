package koreait.day12;

public class Member {
	private String name;
	private int age;
	protected boolean isValid;
	
	public Member(String name, int age) { //커스텀 생성자
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	@Override //toString 재정의
	public String toString() {
		return "(name=" + name + ", age=" + age + ", isValid=" + isValid + ")";
	}

}
