package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//C43�� �������� �迭�� ����Ʈ�� �����ϱ�
public class MathList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		ArrayList<MathProblem> problems = new ArrayList<>();
		
		int size = 5; 	//���� ����
		int ans;		
		int cnt = 0;
		System.out.println("----------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("----------------------------------------------");
		System.out.println("�����Ѵ�.");
		
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();		//n1,n2���� ��ü�� �ʵ�� ��������.
			System.out.printf("���� %d. %s", (i+1), temp.problem());		
			ans = sc.nextInt();
			
			if(ans == temp.showAnswer() ) {   //����� ��. ���� ���� count
				cnt++;		
				temp.setCorrect(true);
			}
			problems.add(temp);
		}
		System.out.println("----------------------------------------------");
		System.out.printf("ä���Ѵ�. �������� : %d, %d��\n", cnt, cnt*100/size);
		System.out.println("::::: Ʋ�� ���� ���� ���� :::::");

		for(int i=0;i<problems.size();i++) {
			if(!problems.get(i).isCorrect()) {
				System.out.println("���� "+(i+1)+".  " + problems.get(i).problem() + problems.get(i).showAnswer());
				System.out.println();
			}
		}
		
		sc.close();
	}
}
