package koreait.day08;
//작성자 강화민
public class Member {
	
	private String name;
	private String email;
	private int age;
	private int level;
	
	public Member(String name, String email) { // name, email 필드 초기화하는 커스텀 생성자
		this.name = name;
		this.email = email;
	}
	
	public Member() {
		System.out.println("name, email, age, level 필드는 기본값입니다.");
		System.out.println("name = " + this.name); //this는 메소드를 실행하는 객체
		System.out.println("age = " + this.age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getLevel() {
		return level;
	}

}
