package koreait.day02;

public class C07_CastingTest {
	public static void main(String[] args) {
		
		int a = 123, b = 13;
		double c = 10.99;
		int isum;
		double dsum;
		
		isum = a + b;
		dsum = a + c;
		
		System.out.println("a + b = " + isum);
		System.out.println("a + c = " + dsum);
		
//		isum = a + c; ����� �Ǽ��̹Ƿ� ������ ������ �������� ���Ѵ�.
		isum = a + (int)c;
		
		System.out.println("a + (int)c = " + isum);
		
		b = 10;
		System.out.println("a / b = " + (a / b)); // �������� ������ ���� ���´�
		System.out.println("a % b = " + (a % b)); // ������ ������
		
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d\n", a, b, a % b);
		//���� ����ȯ(ĳ����) ����: �������� ������ ����� �Ǽ��� ���ϰ� �ʹٸ�
		
		b = 11;
		System.out.printf("%d / %d = %.2f\n", a, b, (double)a / b);
		
		double test = 12.3456127456789;
		System.out.println("test = " + test);
		System.out.printf("test = %f\n", test);
		System.out.printf("test = %.15f\n", test);
		
	}

}
