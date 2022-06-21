package koreait.day08;

public class Score {
	private int korean; //private 접근한정자, 다른 클래스에서 사용하지 못한다.
	private int english;
	private int science;
	private String grade;
	
	//기본생성자 숨어있다. 접근한정자는 public
	public Score() {
		
	}
	
	void setScience(int science) {
		this.science = science;
	}
	
	int getScience() {
		return science;
	}
	
	//setter
	void setKorean(int korean) {
		this.korean = korean;
		//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장
		//this는 setKorean 메소드를 실행시키는 객체
	}
	//getter
	int getKorean() {
		return korean;
	}
	
	void setEnglish(int english) {
		this.english = english;
	}
	
	int getEnglish() {
		return english;
	}
	
	void setGrade(String grade) {
		this.grade = grade;
	}
	
	String getGrade() {
		return grade;
	}
	

}
