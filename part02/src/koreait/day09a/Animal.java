package koreait.day09a;

public class Animal {//Parent Class
	private String name;
	private String color;
	
	public Animal() {
		System.out.println("���ο� Animal ������ ������ϴ�.");
	}
	
	public void act() {
		System.out.println("Animal �ൿ : ���� ��(unknown)");
	}
	
	public void print() {
		System.out.println("name : " + name + ", color : " + color);
	}
	
	//Object �����ϰ� �ۼ��� �޼ҵ�
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
