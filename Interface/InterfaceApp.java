interface Calculable{ //인터페이스는 클래스 생성의 약속/규격
	double PI = 3.14; //인터페이스에 변수 정의
	int sum(int v1, int v2); //메소드를 인터페이스에 정의할 때는 내용이 들어가지 않는다.
}

interface Printable{
	void print(); //메소드를 인터페이스에 정의할 때는 내용이 들어가지 않는다.
}

class RealCal implements Calculable, Printable{
	public int sum(int v1, int v2) { //interface Calculabe 규격의 메소드 구현.
		return v1 + v2;
	}
	public void print() { //interface Printable 규격의 메소드 구현
		System.out.println("This is RealCal");
	}
	
}

class AdvancedPrint implements Printable{
	public void print() { //interface Printable 규격의 메소드 구현
		System.out.println("This is RealCal");
	}
	
}

public class InterfaceApp {

	public static void main(String[] args) {
		Printable c = new AdvancedPrint(); 
		c.print();
	}

}
