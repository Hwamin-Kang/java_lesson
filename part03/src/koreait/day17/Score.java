package koreait.day17;

public class Score {
	
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;
	
	
	public Score() {
		
	}
	
	public Score(String name, int korean, int english, int science) { //Score 생성자는 4개의 인자를 받아서 필드값들을 초기화시킨다.
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.science = science;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
				+ ", grade=" + getGrade() + "]";
	}
	
	//인스턴스 메소드
	public int sum() {
		int result = this.korean + this.english + this.science;
		return result;
	}
	
	public double average() {
		return (double)sum() / 3;
	}
	
	//setter를 변경하기 : 실행내용, 필요에 따라서 접근 제어자를 private로 할 수도 있다.
	public void setGrade() {
		if(average() >= 90) this.grade = "A";
		else if(average() >= 80) this.grade = "B";
		else if(average() >= 70) this.grade = "C";
		else if(average() >= 60) this.grade = "D";
		else this.grade = "F";
	}
	
	String getGrade() {
		setGrade();
		return grade;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	

}
