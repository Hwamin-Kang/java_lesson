package koreait.day16;


// 조사 하세요 : enum(열거형 타입) -> 상수만 정의한 클래스
public class Word {

	public static final int BASIC = 1; // 기초
	public static final int PREATICAL = 2; // 활용
	public static final int EXPERT = 3; // 전문가

	private String engilsh;
	private String korean;
	private int level;

	@Override
	public String toString() {
		return engilsh + " " + korean + " " + level + 
				(this.level == BASIC?"기초" : this.level == PREATICAL?"활용":"전문가" + ")");
	}

	public Word() {

	}

	public Word(String english) {
		this.engilsh = english;
	}

	public Word(String english, String korean) {
		this.engilsh = english;
		this.korean = korean;

	}

	public Word(String english, String korean, int level) {
		this.engilsh = english;
		this.korean = korean;
		this.level = level;

	}

	public String getEnglish() {
		return engilsh;
	}

	public void setEngilsh(String engilsh) {
		this.engilsh = engilsh;
	}

	public String getKorean() {
		return korean;
	}

	public void setKorean(String korean) {
		this.korean = korean;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
