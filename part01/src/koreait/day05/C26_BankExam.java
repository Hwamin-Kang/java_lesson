package koreait.day05;
//�ۼ��� ��ȭ��
import java.util.Scanner;

public class C26_BankExam {

	public static void main(String[] args) {
		//���������� ����/���/�ܰ���ȸ ����
		Scanner sc = new Scanner(System.in);
		boolean run = true; //�ݺ��� ������ ����
		int sel; //���û��� ����
		int balance = 0; //�ܰ�(�ܾ�)
		
		while(run) {
			int money; //while�� ��������. �Աݾװ� ��ݾ� ����
			System.out.println("-----------------------------------");
			System.out.println("1: ���� | 2: ��� | 3: �ܰ� Ȯ�� | 4: ����");
			System.out.println("-----------------------------------");
			System.out.print("�޴� ����: ");
			sel = sc.nextInt();
			
			switch(sel) {
			case 1: //���� ó��(���� �ݾ� �Է� -> �ܾ׿� ���ϱ�)
				System.out.print("���ݾ�: ");
				money = sc.nextInt();
				balance += money;
				System.out.println("������ �ܾ��� " + balance + "���Դϴ�.");
				break;
			case 2: //��� ó��(��ݱݾ��Է� -> �ܾ׺��� ���� ���� �� ó��(�ܾ׿��� ����))
				System.out.print("��ݾ�: ");
				money = sc.nextInt();
				if(balance < money) {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				else {
					balance -= money;
				}
			case 3: //�ܰ�(balance) ���
				System.out.println("���� �ܰ�: " + balance);
				break;
			case 4: //�ݺ� ����
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
			default:
				System.out.println("�߸��� �����Դϴ�. ���� 1~4�� �Է��ϼ���.");
				break;
			} //switch
		}//while

	}//main

}
