package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int width; //�簢���� ����
		int height; //�簢���� ����
		
		System.out.println("[�簢�� ������ ���� ���ϱ�]");
		System.out.println("�簢���� ���� ���� �Է�");
		width = sc.nextInt();
		System.out.println("�簢���� ���� ���� �Է�");
		height = sc.nextInt();
		int boxArea = width * height; //�簢���� ����
		
		System.out.println("����: " + width + "cm");
		System.out.println("����: " + height + "cm");
		System.out.println("�簢�� ����: " + boxArea + "��\n");
		
		double radius; //���� ������
		double pi = 3.14; //������
		
		System.out.println("[�� ������ ���̿� �ѷ� ���ϱ�]");
		System.out.println("���� ������ �Է�");
		radius = sc.nextDouble();
		
		double c = 2 * pi * radius; //���� �ѷ�
		double circleArea = pi * radius * radius; //���� ����
		
		System.out.println("[�� ������ ���̿� �ѷ� ���ϱ�]");
		System.out.printf("������: %.2fcm\n", radius);
		System.out.printf("�ѷ��� ���߽��ϴ�. -> %.3fcm\n", c);
		System.out.printf("���̸� ���߽��ϴ�. -> %.3f��\n", circleArea);
		
		sc.close();
	}

}
