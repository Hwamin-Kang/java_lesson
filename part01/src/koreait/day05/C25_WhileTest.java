package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		
		int j = 0;
		while(j < 5) {
			System.out.println("hello!(" + (j + 1) + ")");
			j++;
		}
		
		int k = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기(종료: -1)");
		while(k != -1) {
			System.out.print("정수 입력 >> ");
			k = sc.nextInt();
			if(k != -1) sum += k;
		}
		
		System.out.println("sum = " + sum);
		
		sum = 0;
		k = 0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기[ver2](종료: -1)");
		
		do {
			sum += k;
			System.out.print("정수 입력 >>> ");
			k = sc.nextInt();
		}while(k != -1);
		
		System.out.println("sum = " + sum);
		
		
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기[ver2.2](종료: -1)");
		
		sum = 0;
		while(true) {
			System.out.print("정수 입력 >>> ");
			k = sc.nextInt();
			
			if(k == -1) break; //항상 참일 때, 탈출(종료) 조건과 break 사용
			sum += k;
		}
		System.out.println("sum = " + sum);
		
		sum = 0;
		
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기[ver2.3](종료: -1)");
		
		boolean isState = true;
		while(isState) {
			System.out.print("정수입력 >> ");
			k = sc.nextInt();
			
			if(k == -1) isState = false;
			else sum += k;
		}
		System.out.println("sum = " + sum);
		
		//반복문과 함께 사용하는 명령문: break, continue(뒤의 명령들 실행하지 않고 반복문의 처음으로 돌아간다.)
		
		sum = 0;
		
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기[ver2.4](종료: -1)");
		
		isState = true;
		while(isState) {
			System.out.print("정수입력 >> ");
			k = sc.nextInt();
			if(k % 10 == 0) continue;
			if(k == -1) isState = false;
			else sum += k;
		}
		System.out.println("sum = " + sum);
		
		sc.close();

	}

}
