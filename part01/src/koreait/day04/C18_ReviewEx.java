package koreait.day04;
//�ۼ��� ��ȭ��
import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int korean, english, science;
		int total;
		int max;
		double average;
		int count = 3;
		String best;
		
		System.out.println("[���� ����: ��հ� ���� ���ϱ�]");
		System.out.println("������ �Է��Ͻÿ�");
		
		System.out.print("����: ");
		korean = sc.nextInt();
		System.out.print("����: ");
		english = sc.nextInt();
		System.out.print("����: ");
		science = sc.nextInt();
		
		total = korean + english + science;
		System.out.println("����: " + total);
		average = (double)total / count;
		System.out.printf("���: %d(%.2f), �����: %d\n", (int)average, average, count);
		
		if(korean > english) {
			best = "����";
			max = korean;
			if(korean < science) {
				best = "����";
				max = science;
			}
		}
		else{
			best = "����";
			max = english;
			if(english < science) {
				best = "����";
				max = science;
			}
		}
		
		System.out.printf("�� �л��� Ư������� %s�̰� ������ %d�Դϴ�.", best, max);

	}

}
