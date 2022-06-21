package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2Start {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int max = 10;
		int[] triallst = new int[max];
		GameValue[] history = new GameValue[10]; //최대 10개 기록을 저장
		int k = 0; //history 배열의 인덱스
		
		System.out.println("숫자 맞추기 게임을 시작하지");
		System.out.print("게임을 시작하려면 너의 이름을 써라 : ");
		String gamer = sc.nextLine();
		int rmin = 11, rmax = 29;
		
		do {
			GameValue temp = new GameValue(gamer);
			System.out.printf("반갑다 %s 너는 평소에 삶을 소중하게 생각하지 않았지. 너의 운을 시험하겠다.\n", gamer);
			System.out.printf("나는 숫자를 결정했다. 기회는 %d번이다.\n", max);
			System.out.printf(String.format("맞춰봐라!(범위 : %d ~ %d)", rmin, rmax));
			
			int numComputer = GameValue.makeNumber(rmin, rmax); //11 ~ 29 범위의 난수 입력받아 초기화
			int numHuman;
			int i = 0;
			
			do {
				System.out.printf("생각한 숫자를 입력해라(기회 %d) : ", max - i);
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
				System.out.printf("답은 %d이다. 잘가라!\n", numComputer);
				temp.setCount(max);
			}
			else {
				System.out.printf("맞췄다... 운이 좋군...(시도횟수 %d)\n", i + 1);
				temp.setCount(i + 1);
				temp.setSuccess(true);
			}
			history[k] = temp;
			k++; //다음 인덱스값, 카운트 역할
			
			System.out.println("게임을 계속할건가? 계속하려면 0을 입력해라 : ");
		}while(sc.nextInt() == 0);
		
		System.out.println(":::::::Game Score::::::");
		//for 반복으로 history 배열에 저장된 값 출력하기
		for(int j = 0; j < k; j++)
			history[j].print(); //history[j]의 타입은 GameValue
		
		System.out.println("::::::::The End::::::::");
		
		sc.close();

	}

}
