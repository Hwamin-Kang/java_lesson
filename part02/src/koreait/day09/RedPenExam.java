package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class RedPenExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5; //문제 갯수
		int[] x1 = new int[size]; //모든 문제 피연산자1을 저장할 배열
		int[] x2 = new int[size];//모든 문제 피연산자2을 저장할 배열
		int[] answer = new int[size]; //사용자가 입력한 답을 저장할 배열
		int cnt = 0;
		
		System.out.println("----------------------------");
		System.out.println("두자리 덧셈 풀기");
		System.out.println("----------------------------");
		System.out.println("시작");
		
		for(int i = 0; i < x1.length; i++) {
			x1[i] = r.nextInt(89) + 11; //11~99
			x2[i] = r.nextInt(89) + 11;
			System.out.println(String.format("문제 %2d. %d + %d = ", i + 1, x1[i], x2[i]));
			
			answer[i] = sc.nextInt();
			if(answer[i] == x1[i] + x2[i]) {
				cnt++;
			}
		}
		
		System.out.println("----------------------------");
		System.out.println("채점한다. 맞은갯수 : " + cnt + "개 (" + cnt*100 / size + "점)");
		System.out.println("틀린문제 정답보기");
		for(int i = 0; i < x1.length; i++) {
			if(answer[i] != x1[i] + x2[i]) {
				System.out.println(String.format("문제 %2d. %d + %d = %3d", i + 1, x1[i], x2[i], x1[i] + x2[i]));
			}
		}
		
		sc.close();

	}

}
