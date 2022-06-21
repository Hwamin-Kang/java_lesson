package koreait.day04;
//작성자 강화민
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
		
		System.out.println("[성적 집계: 평균과 총점 구하기]");
		System.out.println("성적을 입력하시오");
		
		System.out.print("국어: ");
		korean = sc.nextInt();
		System.out.print("영어: ");
		english = sc.nextInt();
		System.out.print("과학: ");
		science = sc.nextInt();
		
		total = korean + english + science;
		System.out.println("총점: " + total);
		average = (double)total / count;
		System.out.printf("평균: %d(%.2f), 과목수: %d\n", (int)average, average, count);
		
		if(korean > english) {
			best = "국어";
			max = korean;
			if(korean < science) {
				best = "과학";
				max = science;
			}
		}
		else{
			best = "영어";
			max = english;
			if(english < science) {
				best = "과학";
				max = science;
			}
		}
		
		System.out.printf("이 학생의 특기과목은 %s이고 점수는 %d입니다.", best, max);

	}

}
