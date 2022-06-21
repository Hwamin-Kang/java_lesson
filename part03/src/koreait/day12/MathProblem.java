package koreait.day12;

import java.util.Random;

public class MathProblem {
	
	private int n1;
	private int n2;
	private char op;
	private boolean isCorrect;
	
	//static(정적) 필드
	public static final int max_size = 20;		//문제 최대갯수는 20
	
	public MathProblem(char op) { //커스텀 생성자
		this.op = op;			//인자로 전달받은 값이 연산자.
	}

	public void makeProb() {
		Random r = new Random();
		int max1=0,min1=0,max2=0,min2=0;
		switch (op) {
		case '+':		//op값 이 '+' 일때
			max1=99;max2=99;min1=11;min2=11;	//n1,n2 모두 11~99
			break;
		case '-':
			max1=99;max2=49;min1=50;min2=11;	//n1은 50~99 , n2는 11~49 : n1>n2 이 되도록.
			break;
		case '*':
			max1=77;max2=29;min1=11;min2=11;	//n1은 11~77 , n2는 11~29 : n1>n2 곱셈과정을 고려 n2를 작게
			break;
		case '/':
			max1=99;max2=29;min1=41;min2=11;	//n1은 41~99 , n2는 11~29 : n1>n2 나눗셈과정을 고려 n1를 좀더 크게
			break;
		}
		n1=r.nextInt(max1-min1+1)+min1;		//난수범위 min1~max1
		n2=r.nextInt(max2-min2+1)+min2;		//난수범위 min2~max2
	}
	
	
	public int showAnswer() {		//n1,n2,op 필드값을 가져와서 정답계산하여 반환합니다.
		int result=0;
	
		switch (op) {
		case '+':
			result=n1+n2;
			break;
		case '-':
			result=n1-n2;
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
	
	public String problem() {
		return n1 + " " + op + " " + n2 + " = ";
	}
	
	
	//getter, setter(생략가능)
	
	public int getN1() {
		return n1;
	}
	
	public int getN2() {
		return n2;
	}
	
	public char getOp() {
		return op;
	}
	
	//getter,setter 모두
	public boolean isCorrect() {
		return isCorrect;
	}
	
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	
	
}
