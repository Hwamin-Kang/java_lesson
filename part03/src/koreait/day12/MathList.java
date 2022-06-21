package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//C43번 예제에서 배열을 리스트로 변경하기
public class MathList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		ArrayList<MathProblem> problems = new ArrayList<>();
		
		int size = 5; 	//문제 갯수
		int ans;		
		int cnt = 0;
		System.out.println("----------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------------------------------");
		System.out.println("시작한다.");
		
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();		//n1,n2값이 객체의 필드로 난수생성.
			System.out.printf("문제 %d. %s", (i+1), temp.problem());		
			ans = sc.nextInt();
			
			if(ans == temp.showAnswer() ) {   //정답과 비교. 맞은 갯수 count
				cnt++;		
				temp.setCorrect(true);
			}
			problems.add(temp);
		}
		System.out.println("----------------------------------------------");
		System.out.printf("채점한다. 맞은갯수 : %d, %d점\n", cnt, cnt*100/size);
		System.out.println("::::: 틀린 문제 정답 보기 :::::");

		for(int i=0;i<problems.size();i++) {
			if(!problems.get(i).isCorrect()) {
				System.out.println("문제 "+(i+1)+".  " + problems.get(i).problem() + problems.get(i).showAnswer());
				System.out.println();
			}
		}
		
		sc.close();
	}
}
