package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {
		
		char c1 = 'a';
		char c2 = 97;
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		
//		System.out.printf("c1 = %d\n", c1);
		System.out.printf("c1 = %d\n", (int)c1);
		System.out.printf("c2 = %d\n", (int)c2);
		
		c1 = (char)(c1 + 1); //덧셈 연산 가능. 연산결과 대입할 때는 casting 필요
		System.out.println("c1 = " + c1);
		
		c1++; //c1 = c1 + 1, char형에서는 casting도 한다.
		System.out.println("c1 = " + c1);
		
		//한글 문자 테스트
		char h1 = '가';
		char h2 = 44032;
		char h3 = '\uac00';
		
		System.out.println("h1 = " + h1);
		System.out.println("h2 = " + h2);
		System.out.println("h3 = " + h3);
		
		System.out.printf("h1 = %d\n", (int)h1);
		System.out.printf("h2 = %d\n", (int)h2);
		System.out.printf("h3 = %d\n", (int)h3);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		char h4 = 55203;
		char h5 = '\ud7a3';
		
		System.out.println("h4 = " + h4);
		System.out.println("h5 = " + h5);
		
		h5--;
		System.out.println("h5 = " + h5);
		System.out.println("hello");
	}
}