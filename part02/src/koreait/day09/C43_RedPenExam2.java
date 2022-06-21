package koreait.day09;

import java.util.Scanner;

//MathProblem 클래스를 사용하는 것으로 바꾸기 : 연산은 덧셈.
public class C43_RedPenExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ans;
		int cnt = 0;
		int size = sc.nextInt();
		
		MathProblem[] problems = new MathProblem[size];//모든 문제 저장하는 배열, 배열의 타입은 MathProblem 객체참조형 : n1, n2, op, isCorrect
		
		System.out.println("-------------------------------");
		System.out.println("두자리 사칙연산 계산기");
		System.out.println("-------------------------------");
		System.out.print("문제의 갯수를 선택하시오 : ");
		System.out.println("시작!");
		
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+'); //op = '+';
			temp.makeProb(); //n1, n2값이 객체의 필드로 난수 생성. n1, n2모두 11~99
			System.out.printf("문제%d. %d + %d = ", i + 1, temp.getN1(), temp.getN2());
			ans = sc.nextInt();
			if(ans == temp.showAnswer()) { //정답과 비교. 맞은 갯수 count
				cnt++;
			}
			else {
				temp.setCorrect(false);
			}
			problems[i] = temp;
		}
		
		System.out.println("--------------채점--------------");
		System.out.printf("맞은갯수 : %d/%d\n", cnt, size);
		
		System.out.println("틀린문제 정답보기");
		for(int i = 0; i < problems.length; i++) {
			if(problems[i].isCorrect() == false) {
				System.out.printf("문제%d. %d + %d = %d\n",
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
