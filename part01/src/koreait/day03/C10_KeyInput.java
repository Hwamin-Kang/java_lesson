package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //sc�� ������ �⺻�� ������ �ƴ� Ŭ���� Ÿ���� ����. -> ������ ����
		//Ű���� �Է��� ���� ���� ����. ǥ���Է����� Scanner ��ü�� ����� ���� sc�� �����Ѵ�.
		
		int data;
		
		System.out.println("������ �Է��ϼ���. -> ");
		
		data = sc.nextInt(); //����ڷκ��� Ű���� �Է��� �޾� �� ���� ������ ��ȯ�Ͽ� data ������ ����
		System.out.println("�Էµ� ����" + data + "�Դϴ�.");
		
		double point;
		System.out.println("�Ǽ��� �Է��ϼ���. -> ");
		
		point = sc.nextDouble(); //����ڷκ��� Ű���� �Է��� �޾� �� ���� �Ǽ��� ��ȯ�Ͽ� point ������ ����
		System.out.println("�Էµ� ���� " + point + " �Դϴ�.");
		

	}

}
/*
 * 	ǥ�� ��� : System.out (out, in�� System Ŭ������ ������ �ʵ��̰� �޼ҵ带 ���´�.)
 *  ǥ�� �Է� : System.in     -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
 * 						   -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	
 * 
 */