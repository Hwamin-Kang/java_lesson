package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {

	public static void main(String[] args) {
		
		int korean, math;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� ���� �Է�: ");
		korean = sc.nextInt();
		System.out.printf("���� ���� �Է�: ");
		math = sc.nextInt();
		
		System.out.println("����л��ΰ�? " + ((korean >= 80 && math >= 80)?"�½��ϴ�!":"�ƴմϴ�.."));
		
		if(korean >= 80 && math >= 80) {
			System.out.println("�½��ϴ�!");
		}else {
			System.out.println("�ƴմϴ�..");
		}
		
		if(korean >= 90 || math >= 90) System.out.println("�¾�");
		else System.out.println("�ƴϾ�..");
		
		if(!(korean >= 20 && korean <= 80)) {
			System.out.println("ǥ������ ���� ū �����Դϴ�.!!!");
		}
		
	}

}
