package koreait.day07;

import java.util.Scanner;

//C40
public class Score {
	
	int korean;
	int english;
	int science;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 >>> "); this.korean = sc.nextInt();
		System.out.println("영어 >>> "); this.english = sc.nextInt();
		System.out.println("과학 >>> "); this.science = sc.nextInt();
	}
	
	int sum() {
		return (korean + english + science);
	}
	
	double average() {
		return (double)sum() / 3;
	}

	@Override
	public String toString() {
		return "[korean=" + korean + ", english=" + english + ", science=" + science + "]";
	}
	
	

}
