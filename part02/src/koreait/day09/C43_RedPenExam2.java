package koreait.day09;

import java.util.Scanner;

//MathProblem Ŭ������ ����ϴ� ������ �ٲٱ� : ������ ����.
public class C43_RedPenExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ans;
		int cnt = 0;
		int size = sc.nextInt();
		
		MathProblem[] problems = new MathProblem[size];//��� ���� �����ϴ� �迭, �迭�� Ÿ���� MathProblem ��ü������ : n1, n2, op, isCorrect
		
		System.out.println("-------------------------------");
		System.out.println("���ڸ� ��Ģ���� ����");
		System.out.println("-------------------------------");
		System.out.print("������ ������ �����Ͻÿ� : ");
		System.out.println("����!");
		
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+'); //op = '+';
			temp.makeProb(); //n1, n2���� ��ü�� �ʵ�� ���� ����. n1, n2��� 11~99
			System.out.printf("����%d. %d + %d = ", i + 1, temp.getN1(), temp.getN2());
			ans = sc.nextInt();
			if(ans == temp.showAnswer()) { //����� ��. ���� ���� count
				cnt++;
			}
			else {
				temp.setCorrect(false);
			}
			problems[i] = temp;
		}
		
		System.out.println("--------------ä��--------------");
		System.out.printf("�������� : %d/%d\n", cnt, size);
		
		System.out.println("Ʋ������ ���亸��");
		for(int i = 0; i < problems.length; i++) {
			if(problems[i].isCorrect() == false) {
				System.out.printf("����%d. %d + %d = %d\n",
						i + 1, problems[i].getN1(), problems[i].getN2(), problems[i].showAnswer());
			}
		}
/*		for(MathProblem temp : problems)
*			if(!temp.isCorrect())
*				System.out.println(temp.problem() + temp.showAnswer());
*/		
		sc.close();

	}

}
