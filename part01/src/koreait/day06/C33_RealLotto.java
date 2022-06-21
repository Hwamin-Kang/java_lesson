package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//�ۼ��� ��ȭ��
	public static void main(String[] args) {
		
		int[] numbers = new int[45]; //45���� �迭 ����
		Random r = new Random();
		
		for(int i = 0; i < 45; i++) {
			numbers[i] = i + 1; //numbers[i] �迭�� i + 1�� ���� ����
		}
		
		System.out.println("numbers �迭 �ʱⰪ --------------------------------------------------");
		System.out.println(Arrays.toString(numbers)); //numbers �迭�� ���ڿ��� ��ȯ�ؼ� ���
		System.out.println("------------------------------------------------------------------");
		
		int[] lotto = new int[6];//�ζ� ���� ���� �� int �迭 6�� ����
		int k;//k�� numbers�迭�� �ε����� �������� �����ϴ� ����
		for(int cnt = 0; cnt < 6; cnt++) { //cnt�� ��ȣ �̴� Ƚ�� ����
			k = r.nextInt(45 - cnt); // numbers[k]�� �̹� �������Ƿ� ���� �����ؾ� �ϱ� ������ cnt�� ���ش�.
			System.out.println("k = " + k + ", number = " + numbers[k]);
			
			lotto[cnt] = numbers[k]; //�������� ���� �� ����
			
			for(int i = k; i < numbers.length - 1; i++) { //�ε��� k ����
				numbers[i] = numbers[i + 1];
			}
			System.out.println(Arrays.toString(numbers)); //���� ���� �����Ͽ� ���ڿ��� ���
		}
		System.out.print("���� ���� ���� : ");
		System.out.println(Arrays.toString(lotto));// ���� 6���� �� ���ڿ��� ���

	}
	/*
	 * �迭 : �迭��ü
	 * �迭��� : �迭�� ������ ��
	 */

}
