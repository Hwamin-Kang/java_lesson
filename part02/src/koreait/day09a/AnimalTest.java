package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("----------------------------");
		
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		System.out.println("----------------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print();
		
		System.out.println(":::::::::::::::::::::::::::::");
		Animal temp = dog;//자식객체는 부모클래스 타입으로 참조할 수 있다.(자식클래스는 부모클래스타입으로 자동캐스팅)
		temp.print();
//		temp.run(); //단, 부모타입 변수로는 자식 메소드를 실행하지 못한다.
		temp = crow; //자식객체 crow 참조
		temp.print();
//		temp.fly(); //단, 부모타입 변수로는 자식 메소드를 실행하지 못한다.
		System.out.println("------------------------------");
		Animal puppy = new Dog();
		puppy.print();
//		puppy.run(); //단, 부모타입 변수로는 자식 메소드를 실행하지 못한다.
		
		Dog puddle = (Dog)puppy; //Animal 타입을 Dog 타입으로 강제 casting.
		puddle.run();			//puppy 변수가 참조하는 객체가 Dog 타입일때만 가능.
		puddle.print();

	}

}
