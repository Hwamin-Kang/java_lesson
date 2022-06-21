package koreait.day02;

public class C03_IntegerData {
	
	public static void main(String[] args) {
		System.out.println("Byte ���� ������ ----------------");
		System.out.println("�޸��� ũ��: " + Byte.BYTES);
		System.out.println("Byte ������ �ּҰ�: " + Byte.MIN_VALUE);
		System.out.println("Byte ������ �ִ밪: " + Byte.MAX_VALUE);
		
		System.out.println("Short ���� ������ ----------------");
		System.out.println("�޸��� ũ��: " + Short.BYTES);
		System.out.println("Short ������ �ּҰ�: " + Short.MIN_VALUE);
		System.out.println("Short ������ �ִ밪: " + Short.MAX_VALUE);
		
		System.out.println("Integer ���� ������ ----------------");
		System.out.println("�޸��� ũ��: " + Integer.BYTES);
		System.out.println("Integer ������ �ּҰ�: " + Integer.MIN_VALUE);
		System.out.println("Integer ������ �ִ밪: " + Integer.MAX_VALUE);
		
		System.out.println("Long ���� ������ ----------------");
		System.out.println("�޸��� ũ��: " + Long.BYTES);
		System.out.println("Long ������ �ּҰ�: " + Long.MIN_VALUE);
		System.out.println("Long ������ �ִ밪: " + Long.MAX_VALUE);
	}
}
/* ���� ������ �⺻ ������  byte, short, int, long 4���� �̸� 
 * 				�� ���� �޸𸮿� �Ҵ�޴� ũ��(����Ʈ ����)�� �׿� ���� ���� ���� ������ �����˴ϴ�.
 *              �� ������ ������ �� ����� Ű����(�����; �뵵�� ������ �ܾ�)
 * Byte, Short, Integer, Long Ŭ������ ���� ������ ���ĸ� �ٷ�� �Ӽ��� �޼ҵ带 ���� Ŭ�����Դϴ�.(Wrapper ���� Ŭ����)
 *		�� ������ �� Ŭ�������� ��������� �Ӽ�(�ʵ�)�� �� ������ �ʴ°�(���) �Դϴ�. ��ü�� �빮�ڷ� ǥ���մϴ�.
			�� BYTES, MIN_VALUE, MAX_VALUE
 *	123, 200 �� int �����Դϴ�.			
 */
