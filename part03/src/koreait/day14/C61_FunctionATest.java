package koreait.day14;

import java.util.Random;

public class C61_FunctionATest {

	public static void main(String[] args) {
		
		//1) 익명클래스 : 추상메소드의 개수 상관없다.
		FunctionA fa = new FunctionA() {
			@Override
			public int methodA(int a, int b) {
				return a * b;
			}
		};
		
		//2) 람다식 : 추상메소드가 1개일 때만 가능하다. 즉, 함수형 인터페이스만 표현이 가능하다.
		fa = (int a, int b) -> {
			System.out.println("a + b = ");
			return a + b;
		};
		
		System.out.println(fa.methodA(23, 11));
		
		fa = (int max, int min) -> {
			Random r = new Random();
			return r.nextInt(max - min + 1) + min;
			
		};
		System.out.println(fa.methodA(99, 11));

	}

}
