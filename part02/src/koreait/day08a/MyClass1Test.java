
package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClass1Test {
	
	public static void main(String[] args) {
		
		MyClass1 my = new MyClass1(); //public Ŭ���� ������ import �ʿ�
		
		//��Ű���� �ٸ� MyClass1 Ŭ������ �ʵ� �� ����� �� �ִ� ����?
//		my.name = "momo"; ����! default(package) : �ٸ� ��Ű������ ��� ���մϴ�.
		my.point = 1.234; //public ���� ������ : ��𼭳� ����մϴ�.
//		my.age = 23; ���� : private ������ �ʵ�
//		my.setAge(23); //default ���� ������ �̹Ƿ� �ٸ� ��Ű������ ��� �Ұ���
//		System.out.println("age = " + my.age); ���� : private ������ �ʵ�
//		System.out.println("age = " + my.getAge()); //default ���� ������ �̹Ƿ� �ٸ� ��Ű������ ��� �Ұ���
//		my.setAge(-100);//default ���� ������ �̹Ƿ� �ٸ� ��Ű������ ��� �Ұ�
//		System.out.println("age = " + my.getAge());
		System.out.println("point = " + my.point); //public ����������
//		System.out.println("point = " + my.name); //package default ������ �ʵ�
		
		//Score Ŭ���� �ʵ�, �޼ҵ��� �����ڰ� ��� default �̴�.
		//new ��ü���� �ɱ�? �� : class�� public �������̹Ƿ� �����ȴ�.
		
		Score score = new Score();
//		score.setScience(); default �������� �޼ҵ��̹Ƿ� �ٸ� ��Ű������ ������� ���Ѵ�.
	}
}
