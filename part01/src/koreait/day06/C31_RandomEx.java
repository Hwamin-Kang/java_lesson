package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] counts = new int[5];
		int[] koreans = new int[100];
		
		for(int i = 0; i < koreans.length; i++) {
			koreans[i] = r.nextInt(101);
		}//���� ���� ����
		
		//���� ���� count�ϱ�
		for(int i = 0; i < koreans.length; i++) {
			if(koreans[i] >= 90) {
				counts[0]++;
			}
			else if(koreans[i] >= 80) {
				counts[1]++;
			}
			else if(koreans[i] >= 70) {
				counts[2]++;
			}
			else if(koreans[i] >= 60) {
				counts[3]++;
			}
			else {
				counts[4]++;
			}
		}
		
		//���� ���� ��� ����ϱ�
		System.out.println("90~100\t80~89\t70~79\t60~69\t60�̸�");
		System.out.println("----------------------------------------------");
		for(int i = 0; i < counts.length; i++) {
			System.out.printf("%2d\t", counts[i]);
		}
		System.out.println();
		for(int i = 0; i < counts.length; i++) {
			System.out.printf("%.1f%%\t", (double)counts[i] / koreans.length * 100);
		}

	}
/*
 * �л� ���� ���� ����(����)
 * �л� �ο��� 100�� - ������ ���������� �׽�Ʈ(0 <= ���� <=100) ī��Ʈ ������ 5�� �ʿ�(cntA, cntB, cntC, cntD, cndE)
 * 90 ~ 100: 0��(0.0%) �Ҽ��� ���ڸ� counts[0]                      ��counts[5] : counts[0], count[1], count[2] ....
 * 80 ~ 89: 0��(0.0%) �Ҽ��� ���ڸ� counts[1]
 * 70 ~ 79: 0��(0.0%) �Ҽ��� ���ڸ� counts[2]
 * 60 ~ 69: 0��(0.0%) �Ҽ��� ���ڸ� counts[3]
 * 60�� �̸�: 0��(0.0%) �Ҽ��� ���ڸ�counts[4] 
 * 
 */
}
//�迭���� ����� ���(�����ͻ���, �߰�, ũ�⵵ �������� ����)�� ���� �ڹ� ArrayList
//�迭������ ���� ������ ����/������ �����մϴ�. -> �޼ҵ� ����
