package koreait.day09;

import java.util.Random;

public class MathProblem {
	
	//instance field : static이 아닌 형식, 객체가 생성될 때마다 다른값을 갖는다.
	private int n1;
	private int n2;
	private char op; //+,-,*,/
	private boolean isCorrect = true;
	
	//static field
	public static final int max_size = 20; //문제 최대 갯수는 20
	
	public MathProblem(char op) { //custom constructor(커스텀 생성자)
		this.op = op; //연산자를 인자로 받는다.
	}
	
	/*
	 * static 메소드는 instance 필드값과 무관(객체와 연관된 동작이 아니다.)하게 동작하는 메소드
	 * instance method는 instance filed값과 상관있는 동작하는 메소드
	 */
	
	public void makeProb() {
		Random r = new Random();
		int max1=0,min1=0,max2=0,min2=0;
		switch (op) {
		case '+':
			max1=99;max2=99;min1=11;min2=11; //n1, n2모두 11~99
			break;
		case '-':
			max1=99;max2=49;min1=50;min2=11; //n1은 50~99, n2는 11~49 : n1 > n2
			break;
		case '*':
			max1=77;max2=29;min1=11;min2=11; //n1은 11~77, n2는 11~29 : n1 > n2 곱셈과정을 고려 n2를 작게
			break;
		case '/':
			max1=99;max2=29;min1=41;min2=11; //n1은 47~99, n2는 11~29 : n1 > n2 나눗셈 과정을 고려 n1을 좀 더 크게
			break;

		}
		n1=r.nextInt(max1-min1+1)+min1;
		n2=r.nextInt(max2-min2+1)+min2;
	}
	
	public int showAnswer() {		//n1,n2,op 필드값을 가져와서 정답계산하여 반환합니다.
		int result = 0;
	
		switch (op) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result=n1*n2;
			break;
		case '/':
			result=n1/n2;
			break;
		}
		
		return result;
	}
	
	//getter, setter
	
	public int getN1() {
		return n1;
	}
	
	public int getN2() {
		return n2;
	}
	
	public void setOp(char op) {
		this.op = op;
	}
	
	public char getOp() {
		return op;
	}
	
	public boolean isCorrect() { //getter
		return isCorrect;
	}
	
	public void setCorrect(boolean isCorrect) { //setter
		this.isCorrect = isCorrect;
	}

	

}
