package koreait.day09;

import java.util.Random;

public class MathProblem {
	
	//instance field : static�� �ƴ� ����, ��ü�� ������ ������ �ٸ����� ���´�.
	private int n1;
	private int n2;
	private char op; //+,-,*,/
	private boolean isCorrect = true;
	
	//static field
	public static final int max_size = 20; //���� �ִ� ������ 20
	
	public MathProblem(char op) { //custom constructor(Ŀ���� ������)
		this.op = op; //�����ڸ� ���ڷ� �޴´�.
	}
	
	/*
	 * static �޼ҵ�� instance �ʵ尪�� ����(��ü�� ������ ������ �ƴϴ�.)�ϰ� �����ϴ� �޼ҵ�
	 * instance method�� instance filed���� ����ִ� �����ϴ� �޼ҵ�
	 */
	
	public void makeProb() {
		Random r = new Random();
		int max1=0,min1=0,max2=0,min2=0;
		switch (op) {
		case '+':
			max1=99;max2=99;min1=11;min2=11; //n1, n2��� 11~99
			break;
		case '-':
			max1=99;max2=49;min1=50;min2=11; //n1�� 50~99, n2�� 11~49 : n1 > n2
			break;
		case '*':
			max1=77;max2=29;min1=11;min2=11; //n1�� 11~77, n2�� 11~29 : n1 > n2 ���������� ��� n2�� �۰�
			break;
		case '/':
			max1=99;max2=29;min1=41;min2=11; //n1�� 47~99, n2�� 11~29 : n1 > n2 ������ ������ ��� n1�� �� �� ũ��
			break;

		}
		n1=r.nextInt(max1-min1+1)+min1;
		n2=r.nextInt(max2-min2+1)+min2;
	}
	
	public int showAnswer() {		//n1,n2,op �ʵ尪�� �����ͼ� �������Ͽ� ��ȯ�մϴ�.
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
