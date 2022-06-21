package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class C49_LottoTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 0; i < 45; i++) {
			numbers.add(i + 1); //numbers[i] 배열에 i + 1를 각각 대입
		}
		System.out.println(numbers); //toString이 재정의
		
		Random r = new Random();
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		int k; //난수로 뽑힐 값 인덱스 정한다.
		
		for(int cnt = 0; cnt < 6; cnt++) {
			k = r.nextInt(45 - cnt);
			System.out.printf("k = %d, number = %d\n", k, numbers.get(k));
			lotto.add(numbers.get(k));
			numbers.remove(k); //뽑힌 값 리스트에서 삭제
			System.out.println("남은 공");
			System.out.println(numbers);
		}
		
		System.out.println("최종선택 숫자 6개");
		System.out.println(lotto);

	}
	//배열은 저장된 값의 위치변경(삽입/삭제) 메소드가 없다. 배열은 한 번 크기가 정해지면 바꿀 수 없다(정적이다)
	//웹 프로그래밍 : 이런 부분을 ArrayList가 해결하고 웹 프로그래밍 할 때 ArrayList가 필수.

}
