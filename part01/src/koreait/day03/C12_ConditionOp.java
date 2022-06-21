package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {

	public static void main(String[] args) {
		
		int korean, math;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("국어 점수 입력: ");
		korean = sc.nextInt();
		System.out.printf("수학 점수 입력: ");
		math = sc.nextInt();
		
		System.out.println("모범학생인가? " + ((korean >= 80 && math >= 80)?"맞습니다!":"아닙니다.."));
		
		if(korean >= 80 && math >= 80) {
			System.out.println("맞습니다!");
		}else {
			System.out.println("아닙니다..");
		}
		
		if(korean >= 90 || math >= 90) System.out.println("맞아");
		else System.out.println("아니야..");
		
		if(!(korean >= 20 && korean <= 80)) {
			System.out.println("표준편차 값이 큰 점수입니다.!!!");
		}
		
	}

}
