package koreait.day05;

import java.util.Scanner;

public class C24_StartPrint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[��ȭ���� �ı�]");
		System.out.print("������ ���� �ֽðڽ��ϱ�? (1 ~ 5) >>> ");
		int count = sc.nextInt();
		
		System.out.println("��� 1");
		for(int i = 0; i < count; i++) {
			System.out.print("��");
		}
		System.out.printf("\n\n");
		
		System.out.println("��� 2");
		for(int j = 0; j < count; j++) {
			System.out.print("��");
		}
		for(int k = 0; k < 5 - count; k++) {
			System.out.print("��");
		}
		
		System.out.printf("\n\n��� 3\n");
		
		for(int i = 0; i < 5; i++) {
			if(i < count)
				System.out.print("��");
			else
				System.out.print("��");
		}
		
		System.out.printf("\n\n��� 4\n");
		
		int k;
		for(k = 0; k < count; k++) {
			System.out.print("��");
		}

		for(; k < 5; k++) {
			System.out.print("��");
		}
	}

}
