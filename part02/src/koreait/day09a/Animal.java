package koreait.day09a;

public class Animal {//Parent Class
	private String name;
	private String color;
	
	public Animal() {
		System.out.println("새로운 Animal 가족이 생겼습니다.");
	}
	
	public void act() {
		System.out.println("Animal 행동 : 아직 모름(unknown)");
	}
	
	public void print() {
		System.out.println("name : " + name + ", color : " + color);
	}
	
	//Object 설명하고 작성한 메소드
	public boolean isDog(Object object) {
		return object instanceof Dog;
	}
	
	public boolean isCrow(Object object) {
		return object instanceof Crow;
	}
	
	//setter , getter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public static char[] isCrow(Dog puddle) {
		// TODO Auto-generated method stub
		return null;
	}

}
