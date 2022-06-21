package koreait.day05;
//작성자 강화민
import java.util.Scanner;

public class C26_BankExam {

	public static void main(String[] args) {
		//가상은행의 예금/출금/잔고조회 실행
		Scanner sc = new Scanner(System.in);
		boolean run = true; //반복을 제어할 변수
		int sel; //선택사항 저장
		int balance = 0; //잔고(잔액)
		
		while(run) {
			int money; //while문 지역변수. 입금액과 출금액 저장
			System.out.println("-----------------------------------");
			System.out.println("1: 예금 | 2: 출금 | 3: 잔고 확인 | 4: 종료");
			System.out.println("-----------------------------------");
			System.out.print("메뉴 선택: ");
			sel = sc.nextInt();
			
			switch(sel) {
			case 1: //예금 처리(예금 금액 입력 -> 잔액에 더하기)
				System.out.print("예금액: ");
				money = sc.nextInt();
				balance += money;
				System.out.println("고객님의 잔액은 " + balance + "원입니다.");
				break;
			case 2: //출금 처리(출금금액입력 -> 잔액보다 많지 않을 때 처리(잔액에서 뺴기))
				System.out.print("출금액: ");
				money = sc.nextInt();
				if(balance < money) {
					System.out.println("잔액이 부족합니다.");
				}
				else {
					balance -= money;
				}
			case 3: //잔고(balance) 출력
				System.out.println("현재 잔고: " + balance);
				break;
			case 4: //반복 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못된 선택입니다. 값은 1~4만 입력하세요.");
				break;
			} //switch
		}//while

	}//main

}
