package koreait.day06;

import java.util.Arrays;

public class C29_CharArray {

	public static void main(String[] args) {
		
		char[] carr1 = {'i', 'a', 'm', ' ', 'j', 'a', 'v', 'a'}; //7���� ������ �迭�� �����ϴ� ���� carr1
		char[] carr2 = new char[20]; //�ʱⰪ�� 0
		System.out.println("[char �迭 �׽�Ʈ - 1]");
		System.out.println("carr1: " + Arrays.toString(carr1));
		System.out.println("carr2: " + Arrays.toString(carr2)); //�� 0�� ���� ���ڴ� ��ĭ
		System.out.println("carr1 �迭 ����(ũ��): " + carr1.length);
		System.out.println("carr2 �迭 ����(ũ��): " + carr2.length);
		
		System.out.println("carr1 �迭 3��° �������� ��(����): " + carr1[2]);
		System.out.println("carr2 �迭 3��° �������� ��(����): " + carr2[2]);
		
		System.out.println("carr1 �迭 3��° �������� ��(����): " + (int)carr1[2]);
		System.out.println("carr2 �迭 3��° �������� ��(����): " + (int)carr2[2]);
		
		System.out.println("\n[char�迭 �׽�Ʈ - 2]");
		System.out.println("1. for������ ���");
		for(int i = 0; i < carr1.length; i++) {
			System.out.println("carr1[" + i + "] �� ������ ��: " + carr1[i]);
		}
		
		for(int i = 0; i < carr1.length; i++) {
			System.out.print(carr1[i]);
		}
		
		System.out.println("\n3. �迭�̸�(������ ����)���� ���");
		System.out.println(carr1);
		//���� 2�� 
		
		System.out.println("\n[char�迭 �׽�Ʈ - 3]");
		System.out.println("4. ���ڿ��� �迭�� ����");
		//carr2 = "hello hi goodbye"; //char�迭�� �ٷ� ���ڿ� ������ ����
		carr2 = "hello hi goodbye".toCharArray(); //String ���ڿ� ��ü�� char�迭�� ��ȯ
		System.out.println(carr2);
		System.out.println(carr2[2]);
		System.out.println("carr2.length: " + carr2.length); //16
		
		carr2 = "hello hi goodbye hi goodbye".toCharArray(); //���ڿ��� ����� �迭ũ�⺸�� ũ��.
		System.out.println(carr2);
		System.out.println("carr2.length: " + carr2.length); //�迭�� ũ�Ⱑ Ŀ����.
		//method overloading
		String temp = String.valueOf(carr2); //char[]�迭�� ���ڿ��� ��ȯ, String ��ü�� toCharArray()�޼ҵ�� �ݴ�
		//String.valueOf �޼ҵ�� �������� �Ű����� ������ �ٷ��.(�޼ҵ� overloading)
		
		System.out.println("String.valueOf(carr2): " + String.valueOf(carr2));
		System.out.println("String.valueOf(carr2): " + temp);
	
	}

}