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
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� ����(����: -1)");
		while(k != -1) {
			System.out.print("���� �Է� >> ");
			k = sc.nextInt();
			if(k != -1) sum += k;
		}
		
		System.out.println("sum = " + sum);
		
		sum = 0;
		k = 0;
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� ����[ver2](����: -1)");
		
		do {
			sum += k;
			System.out.print("���� �Է� >>> ");
			k = sc.nextInt();
		}while(k != -1);
		
		System.out.println("sum = " + sum);
		
		
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� ����[ver2.2](����: -1)");
		
		sum = 0;
		while(true) {
			System.out.print("���� �Է� >>> ");
			k = sc.nextInt();
			
			if(k == -1) break; //�׻� ���� ��, Ż��(����) ���ǰ� break ���
			sum += k;
		}
		System.out.println("sum = " + sum);
		
		sum = 0;
		
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� ����[ver2.3](����: -1)");
		
		boolean isState = true;
		while(isState) {
			System.out.print("�����Է� >> ");
			k = sc.nextInt();
			
			if(k == -1) isState = false;
			else sum += k;
		}
		System.out.println("sum = " + sum);
		
		//�ݺ����� �Բ� ����ϴ� ��ɹ�: break, continue(���� ��ɵ� �������� �ʰ� �ݺ����� ó������ ���ư���.)
		
		sum = 0;
		
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� ����[ver2.4](����: -1)");
		
		isState = true;
		while(isState) {
			System.out.print("�����Է� >> ");
			k = sc.nextInt();
			if(k % 10 == 0) continue;
			if(k == -1) isState = false;
			else sum += k;
		}
		System.out.println("sum = " + sum);
		
		sc.close();

	}

}
