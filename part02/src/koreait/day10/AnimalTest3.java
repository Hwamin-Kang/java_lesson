package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest3 {
	//다형성 구현 예시3
	public static void main(String[] args) {
		//부모타입 클래스 배열 : 배열에는 Animal 타입 인스턴스 객체의 참조값이 저장.
		Animal[] animals = new Animal[10];
		
		animals[0] = new Frog();
		animals[1] = new Cat();
		animals[5] = new Dog();
		animals[7] = new Frog();
		animals[8] = new Crow();
		
		for(Animal temp : animals) {
			if(temp != null) {
				
				Cat cat; Dog dog; Frog frog; Crow crow;
				if(temp instanceof Cat) {
					cat = (Cat)temp; //진짜 객체에 따라 오류 생길수도 있고 없을수도 있다.
					cat.sound();
				}
				if(temp instanceof Dog) {
					dog = (Dog)temp;
					dog.run();
				}
				if(temp instanceof Frog) {
					frog = (Frog)temp;
					frog.jump();
				}
				if(temp instanceof Crow) {
					crow = (Crow)temp;
					crow.fly();
				}
				
				temp.act(); //재정의된 메소드 있으면 자식클래스 메소드 실행
				temp.print();
			}
			else {
				System.out.println("null 참조입니다.");
			}
			System.out.println(":::::::::::::::");
		}

	}

}
