package koreait.day04;

import java.util.Scanner;

public class C21_StringEx2 {
//�ۼ��� ��ȭ��
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine(); //Ű���� �Է��� ���ڿ��� ó��
		String domain = "gmail.com";
		String account;
		int idx = email.indexOf('@');
		int lastIdx = email.lastIndexOf('@');
		boolean isValid = true;
		
		System.out.print("����� �̸����� �Է��ϼ���: ");
		
		if((idx == lastIdx) && (idx != -1)) {//@�� �� �� ���ԵǾ��ִ��� Ȯ��
			account = email.substring(0, idx); //���� �̸� ����
			domain = email.substring(idx + 1, email.length());
			System.out.printf("���ڿ� ����: %d", email.length());
		}

	}//main

}
/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
 *  
 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ��(length()-1)���� substring ������ ���ڿ��� equals ��
 *  
 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
 *  
 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
 *  		�� 3���� ���ڿ��� length() �� 6���� ��
 *  
 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
 */


