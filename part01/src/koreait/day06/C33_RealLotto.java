package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//작성자 강화민
	public static void main(String[] args) {
		
		int[] numbers = new int[45]; //45개의 배열 선언
		Random r = new Random();
		
		for(int i = 0; i < 45; i++) {
			numbers[i] = i + 1; //numbers[i] 배열에 i + 1를 각각 대입
		}
		
		System.out.println("numbers 배열 초기값 --------------------------------------------------");
		System.out.println(Arrays.toString(numbers)); //numbers 배열을 문자열로 변환해서 출력
		System.out.println("------------------------------------------------------------------");
		
		int[] lotto = new int[6];//로또 값을 저장 할 int 배열 6개 선언
		int k;//k는 numbers배열의 인덱스를 무작위로 지정하는 변수
		for(int cnt = 0; cnt < 6; cnt++) { //cnt로 번호 뽑는 횟수 제어
			k = r.nextInt(45 - cnt); // numbers[k]는 이미 뽑혔으므로 빼고 생각해야 하기 때문에 cnt를 빼준다.
			System.out.println("k = " + k + ", number = " + numbers[k]);
			
			lotto[cnt] = numbers[k]; //무작위로 뽑힌 값 대입
			
			for(int i = k; i < numbers.length - 1; i++) { //인덱스 k 삭제
				numbers[i] = numbers[i + 1];
			}
			System.out.println(Arrays.toString(numbers)); //뽑힌 값을 제외하여 문자열로 출력
		}
		System.out.print("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));// 뽑힌 6개의 값 문자열로 출력

	}
	/*
	 * 배열 : 배열전체
	 * 배열요소 : 배열의 각각의 값
	 */

}
