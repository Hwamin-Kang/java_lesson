package koreait.day04;

public class C19_MethodTest {

	public static void main(String[] args) {
		
		System.out.println("�޼ҵ带 ���� �����ؼ� �������");
		System.out.println("���α׷��� main �޼ҵ��� ��ɹ��� ������� �����ϰ� �߰��� �޼ҵ� ȣ���� ������ ���ǵ� �޼ҵ尡 ������ ����");
		System.out.println("��� �̵��Ѵ�. �޼ҵ� ������ ����Ǹ� �ٽ� main �޼ҵ�� ��� ���ƿ´�.");
		System.out.println("1.");
		methodA();//�޼ҵ� ȣ��
		System.out.println("2.");
		methodB(11,33);
		methodB(929,111);
		System.out.println("3.");
		methodC(929,12.1);
		methodC(929,121);
		System.out.println("4.");
		methodD();
		System.out.println("return = " + methodD());//��ȯ���� �޾Ƽ� ���
		int temp = methodD(); //��ȯ���� �޾Ƽ� ������ ����
		System.out.println("return = " + temp);
		System.out.println("5.");
		
		double x = methodE(5.4,9.34);
		System.out.println("��� = " + x);
		
		System.out.println("6.");
		char res = methodF('i',4);
		System.out.println("res: " + res);
		
		char ch = 'a';
		int val = 3;
		ch = methodF(ch,val);
		System.out.println("return = " + ch);

	}
	//static�� main���� ������ method�� �����ϰ� static�̾�� �Ѵ�.
	public static void methodA() {
		System.out.println("ù��° �޼ҵ� ���� ����");
	}
	
	public static void methodB(int a, int b) {
		System.out.println("�ι�° �޼ҵ� ���� ����");
		System.out.println("���޹��� �� a = " + a + ", b = " + b);
	}
	
	public static void methodC(double a, double b) {
		System.out.println("����° �޼ҵ� ���� ����");
		System.out.println("���޹��� �� a = " + a + ", b = " + b);
	}

	public static int methodD() {
		System.out.println("�׹�° �޼ҵ� ���� ����");
		return 999;
	}
	
	public static double methodE(double a, double b) {
		return a + b;
	}
	
	public static char methodF(char a, int b) {
		return (char)(a + b);
	}
}
