package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		int width = 23; //�簢���� ����
		int height = 19; //�簢���� ����
		int boxArea = width * height; //�簢���� ����
		
		System.out.println("[�簢�� ������ ���� ���ϱ�]");
		System.out.println("����: " + width + "cm");
		System.out.println("����: " + height + "cm");
		System.out.println("���̸� ���߽��ϴ�. -> " + boxArea + "��\n");
		
		double radius = 23.230; //���� ������
		double pi = 3.14; //������
		double c = 2 * pi * radius; //���� �ѷ�
		double circleArea = pi * radius * radius; //���� ����
		
		System.out.println("[�� ������ ���̿� �ѷ� ���ϱ�]");
		System.out.printf("������: %.2fcm\n", radius);
		System.out.printf("�ѷ��� ���߽��ϴ�. -> %.3fcm\n", c);
		System.out.printf("���̸� ���߽��ϴ�. -> %.3f��\n", circleArea);
		
		//finalTest
		final int test = 123;
		System.out.println("test = " + test);
	}

}
