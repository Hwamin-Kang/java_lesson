package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		int max, min;
		
		System.out.println("정수 n1, n2, n3값을 입력하시오");
		System.out.printf("n1: ");
		n1 = sc.nextInt();
		System.out.printf("n2: ");
		n2 = sc.nextInt();
		System.out.printf("n3: ");
		n3 = sc.nextInt();	
		
		if(n1 > n2) {
			max = n1;
			min = n2;
		}
		else {
			max = n2;
			min = n1;
		}
		
		if(max < n3) {
			max = n3;
		}
		
		if(min > n3) {
			min = n3;
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		sc.close();
	}

}
