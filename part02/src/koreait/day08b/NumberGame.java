package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;
		int[] triallst = new int[max];
		
		System.out.printf("숫자 맞추기 게임 시작한다. 본좌는 숫자를 결정했다. 기회는 %d번이다.\n", max);
		System.out.println("맞춰봐라 휴먼!");
		int numComputer = r.nextInt(199) + 101; // 101 <= x <= 299
		int numHuman;
		int i = 0;
		
		do {
			System.out.printf("생각한 숫자 입력(기회 %d) : ", max - i);
			numHuman = sc.nextInt(); //숫자 입력
			if (numComputer > numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아니다. 더 큰 값이다.");
			}
			else if (numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아니다. 더 작은 값이다.");
			}
			if(i == max) break;
		}while(numComputer != numHuman);
		
		if(i == max) {
			System.out.println("휴먼 입력한 값 : " + Arrays.toString(triallst));
			System.out.printf("답은 %d이다. 잘가라 휴먼!\n", numComputer);
		}
		else {
			System.out.printf("맞췄다... 운이 좋군... (시도횟수 %d)\n", i + 1);
		}
		
		sc.close();

	}

}
