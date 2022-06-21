package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatchTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//try ���� 
		try {
			//Exception ���ɼ��� �ִ� ����� �ۼ�. -> ������ ����� catch�� ����.
			//�� ��ġ���� ���� �����ϸ� try{}�� ��������
		} catch (NullPointerException e) { //���� ������ Exception ������ �˻��մϴ�.
			// NullPointerException �϶��� �Ƹ� ��ɵ� ó���Ѵ�.
			e.printStackTrace(); //������ �����ϱ� ���� ������ ���(���� Exception ��� ����)
		} catch (InputMismatchException e) {
			// catch�� ������ �ۼ� �����ϴ�.
		} finally { //����������, ���������� : ���� �߻� ������� ����Ǵ� �κ��̴�.
			//�ַ� �ڿ��� �����ϴ� �κ�
			
			sc.close();
		}
		
		//try ���� ��� �Ǵ� catch ���� ����� ������ ������ ��ӵȴ�.
	}

}
