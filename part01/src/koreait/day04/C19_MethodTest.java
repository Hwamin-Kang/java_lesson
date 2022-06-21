package koreait.day04;

public class C19_MethodTest {

	public static void main(String[] args) {
		
		System.out.println("메소드를 직접 정의해서 사용하자");
		System.out.println("프로그램은 main 메소드의 명령문을 순서대로 실행하고 중간에 메소드 호출을 만나면 정의된 메소드가 실행을 위해");
		System.out.println("제어를 이동한다. 메소드 실행이 종료되면 다시 main 메소드로 제어가 돌아온다.");
		System.out.println("1.");
		methodA();//메소드 호출
		System.out.println("2.");
		methodB(11,33);
		methodB(929,111);
		System.out.println("3.");
		methodC(929,12.1);
		methodC(929,121);
		System.out.println("4.");
		methodD();
		System.out.println("return = " + methodD());//반환값을 받아서 출력
		int temp = methodD(); //반환값을 받아서 변수에 저장
		System.out.println("return = " + temp);
		System.out.println("5.");
		
		double x = methodE(5.4,9.34);
		System.out.println("결과 = " + x);
		
		System.out.println("6.");
		char res = methodF('i',4);
		System.out.println("res: " + res);
		
		char ch = 'a';
		int val = 3;
		ch = methodF(ch,val);
		System.out.println("return = " + ch);

	}
	//static인 main에서 실행할 method는 동일하게 static이어야 한다.
	public static void methodA() {
		System.out.println("첫번째 메소드 정의 연습");
	}
	
	public static void methodB(int a, int b) {
		System.out.println("두번째 메소드 정의 연습");
		System.out.println("전달받은 값 a = " + a + ", b = " + b);
	}
	
	public static void methodC(double a, double b) {
		System.out.println("세번째 메소드 정의 연습");
		System.out.println("전달받은 값 a = " + a + ", b = " + b);
	}

	public static int methodD() {
		System.out.println("네번째 메소드 정의 연습");
		return 999;
	}
	
	public static double methodE(double a, double b) {
		return a + b;
	}
	
	public static char methodF(char a, int b) {
		return (char)(a + b);
	}
}
