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
		Animal temp = dog;//�ڽİ�ü�� �θ�Ŭ���� Ÿ������ ������ �� �ִ�.(�ڽ�Ŭ������ �θ�Ŭ����Ÿ������ �ڵ�ĳ����)
		temp.print();
//		temp.run(); //��, �θ�Ÿ�� �����δ� �ڽ� �޼ҵ带 �������� ���Ѵ�.
		temp = crow; //�ڽİ�ü crow ����
		temp.print();
//		temp.fly(); //��, �θ�Ÿ�� �����δ� �ڽ� �޼ҵ带 �������� ���Ѵ�.
		System.out.println("------------------------------");
		Animal puppy = new Dog();
		puppy.print();
//		puppy.run(); //��, �θ�Ÿ�� �����δ� �ڽ� �޼ҵ带 �������� ���Ѵ�.
		
		Dog puddle = (Dog)puppy; //Animal Ÿ���� Dog Ÿ������ ���� casting.
		puddle.run();			//puppy ������ �����ϴ� ��ü�� Dog Ÿ���϶��� ����.
		puddle.print();

	}

}