package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		
		//Ŭ������ ����Ʈ�� �ٲ㼭 ���蹮���� �´�.
		//���Ϸ� ������ ����
//		HashMap<String, String> voca = new HashMap<>();
		TreeMap<String, String> voca = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		String choice;
		String english, korean, search, res;
		boolean run = true;
		
		System.out.printf("���� : 1.�ܾ�����   2.�ܾ�˻�   3.�ܾ��庸��   4.������\n");
		
		while(run) {
			System.out.print("���� : ");
			choice = sc.nextLine();
			switch(choice){
			case "1":
				System.out.print("English : ");
				english = sc.nextLine();
				System.out.print("Korean : ");
				korean = sc.nextLine();
				voca.put(english, korean);
				break;
			case "2":
				System.out.print("�˻��ܾ� : ");
				search = sc.nextLine();
				res = voca.get(search);
				System.out.printf("�˻��߽��ϴ�. ��� : %s\n", res);
				break;
			case "3":
				System.out.println(voca);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("�߸��� �Է°��Դϴ�. �ٽ� �Է��ϼ���.");
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
