package koreait.day03;
//작성자 강화민
import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		int max;
		
		System.out.print("n1 >>> ");
		n1 = sc.nextInt();
		System.out.print("n2 >>> ");
		n2 = sc.nextInt();
		System.out.print("n3 >>> ");
		n3 = sc.nextInt();
		
		if(n1 > n2) {
			max = n1;
		}
		else {
			max = n2;
		}
		
		if(max < n3) {
			max = n3;
		}
		
		System.out.println("max = " + max);
		
	}

}
