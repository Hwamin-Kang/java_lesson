package koreait.day08;

public class MyClass1Test {
	
	public static void main(String[] args) {
		
		MyClass1 my = new MyClass1(); //��ü ����, �⺻������ ���
		
		my.name = "momo"; //default : ���� ��Ű�������� ��밡��
		my.point = 1.234; //public ���� ������ : 
//		my.age = 23; ���� : private ������ �ʵ�, �ٸ� Ŭ�������� ������� ���Ѵ�.
		my.setAge(23); //private �ʵ尪 ����(����)�ϴ� �޼ҵ� : setter
//		System.out.println("age = " + my.age); ���� : private ������ �ʵ�
		System.out.println("age = " + my.getAge()); //private �ʵ尪 �о���� �޼ҵ� : getter
		my.setAge(-100);
		System.out.println("age = " + my.getAge());
		System.out.println("point = " + my.point); //point �ʵ�� public ����������, ��𼭳� ��밡��
		System.out.println("point = " + my.name); //name�� default ������ �ʵ�, ���� ��Ű�� �������� ��밡��
	}
//���� ������ �׽�Ʈ�� �ڹٿ��� �����Ǵ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ���
}
