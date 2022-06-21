package koreait.day07;

public class C35_GlobalVar {
/*
 * [������ ����� ��ġ�� ����]
 * ��������(local variable) : �޼ҵ�, for, if, while ���{ } ���� ����� ����, ����� ����� ������ ������� ���Ѵ�.
 * ��������(global variable) : Ŭ���� ���{ }�ȿ��� ����� ����
 * 
 * [���������� static ���η� ����]
 * static �޼ҵ� : Ŭ�����̸�.������
 * static�� �ƴ� �޼ҵ� : ��ü�� ���� ����ϴ� this.������(�̶� ������ �ν��Ͻ� ����/�ʵ�)
 * ���������� Ŭ���� �Ǵ� ��ü�� Ư���� ��Ÿ�� �� �ʵ� �Ǵ� ������Ƽ��� �θ���.(field, property)
 */
	int count;
	String message;
	static int num;
	static double point;
	static final int TEST = 9999; //static final�� ���, ������ �� �ʱ�ȭ ���� ������ ����
	
	public static void main(String[] args) {//static�� static�ϰ� �����Ѵ�.
		
		int num = 10; //main method������ ����ϴ� ��������
		System.out.println("num = " + num);
//		System.out.println("message = " + message); //���� : static�� �ƴ� ������ �����Ѵ�.
		methodB();
//		methodA(); ���� : static�� �ƴ� �޼ҵ�

	}
	
	public void methodA() { //static �޼ҵ尡 �ƴϹǷ� ��ü�� ���� ����ϴ� �޼ҵ�
		int num = 99;//methodA������ ����ϴ� ��������
		System.out.println("num = " + num); //99
		System.out.println("message = " + message); //���������� ����� message
	}
	
	public void methodC(int count) {
		this.count = count; //this�� new�� ������� ��ü. methodC �޼ҵ带 �����Ű�� ��ü
	}
	
	public static void methodB() {
		int num = 77;//methodA������ ����ϴ� ��������
		System.out.println("num = " + num);
		System.out.println("num = " + C35_GlobalVar.num); //Integer.BYTES�� ���� ����
		//���������� ����� num, static �϶��� Ŭ�����̸�.������, static �ƴ� ���� this.������
	}

}
