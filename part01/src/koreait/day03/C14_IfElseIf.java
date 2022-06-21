package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money; //적립금
		int pay; //구매금액
		double rate;
		
		System.out.print("구매금액: ");
		pay = sc.nextInt();
		
		if(pay >= 100000)
			rate = 0.1;
		else if(pay >= 70000)
			rate = 0.09;
		else if(pay >= 40000)
			rate = 0.07;
		else
			rate = 0.03;
		
		money = (int)(pay * rate);
		
		System.out.printf("고객아 오늘 구매한 금액의 적립금이 %d이다. 앞으로도 많이 사거라\n", money);
		System.out.printf("적립률은 %d %%다 알겠냐?", (int)(rate * 100));
		
		sc.close();

	}

}
