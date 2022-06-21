package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2Start {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int max = 10;
		int[] triallst = new int[max];
		GameValue[] history = new GameValue[10]; //�ִ� 10�� ����� ����
		int k = 0; //history �迭�� �ε���
		
		System.out.println("���� ���߱� ������ ��������");
		System.out.print("������ �����Ϸ��� ���� �̸��� ��� : ");
		String gamer = sc.nextLine();
		int rmin = 11, rmax = 29;
		
		do {
			GameValue temp = new GameValue(gamer);
			System.out.printf("�ݰ��� %s �ʴ� ��ҿ� ���� �����ϰ� �������� �ʾ���. ���� ���� �����ϰڴ�.\n", gamer);
			System.out.printf("���� ���ڸ� �����ߴ�. ��ȸ�� %d���̴�.\n", max);
			System.out.printf(String.format("�������!(���� : %d ~ %d)", rmin, rmax));
			
			int numComputer = GameValue.makeNumber(rmin, rmax); //11 ~ 29 ������ ���� �Է¹޾� �ʱ�ȭ
			int numHuman;
			int i = 0;
			
			do {
				System.out.printf("������ ���ڸ� �Է��ض�(��ȸ %d) : ", max - i);
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
				System.out.printf("���� %d�̴�. �߰���!\n", numComputer);
				temp.setCount(max);
			}
			else {
				System.out.printf("�����... ���� ����...(�õ�Ƚ�� %d)\n", i + 1);
				temp.setCount(i + 1);
				temp.setSuccess(true);
			}
			history[k] = temp;
			k++; //���� �ε�����, ī��Ʈ ����
			
			System.out.println("������ ����Ұǰ�? ����Ϸ��� 0�� �Է��ض� : ");
		}while(sc.nextInt() == 0);
		
		System.out.println(":::::::Game Score::::::");
		//for �ݺ����� history �迭�� ����� �� ����ϱ�
		for(int j = 0; j < k; j++)
			history[j].print(); //history[j]�� Ÿ���� GameValue
		
		System.out.println("::::::::The End::::::::");
		
		sc.close();

	}

}
