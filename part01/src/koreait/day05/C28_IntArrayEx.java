package koreait.day05;

import java.util.Scanner;

//�ۼ��� ��ȭ��
public class C28_IntArrayEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("nums[%d]: ", i);
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		double avg = (double)sum / nums.length;
		
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + avg);
		System.out.println("�ִ밪: " + maxOfArray(nums));
		System.out.println("�ּҰ�: " + minOfArray(nums));
		
		sc.close();

	}
	
	public static int maxOfArray(int[] array) {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	public static int minOfArray(int[] array) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
		
	}

}
