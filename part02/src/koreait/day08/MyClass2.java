package koreait.day08;

public class MyClass2 {
	
	private int age;
	private String name;
	
	//Ŀ���� ������ ���� ���� : ������ �޼ҵ� �̸��� �ݵ�� 1. Ŭ���� �̸��� �����ϰ� 2. ����Ÿ���� ���� ����
	//                                    3. ���� �����ڴ� 4���� ��� ���� : ���� ���ô� default(�⺻)
	//���� : �ʵ� �ʱ�ȭ, ����� �Ǵ� �ٸ� ��ɹ��� ���� ����.
	MyClass2(String name){
		this.name = name; //setter �޼ҵ�ó�� ��������(�ʵ�)���� �ʱ�ȭ.
	}
	
	MyClass2(){

	}//Ŀ���� �����ڸ� �����ϸ� �⺻������ ������� �ʴ� ��찡 ����.
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() { // setter�� Ŀ���� �����ڷ� ����ϰ� getter�� �ִ� ����, �����ڿ��� �ʱ�ȭ�� ���� ������ �� ����.
		return name;
	}

}
/*
������ �޼ҵ� ����(���ϰ��� ����, ���ڴ� ���� ���� �ִ� �޼ҵ�) - constructor
-> ������ �޼ҵ� �������� ��ü�� ��������ϴ�. 	Random r = new Random(); ���� Random()�� ������ �޼ҵ� �̰�
��ü�� ����� ���� ����Ǵ� �޼ҵ�
-> �⺻������ : ���ڰ� ���� ������ ������
-> Ŀ���һ����� : �ʵ尪 �ʱ�ȭ�� ���ؼ� ���ڰ� �ִ� ������ ������
*/