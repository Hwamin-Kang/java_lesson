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
		
//		isum = a + c; 결과가 실수이므로 정수형 변수에 저장하지 못한다.
		isum = a + (int)c;
		
		System.out.println("a + (int)c = " + isum);
		
		b = 10;
		System.out.println("a / b = " + (a / b)); // 정수끼리 나누면 몫이 나온다
		System.out.println("a % b = " + (a % b)); // 나머지 연산자
		
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d\n", a, b, a % b);
		//강제 형변환(캐스팅) 예시: 정수끼리 나눗셈 결과를 실수로 구하고 싶다면
		
		b = 11;
		System.out.printf("%d / %d = %.2f\n", a, b, (double)a / b);
		
		double test = 12.3456127456789;
		System.out.println("test = " + test);
		System.out.printf("test = %f\n", test);
		System.out.printf("test = %.15f\n", test);
		
	}

}
