package koreait.day06;

import java.util.Random;

public class C30_RandomTest {

	public static void main(String[] args) {
		//난수 발생하는 Random 클래스의 메소드를 테스트한다.
		Random r = new Random(); //Random 클래스의 객체 생성(new연산)
		
		System.out.println("1. 정수형 랜덤값 10개 출력");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(); //int범위내에서 랜덤값(난수) 만듭니다.
			System.out.println(inum);
		}
		
		System.out.println("\n1. 정수형 랜덤값 10개 출력 - bound(경계값)있음");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(100); // 0 <= 난수 < 100 범위의 랜덤값 만든다.
			System.out.println(inum);
		}//경계값은 양수값만 사용한다.
//		1 <= 난수 < 101 범위의 랜덤값 만들어야 한다면?
		System.out.println("3. 특정 범위의 랜덤값 10개 출력 - bound를 이용한 수식");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(100) + 1;
			System.out.println(inum);
		}
		//n보다 크거나 같고 m보다 작은 범위 난수: r.nextInt(m-n) + n
		
		System.out.println("4. 2~45 범위의 값으로 난수 10개"); //n = 2, m = 46
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(44) + 2;
			System.out.println(inum);
		}

	}

}
