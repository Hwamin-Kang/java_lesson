package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;
		int[] triallst = new int[max];
		
		System.out.printf("���� ���߱� ���� �����Ѵ�. ���´� ���ڸ� �����ߴ�. ��ȸ�� %d���̴�.\n", max);
		System.out.println("������� �޸�!");
		int numComputer = r.nextInt(199) + 101; // 101 <= x <= 299
		int numHuman;
		int i = 0;
		
		do {
			System.out.printf("������ ���� �Է�(��ȸ %d) : ", max - i);
			numHuman = sc.nextInt(); //���� �Է�
			if (numComputer > numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("�ƴϴ�. �� ū ���̴�.");
			}
			else if (numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("�ƴϴ�. �� ���� ���̴�.");
			}
			if(i == max) break;
		}while(numComputer != numHuman);
		
		if(i == max) {
			System.out.println("�޸� �Է��� �� : " + Arrays.toString(triallst));
			System.out.printf("���� %d�̴�. �߰��� �޸�!\n", numComputer);
		}
		else {
			System.out.printf("�����... ���� ����... (�õ�Ƚ�� %d)\n", i + 1);
		}
		
		sc.close();

	}

}
