package koreait.day08;

import java.util.Scanner;

public class MyClass2Test {
//MyClass2�� ��ü ����
	public static void main(String[] args) {
		
		//�⺻������(constructor)�� ��ü �����ϱ�
		MyClass2 my2 = new MyClass2();
		//���� : Ŀ���� �����ڸ� �����ϸ� �⺻���� �� �� �ִ� �⺻�����ڰ� ����� �� ���� �ȴ�.
		//���� �����ؾ��Ѵ�.
		
		//Ŀ���һ����ڷ� ��ü �����ϱ�
		MyClass2 my22 = new MyClass2("���");
		
		System.out.println("my2 name : " + my2.getName());
		System.out.println("my22 name : " + my22.getName());
		
		//my2��ü�� �⺻�����ڸ� ����ϸ� name �ʵ尪 �ʱ�ȭ�� ���Ѵ�.(���� ����)
		
		//�⺻�����ڸ� ������� �ʴ� ����
		Scanner sc = new Scanner(System.in);

	}

}
