package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {

	public static void main(String[] args) {
		
		String message = "hi java!"; //message�� ������ ����
		
		String[] engKey = {"continue", "break", "public", "static", "dynamic"};
		
		//int, double, char �迭������ ��Ҹ� ��Ÿ���� nums[2], carr1[2], point[2] (�⺻�� ������ Ÿ��)
		//engKey �Ӹ� �ƴ϶� engKey[2] �迭��ҵ� String ������ Ÿ��
		
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i]);
		
		String[] koreans = new String[5]; //�迭����� ���� �⺻�������͸� �������� �ʰ�, �������� �����Ѵ�.
		for(int i = 0; i < koreans.length; i++) {
			System.out.println(koreans[i]); //�⺻�ʱⰪ�� null, �ƹ��͵� �������� ���� ����
		}
		
		System.out.println("1. engKey �迭��Ұ��� �����ϴ� ���ڿ��� ����");
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i] + ":" + engKey[i].length());
		
		koreans[0] = "����ϴ�";
		koreans[1] = "���ߴ�";
		koreans[2] = "������";
		
		System.out.println("1. koreans �迭��Ұ��� �����ϴ� ���ڿ��� ����");
		for(int i = 0; i < koreans.length; i++) {
			if(koreans[i] != null)
				System.out.println(koreans[i] + ":" + koreans[i].length());
		}
		//�����ϰ� �ִ� ��ü�� ���� �� �޼ҵ�/�ʵ� �����ϸ� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("static ��? >>> ");
		koreans[3] = sc.nextLine();
		System.out.println("dynamic ��? >>> ");
		koreans[4] = sc.nextLine();
		
		for(int i = 0; i < koreans.length; i++) {
			System.out.println(koreans[i]);
		}
		
		//����ڰ� �Է��� ����ܾ engKey�迭 �ε��� �������?
		System.out.print("ã�� �ܾ�� >>> ");
		String find = sc.nextLine();
		int index = -1;
		for(int i = 0; i < engKey.length; i++) {
			if(find.equals(engKey[i])) { //���ڿ� ������ Ȯ���ϴ� �޼ҵ�
				index = i;
				break;
			}
		}
		System.out.println("ã�� �ܾ� ��ġ : " + index);
		
		if(index == -1) System.out.println("ã�� �ܾ engKey�� �����ϴ�.");
		else System.out.println("ã�� �ܾ� : " + engKey[index]);

	}

}
